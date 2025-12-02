package com.senai.adocao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.adocao.models.AdocaoModel;

@Repository
public interface AdocaoRepository extends JpaRepository<AdocaoModel, Integer> {

}