/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Joel
 */
public class Tipo_Usuario {
    private String Cod_Tipo_usua;
    private String codigo;
    private String tipo_usuario;

    public Tipo_Usuario(String Cod_Tipo_usua, String codigo, String tipo_usuario) {
        this.Cod_Tipo_usua = Cod_Tipo_usua;
        this.codigo = codigo;
        this.tipo_usuario = tipo_usuario;
    }

    public Tipo_Usuario() {
    }

    @Override
    public String toString() {
        return "Tipo_Usuario{" + "Cod_Tipo_usua=" + Cod_Tipo_usua + ", codigo=" + codigo + ", tipo_usuario=" + tipo_usuario + '}';
    }

    
    public String getCod_Tipo_usua() {
        return Cod_Tipo_usua;
    }

    public void setCod_Tipo_usua(String Cod_Tipo_usua) {
        this.Cod_Tipo_usua = Cod_Tipo_usua;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    
}
