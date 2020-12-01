package com.practice.ChuckNorrisJokeApp.controller;

import com.practice.ChuckNorrisJokeApp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JokesController {
    private JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public String Joke(){
        return jokeService.getJokes();
    }
}
