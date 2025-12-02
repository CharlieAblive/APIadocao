package com.senai.adocao.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.adocao.models.PetModel;

@Repository
public interface PetRepository extends JpaRepository<PetModel, Integer> {

}