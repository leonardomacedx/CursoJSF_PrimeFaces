package com.estudo.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.estudo.model.Empresa;
import com.estudo.repository.Empresas;
import com.estudo.util.Transacional;

public class CadastroEmpresaService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Empresas empresas;

    @Transacional
    public void salvar(Empresa empresa) {
        empresas.guardar(empresa);
    }

    @Transacional
    public void excluir(Empresa empresa) {
        empresas.remover(empresa);
    }

}
