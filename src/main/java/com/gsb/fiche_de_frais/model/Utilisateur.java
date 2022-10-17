package com.gsb.fiche_de_frais.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
public class Utilisateur {

    @Id
    @Column(name = "id_utilisateur")
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
    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role role;

}