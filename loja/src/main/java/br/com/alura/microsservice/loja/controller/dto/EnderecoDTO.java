package br.com.alura.microsservice.loja.controller.dto;

public class EnderecoDTO<String> {

    private java.lang.String rua;

    private int numero;

    public java.lang.String getRua() {
        return rua;
    }

    public void setRua(java.lang.String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private String estado;
}
