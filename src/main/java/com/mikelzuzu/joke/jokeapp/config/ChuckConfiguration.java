package com.mikelzuzu.joke.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfiguration {

    @Bean
    public ChuckNorrisQuotes ChuckConfiguration() {
        return new ChuckNorrisQuotes();
    }
}
