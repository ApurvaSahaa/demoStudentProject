package com.studentProject.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args -> {
            Student blake = new Student(
                    "Blake",
                    "blake@gmail.com",
                    LocalDate.of(2000, AUGUST, 23)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1996, JUNE, 2)
            );

            Student robin = new Student(
                    "Robin",
                    "robin@gmail.com",
                    LocalDate.of(1998, APRIL, 16)
            );

            repository.saveAll(
                    List.of(blake, alex, robin)
            );
        };
    }
}
