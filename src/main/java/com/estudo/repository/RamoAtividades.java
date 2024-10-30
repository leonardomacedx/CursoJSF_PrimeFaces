package com.estudo.repository;

import com.estudo.model.RamoAtividade;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

public class RamoAtividades implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    public RamoAtividades(EntityManager manager) {
        this.manager = manager;
    }

    public List<RamoAtividade> pesquisar(String descricao) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();

        CriteriaQuery<RamoAtividade> criteria = builder.createQuery(RamoAtividade.class);
        Root<RamoAtividade> root = criteria.from(RamoAtividade.class);
        criteria.select(root);
        criteria.where(builder.like(builder.upper(root.get("descricao")), descricao.toUpperCase() + "%"));

        return manager.createQuery(criteria).getResultList();
    }
}
