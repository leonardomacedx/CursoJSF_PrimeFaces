package com.estudo.controller;

import com.estudo.model.Empresa;
import com.estudo.model.TipoEmpresa;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Empresa empresa;

    public Empresa getEmpresa() {
        return empresa;
    }

    public TipoEmpresa[] getTiposEmpresa() {
        return TipoEmpresa.values();
    }

    public void salvar() {
        System.out.println("Razão social: " + this.empresa.getRazaoSocial() +
                "- Nome fantasia:" + this.empresa.getNomeFantasia() +
                "- tipoEmpresa: " + this.empresa.getTipoEmpresa());
    }

}
