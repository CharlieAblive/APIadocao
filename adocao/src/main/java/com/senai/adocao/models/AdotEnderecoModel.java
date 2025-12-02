package com.senai.adocao.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class AdotEnderecoModel {
    @Column(nullable = false)
    private String rua;
    @Column(nullable = false)
    private int numero;
    @Column(nullable = false)
    private String bairro;
    @Column(nullable= false)
    private String cidade;



public AdotEnderecoModel(){

}

public AdotEnderecoModel(String rua, int numero, String bairro, String cidade){
    this.rua = rua;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
}


}