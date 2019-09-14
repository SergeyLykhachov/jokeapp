package com.slykhachov.joke.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConiguration {

    @Bean
    public ChuckNorrisQuotes getQuotes() {
        return new ChuckNorrisQuotes();
    }
}
