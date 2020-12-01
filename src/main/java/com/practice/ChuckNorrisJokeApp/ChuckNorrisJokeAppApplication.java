package com.practice.ChuckNorrisJokeApp;

import com.practice.ChuckNorrisJokeApp.controller.JokesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChuckNorrisJokeAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ChuckNorrisJokeAppApplication.class, args);
		JokesController jokesController = (JokesController) ctx.getBean("jokesController");
		System.out.println(jokesController.Joke());

	}

}
