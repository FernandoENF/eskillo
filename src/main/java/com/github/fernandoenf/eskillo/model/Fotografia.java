package com.github.fernandoenf.eskillo.model;

import java.io.Serializable;
import java.util.Arrays;

public class Fotografia implements Serializable {
    private static final long serialVersionUID = 1L;
    private byte[] fotografia;
    private String tipoArquivo;
    
    public Fotografia() {
    }
    
    public Fotografia(byte[] fotografia, String tipoArquivo) {
        this.fotografia = fotografia;
        this.tipoArquivo = tipoArquivo;
    }

    public byte[] getFotografia() {
        return fotografia;
    }

    public void setFotografia(byte[] fotografia) {
        this.fotografia = fotografia;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(fotografia);
        result = prime * result + ((tipoArquivo == null) ? 0 : tipoArquivo.hashCode());
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
        Fotografia other = (Fotografia) obj;
        if (!Arrays.equals(fotografia, other.fotografia))
            return false;
        if (tipoArquivo == null) {
            if (other.tipoArquivo != null)
                return false;
        } else if (!tipoArquivo.equals(other.tipoArquivo))
            return false;
        return true;
    }

}
