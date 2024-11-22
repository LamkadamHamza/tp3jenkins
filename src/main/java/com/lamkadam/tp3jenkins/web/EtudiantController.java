package com.lamkadam.tp3jenkins.web;


import com.lamkadam.tp3jenkins.entities.Etudiant;
import com.lamkadam.tp3jenkins.services.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Etudiant")
@CrossOrigin
@AllArgsConstructor
public class EtudiantController {

    private EtudiantService etudiantService;


    @PostMapping(path="/ListeEtudiants",produces= {MediaType.APPLICATION_JSON_VALUE})
    public Etudiant saveEtudient(@RequestBody Etudiant e){

        return etudiantService.SaveEtudiant(e);
    }


    @GetMapping(path="/liste",produces= {MediaType.APPLICATION_JSON_VALUE})
    public List<Etudiant> getAllEtudiant(){
        return  etudiantService.getAllEtudiant();
    }


    @GetMapping(path="/ListeEtudiants/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})
    public Etudiant findEtudiantById(@PathVariable(value="id") Long id){
        return  etudiantService.getEtudiantByid(id);
    }
}
