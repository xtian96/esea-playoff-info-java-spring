package com.example.demo.teams;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TeamConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            TeamRepository repository){
        return args -> {
            Team wompusLompus = new Team(
                    12,
                    4,
                    240,
                    180,
                    "Main",
                    "WompusLompus");

            Team compusLompus = new Team(
                    12,
                    4,
                    240,
                    180,
                    "Main",
                    "CompusLompus");


        repository.saveAll(
                List.of(wompusLompus,compusLompus)
            );
        };
    }

}
