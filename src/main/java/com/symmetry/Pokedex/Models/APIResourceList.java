package com.symmetry.Pokedex.Models;

import java.io.Serializable;
import java.util.List;

public class APIResourceList implements Serializable {
    // The total number of resources available from this API.
    private int count;
    // The URL for the next page in the list.
    private String next;
    // The URL for the previous page in the list.
    private String previous;
    // A list of named API resources.
    private List<Result> results;

    public APIResourceList() {
    }

    public APIResourceList(String count, String next, String previous, List<Result> results) {
        try {
            this.count = Integer.parseInt(count);
        }catch (NumberFormatException e){
            System.out.println("not a number");
        }
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public void setCount(String count) {
        try {
            this.count = Integer.parseInt(count);
        }catch (NumberFormatException e){
            System.out.println("not a number");
        }
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
