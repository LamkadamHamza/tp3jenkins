package com.lamkadam.tp3jenkins.services;

import com.lamkadam.tp3jenkins.entities.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface EtudiantService {

    Etudiant  SaveEtudiant (Etudiant e);
    List<Etudiant> getAllEtudiant();

    Etudiant  getEtudiantByid (Long id );

    public  void deleteEtudiant(Long id);
}
