package org.pedro.Dto;

import org.pedro.Util.UtilTools;

public class LancheDto {
    private String codigProd;
    private String nomeProd;
    private double precoProd;
    private String urlImag;

    public LancheDto(String codigProd, String nomeProd, double precoProd, String urlImag) {
        this.codigProd = codigProd;
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
        this.urlImag = urlImag;

        UtilTools.salvarFiles(urlImag);
    }

    public String getCodigProd() {
        return codigProd;
    }

    public void setCodigProd(String codigProd) {
        this.codigProd = codigProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }

    public String getUrlImag() {
        return urlImag;
    }

    public void setUrlImag(String urlImag) {
        this.urlImag = urlImag;
    }
}
