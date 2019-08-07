package com.example.ticketing.service;

import com.example.ticketing.api.MovieClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private MovieClient movieClient;

    public MovieService(MovieClient movieClient) {
        this.movieClient = movieClient;
    }

    @HystrixCommand(fallbackMethod = "getDefaultAllMovie")
    public String getMovieName() {
        return movieClient.getMovieName();
    }

    public String getDefaultAllMovie() {
        return "fallback";
    }
}
