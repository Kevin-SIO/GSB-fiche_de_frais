package com.gsb.fiche_de_frais.repository;

import com.gsb.fiche_de_frais.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role,Integer> {

}