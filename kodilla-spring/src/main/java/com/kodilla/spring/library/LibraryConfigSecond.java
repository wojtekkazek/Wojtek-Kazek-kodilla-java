package com.kodilla.spring.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfigSecond {
    @Bean
    public LibrarySecond library() {
        return new LibrarySecond(libraryDbController());
    }

    @Bean
    public LibraryDbControllerSecond libraryDbController() {
        return new LibraryDbControllerSecond();
    }
}