package com.senai.adocao.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pets")
@Getter
@Setter
public class PetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String especie;
    @Column(nullable = false)
    private String raca;
    @Column(nullable = false)
    private int idade;
    @Column(nullable = false)
    private String porte;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private String vacinas;
    @Column(nullable = false)
    private boolean disponivel;
    @Column(nullable = false)
    private String dataEntrada = LocalDate.now().toString();
    @Column
    private String dataAdoc;

    public PetModel(){

    }

    public PetModel(int id, String nome, String especie, String raca, int idade, String porte, String descricao, String vacinas, boolean disponivel, String dataEntrada, String dataAdoc    ){

        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
        this.descricao = descricao;
        this.vacinas = vacinas;
        this.disponivel = disponivel;
        this.dataEntrada = dataEntrada;
        this.dataAdoc = dataAdoc;



    }}





