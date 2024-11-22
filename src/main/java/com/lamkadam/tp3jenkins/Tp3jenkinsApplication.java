package com.lamkadam.tp3jenkins;

import com.lamkadam.tp3jenkins.entities.Etudiant;
import com.lamkadam.tp3jenkins.services.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@AllArgsConstructor
public class Tp3jenkinsApplication {


    private EtudiantService etudiantService;

    public static void main(String[] args) {
        SpringApplication.run(Tp3jenkinsApplication.class, args);
    }


    @Bean
    CommandLineRunner start() {
        return args -> {

            etudiantService.SaveEtudiant(new Etudiant(1L,"hamza","lamkadam", new Date()));
            etudiantService.SaveEtudiant(new Etudiant(2L,"Asma","Asma", new Date()));
            etudiantService.SaveEtudiant(new Etudiant(3L,"Ahmed","Ahmed", new Date()));

            //customerRepository.findAll().forEach(System.out::println);
        };
    }
}
