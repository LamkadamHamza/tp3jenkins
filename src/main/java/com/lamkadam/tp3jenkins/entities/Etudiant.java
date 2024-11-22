package com.lamkadam.tp3jenkins.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


import java.util.Date;

@Entity
@Getter @Setter @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Etudiant {



    @Id
    private Long idEtudiant;
    private String nomEtudiant;
    private String prenomEtudiant;
    private Date dateNais;
}
