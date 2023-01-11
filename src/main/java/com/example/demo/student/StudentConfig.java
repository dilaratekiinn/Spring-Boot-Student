package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return  args -> {
            Student Dilara = new Student(
                    1L,
                    "dilara",
                    "dilara-tekin2000@hotmail.com",
                    LocalDate.of(2000, JANUARY, 5)


            );

            Student Ahmet = new Student(
                      "Ahmet",
                    "Ahmet2000@hotmail.com",
                    LocalDate.of(2000, JANUARY, 1)


            );
            repository.saveAll(
                    List.of(Dilara,Ahmet)
            );

        };
    }

}
