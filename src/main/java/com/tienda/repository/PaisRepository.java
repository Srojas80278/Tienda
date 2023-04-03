package com.tienda.repository;
import com.tienda.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Definimos el comportamiento de esta clase que sera "repositorio"
//Extends: Tiene herencia.
//Interface: Define los métodos, pero no nos explica como se hacen.

@Repository
public interface PaisRepository extends CrudRepository<Pais,Long>{
    
}

