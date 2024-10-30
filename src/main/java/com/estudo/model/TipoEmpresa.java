package com.estudo.model;

public enum TipoEmpresa {

    MEI("Microempreendedor Individual"),
    ME("Microempresa"),
    EPP("Empresa de Pequeno Porte"),
    EIRELI("Empresa Individual de Responsabilidade Limitada"),
    LTDA("Sociedade Limitada"),
    SA("Sociedade Anônima");

    private String descricao;

    TipoEmpresa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
