# Pokedex

Symmetry Pokemon API

The Pokedex Web Service is a data pipeline that calls the Pokemon API and streams/persists the data into an ElasticSearch index. 

The Pokedex Web Service has been implemented using Spring Framework which provides dependency injection approach encourages writing testable code, integration with the Elasticsearch search engine and integrates well with Pokemon POJO model through Spring Data ElasticSearch, and abstractions of the Spring Data platform to Redis for data caching through Spring Data Redis.


## Prerequisites

- Java 11+
- Docker
- Docker-Compose

## Start Environment

Open a terminal and inside Pokedex root folder run

docker-compose up --build
elasticsearch and redis containers are loaded first, so it takes a little time when you run it for the first time.





