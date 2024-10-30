package com.estudo.repository;

import com.estudo.model.Empresa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class SchemaGeneration {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CursoJSF");

        EntityManager entityManager = factory.createEntityManager();

        List<Empresa> lista = entityManager.createQuery("from Empresa", Empresa.class).getResultList();

        System.out.println(lista);

        entityManager.close();
        factory.close();
    }
}
