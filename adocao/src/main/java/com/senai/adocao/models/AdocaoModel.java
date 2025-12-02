package com.senai.adocao.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "adocao")
public class AdocaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int petId;
    @Column(nullable = false)
    private int adotanteId;
    @Column(nullable = false)
    private String dataAdoc;
    @Column
    private String obs;


    public AdocaoModel(){

    }

    public AdocaoModel(int id, int petId, int adotanteId, String dataAdoc, String obs){
        this.id = id;
        this.petId = petId;
        this.adotanteId = adotanteId;
        this.dataAdoc = dataAdoc;
        this.obs = obs;
    }
}
