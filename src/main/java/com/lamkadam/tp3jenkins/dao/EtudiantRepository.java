package com.lamkadam.tp3jenkins.dao;

import com.lamkadam.tp3jenkins.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface EtudiantRepository  extends JpaRepository<Etudiant , Long> {
}
