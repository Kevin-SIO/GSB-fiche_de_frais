package com.gsb.fiche_de_frais.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Role {

    @Id
    @Column(name="id_role")
    private int id;

    @Column(name = "libelle_role")
    private String nom;

}