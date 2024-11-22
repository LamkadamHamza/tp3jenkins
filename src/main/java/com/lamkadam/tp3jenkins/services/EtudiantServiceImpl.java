package com.lamkadam.tp3jenkins.services;

import com.lamkadam.tp3jenkins.dao.EtudiantRepository;
import com.lamkadam.tp3jenkins.entities.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;




@Service

@AllArgsConstructor
public class EtudiantServiceImpl  implements EtudiantService {



    EtudiantRepository etudiantRepository;

    @Override
    public Etudiant SaveEtudiant(Etudiant e) {
        Etudiant etudiant = etudiantRepository.save(e);
        return etudiant;
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        List<Etudiant> ListEtudiants = etudiantRepository.findAll();
        return ListEtudiants;
    }

    @Override
    public Etudiant getEtudiantByid(Long id) {
        Etudiant etudiant = etudiantRepository.findById(id).orElse(null);
        return etudiant;
    }

    @Override
    public void deleteEtudiant(Long id) {

    }
}
