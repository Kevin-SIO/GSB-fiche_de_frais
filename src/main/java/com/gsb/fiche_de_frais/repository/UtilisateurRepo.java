package com.gsb.fiche_de_frais.repository;

import com.gsb.fiche_de_frais.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepo extends JpaRepository<Utilisateur,Integer> {

}