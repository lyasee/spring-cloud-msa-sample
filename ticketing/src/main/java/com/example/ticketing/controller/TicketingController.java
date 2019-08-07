package com.example.ticketing.controller;

import com.example.ticketing.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketingController {

    @Autowired
    private MovieService movieService;

    @GetMapping("tickets")
    public String getTicket() {
        return movieService.getMovieName() + " ticket !";
    }
}
