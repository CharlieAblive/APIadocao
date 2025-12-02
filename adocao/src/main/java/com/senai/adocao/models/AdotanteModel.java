package com.senai.adocao.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "adotantes")
@Getter
@Setter
public class AdotanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nomeCompleto;
    @Column(nullable = false)
    private long cpf;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String email;
    @Embedded
    private AdotEnderecoModel endereco;
    @Column(nullable = false)
    private ArrayList petsAdotados;


    public AdotanteModel(){
    }

    public AdotanteModel(int id, String nomeCompleto, long cpf, String telefone, String email, AdotEnderecoModel endereco, ArrayList petsAdotados){
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.petsAdotados = petsAdotados;
    }
}

