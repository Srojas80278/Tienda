package com.tienda.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

//La entidad recibe la información de la base de datos
//mediante
@Entity
@Table(name = "paises")
public class Pais implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    //Definimos los atributos de la clase:
    private long id;
    private String pais;
    
    //Insertamos Getters and setters:
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
}
