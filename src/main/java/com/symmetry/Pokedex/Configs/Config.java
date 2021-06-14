package com.symmetry.Pokedex.Configs;


import com.symmetry.Pokedex.Entities.Pokemon;
import org.elasticsearch.client.RestHighLevelClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;



@Configuration
@EnableElasticsearchRepositories(basePackages = "com.symmetry.Pokedex.Repositories")
@ComponentScan(basePackages = { "com.symmetry.Pokedex.Service" })
public class Config {
    Logger logger = LoggerFactory.getLogger(Config.class);
    @Value("${elasticsearch.host}")
    public String esHost;
    @Value("${elasticsearch.port}")
    public int esPort;
    @Value("${redis.host}")
    public String redisHost;
    @Value("${redis.port}")
    public int redisPort;

    public String getEsHost() {
        return esHost;
    }
    public int getEsPort() {
        return esPort;
    }
    public String getRedisHost() {
        return redisHost;
    }
    public int getRedisPort() {
        return redisPort;
    }

    @Bean
    public RestHighLevelClient client() {
        try {
            ClientConfiguration clientConfiguration
                    = ClientConfiguration.builder()
                    .connectedTo(getEsHost()+":"+getEsPort())
                    .build();
            return RestClients.create(clientConfiguration).rest();
        } catch (Exception e) {
            logger.error(String.valueOf(e));
        }
        return null;
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchRestTemplate(client());
    }

    @Bean
    public JedisConnectionFactory redisConnectionFactory() {
        JedisConnectionFactory jedisConnectionFactory = null;

        try {
            RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration(getRedisHost(),
                    getRedisPort());
            jedisConnectionFactory = new JedisConnectionFactory(redisStandaloneConfiguration);
            jedisConnectionFactory.getPoolConfig().setMaxTotal(50);
            jedisConnectionFactory.getPoolConfig().setMaxIdle(50);
            return jedisConnectionFactory;
        } catch (RedisConnectionFailureException e) {
            logger.error(String.valueOf(e));
        }

        return null;
    }
    @Bean
    public RedisTemplate<String, Pokemon> redisTemplate(){
        final RedisTemplate<String, Pokemon> template = new RedisTemplate<String, Pokemon>();
        template.setConnectionFactory(redisConnectionFactory());
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        template.setKeySerializer(new StringRedisSerializer());
        return template;
    }

}
