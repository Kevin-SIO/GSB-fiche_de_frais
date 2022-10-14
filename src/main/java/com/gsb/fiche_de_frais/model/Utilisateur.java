package com.gsb.fiche_de_frais.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class Utilisateur {

    @Id
    @Column(name = "id_role")
    private int id;

    private String nom;
    private String prenom;
    private String login;
    private String mdp;
    private String adresse;
    private String cp;
    private String ville;
    @Column(name = "date_embauche")
    private Date dateEmbauche;

}