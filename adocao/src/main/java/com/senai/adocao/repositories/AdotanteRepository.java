package com.senai.adocao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.adocao.models.AdotanteModel;

@Repository
public interface AdotanteRepository extends JpaRepository<AdotanteModel, Integer> {

}