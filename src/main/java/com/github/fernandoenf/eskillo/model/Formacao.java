package com.github.fernandoenf.eskillo.model;

import java.io.Serializable;

public class Formacao implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nomeInstituicao;
    private TipoFormacao tipoFormacao;
    private AreaEstudo areaEstudo;
    private int anoInicio;
    private int anoFim;
    private boolean emAndamento;
    private String descricao;
    
    public Formacao() {
    }

    public Formacao(String nomeInstituicao, TipoFormacao tipoFormacao, AreaEstudo areaEstudo, int anoInicio, int anoFim,
            boolean emAndamento, String descricao) {
        this.nomeInstituicao = nomeInstituicao;
        this.tipoFormacao = tipoFormacao;
        this.areaEstudo = areaEstudo;
        this.anoInicio = anoInicio;
        this.anoFim = anoFim;
        this.emAndamento = emAndamento;
        this.descricao = descricao;
    }
    
    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public TipoFormacao getTipoFormacao() {
        return tipoFormacao;
    }

    public void setTipoFormacao(TipoFormacao tipoFormacao) {
        this.tipoFormacao = tipoFormacao;
    }

    public AreaEstudo getAreaEstudo() {
        return areaEstudo;
    }

    public void setAreaEstudo(AreaEstudo areaEstudo) {
        this.areaEstudo = areaEstudo;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getAnoFim() {
        return anoFim;
    }

    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }

    public boolean isEmAndamento() {
        return emAndamento;
    }

    public void setEmAndamento(boolean emAndamento) {
        this.emAndamento = emAndamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((areaEstudo == null) ? 0 : areaEstudo.hashCode());
        result = prime * result + ((nomeInstituicao == null) ? 0 : nomeInstituicao.hashCode());
        result = prime * result + ((tipoFormacao == null) ? 0 : tipoFormacao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Formacao other = (Formacao) obj;
        if (areaEstudo == null) {
            if (other.areaEstudo != null)
                return false;
        } else if (!areaEstudo.equals(other.areaEstudo))
            return false;
        if (nomeInstituicao == null) {
            if (other.nomeInstituicao != null)
                return false;
        } else if (!nomeInstituicao.equals(other.nomeInstituicao))
            return false;
        if (tipoFormacao == null) {
            if (other.tipoFormacao != null)
                return false;
        } else if (!tipoFormacao.equals(other.tipoFormacao))
            return false;
        return true;
    }


    
}
