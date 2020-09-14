package com.github.fernandoenf.eskillo.model;
import java.io.Serializable;
import java.util.Date;

public class Experiencia implements Serializable{
    private static final long serialVersionUID = 1L;
	private String cargo;
    private TipoEmprego tipoEmprego;
    private String nomeEmpresa;
    private Localidade localidade;
    private Date dataInicio;
    private Date dataFim;
    private boolean ocupacaoAtual;
    private String descricao;
    
    public Experiencia() {
    }
    
    public Experiencia(String cargo, TipoEmprego tipoEmprego, String nomeEmpresa, Localidade localidade,
            Date dataInicio, Date dataFim, boolean ocupacaoAtual, String descricao) {
        this.cargo = cargo;
        this.tipoEmprego = tipoEmprego;
        this.nomeEmpresa = nomeEmpresa;
        this.localidade = localidade;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.ocupacaoAtual = ocupacaoAtual;
        this.descricao = descricao;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public TipoEmprego getTipoEmprego() {
        return tipoEmprego;
    }

    public void setTipoEmprego(TipoEmprego tipoEmprego) {
        this.tipoEmprego = tipoEmprego;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public Localidade getLocalidade() {
        return localidade;
    }

    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isOcupacaoAtual() {
        return ocupacaoAtual;
    }

    public void setOcupacaoAtual(boolean ocupacaoAtual) {
        this.ocupacaoAtual = ocupacaoAtual;
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
        result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
        result = prime * result + ((localidade == null) ? 0 : localidade.hashCode());
        result = prime * result + ((nomeEmpresa == null) ? 0 : nomeEmpresa.hashCode());
        result = prime * result + ((tipoEmprego == null) ? 0 : tipoEmprego.hashCode());
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
        Experiencia other = (Experiencia) obj;
        if (cargo == null) {
            if (other.cargo != null)
                return false;
        } else if (!cargo.equals(other.cargo))
            return false;
        if (localidade == null) {
            if (other.localidade != null)
                return false;
        } else if (!localidade.equals(other.localidade))
            return false;
        if (nomeEmpresa == null) {
            if (other.nomeEmpresa != null)
                return false;
        } else if (!nomeEmpresa.equals(other.nomeEmpresa))
            return false;
        if (tipoEmprego != other.tipoEmprego)
            return false;
        return true;
    }


    
    
}
