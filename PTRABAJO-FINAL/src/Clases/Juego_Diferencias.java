/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Joel
 */
public class Juego_Diferencias {
    private String Cod_Juego;
    private String FK_CodPsicologo;
    private String Descripcion_Juego;
    private int Respuesta_Correcta;
    private byte[] Imagen_Dif;
    private String RutaImagen;

    public Juego_Diferencias() {
    }

    public Juego_Diferencias(String Cod_Juego, String FK_CodPsicologo, String Descripcion_Juego, int Respuesta_Correcta, byte[] Imagen_Dif, String RutaImagen) {
        this.Cod_Juego = Cod_Juego;
        this.FK_CodPsicologo = FK_CodPsicologo;
        this.Descripcion_Juego = Descripcion_Juego;
        this.Respuesta_Correcta = Respuesta_Correcta;
        this.Imagen_Dif = Imagen_Dif;
        this.RutaImagen = RutaImagen;
    }

    public String getCod_Juego() {
        return Cod_Juego;
    }

    public void setCod_Juego(String Cod_Juego) {
        this.Cod_Juego = Cod_Juego;
    }

    public String getFK_CodPsicologo() {
        return FK_CodPsicologo;
    }

    public void setFK_CodPsicologo(String FK_CodPsicologo) {
        this.FK_CodPsicologo = FK_CodPsicologo;
    }

    public String getDescripcion_Juego() {
        return Descripcion_Juego;
    }

    public void setDescripcion_Juego(String Descripcion_Juego) {
        this.Descripcion_Juego = Descripcion_Juego;
    }

    public int getRespuesta_Correcta() {
        return Respuesta_Correcta;
    }

    public void setRespuesta_Correcta(int Respuesta_Correcta) {
        this.Respuesta_Correcta = Respuesta_Correcta;
    }

    public byte[] getImagen_Dif() {
        return Imagen_Dif;
    }

    public void setImagen_Dif(byte[] Imagen_Dif) {
        this.Imagen_Dif = Imagen_Dif;
    }

    public String getRutaImagen() {
        return RutaImagen;
    }

    public void setRutaImagen(String RutaImagen) {
        this.RutaImagen = RutaImagen;
    }

    @Override
    public String toString() {
        return "Juego_Diferencias{" + "Cod_Juego=" + Cod_Juego + ", FK_CodPsicologo=" + FK_CodPsicologo + ", Descripcion_Juego=" + Descripcion_Juego + ", Respuesta_Correcta=" + Respuesta_Correcta + ", Imagen_Dif=" + Imagen_Dif + ", RutaImagen=" + RutaImagen + '}';
    }
    
            public Image obtenerImagenComoImage() {
        if (Imagen_Dif != null) {
            try ( ByteArrayInputStream bais = new ByteArrayInputStream(Imagen_Dif)) {
                return ImageIO.read(bais);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
