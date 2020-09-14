package com.github.fernandoenf.eskillo.model;

import java.io.Serializable;

public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;
    private String numeroTelefone;
    private TipoTelefone tipoTelefone;
    
    public Telefone() {
    }
    
    public Telefone(String numeroTelefone, TipoTelefone tipoTelefone) {
        this.numeroTelefone = numeroTelefone;
        this.tipoTelefone = tipoTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroTelefone == null) ? 0 : numeroTelefone.hashCode());
        result = prime * result + ((tipoTelefone == null) ? 0 : tipoTelefone.hashCode());
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
        Telefone other = (Telefone) obj;
        if (numeroTelefone == null) {
            if (other.numeroTelefone != null)
                return false;
        } else if (!numeroTelefone.equals(other.numeroTelefone))
            return false;
        if (tipoTelefone != other.tipoTelefone)
            return false;
        return true;
    }

}
