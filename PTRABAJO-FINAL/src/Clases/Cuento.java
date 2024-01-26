
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
public class Cuento {

    private String Cod_Cuento;
    private String FK_CodPsicologo;
    private String Titulo_Cuento;
    private String Introduccion_Cuento;
    private String Nudo_Cuento;
    private String representante;
    private String quienPresiono;
    private String Desenlace_Cuento;
    private byte[] Imagen_Inicial;
    private byte[] Imagen_Final;
    private String RutaImagen;
    private String RutaImagen2;

    public Cuento() {
    }

    public Cuento(String Cod_Cuento, String FK_CodPsicologo, String Titulo_Cuento, String Introduccion_Cuento, String Nudo_Cuento, String representante, String quienPresiono, String Desenlace_Cuento, byte[] Imagen_Inicial, byte[] Imagen_Final, String RutaImagen, String RutaImagen2) {
        this.Cod_Cuento = Cod_Cuento;
        this.FK_CodPsicologo = FK_CodPsicologo;
        this.Titulo_Cuento = Titulo_Cuento;
        this.Introduccion_Cuento = Introduccion_Cuento;
        this.Nudo_Cuento = Nudo_Cuento;
        this.representante = representante;
        this.quienPresiono = quienPresiono;
        this.Desenlace_Cuento = Desenlace_Cuento;
        this.Imagen_Inicial = Imagen_Inicial;
        this.Imagen_Final = Imagen_Final;
        this.RutaImagen = RutaImagen;
        this.RutaImagen2 = RutaImagen2;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }


    public String getQuienPresiono() {
        return quienPresiono;
    }

    public void setQuienPresiono(String quienPresiono) {
        this.quienPresiono = quienPresiono;
    }

    public String getCod_Cuento() {
        return Cod_Cuento;
    }

    public void setCod_Cuento(String Cod_Cuento) {
        this.Cod_Cuento = Cod_Cuento;
    }

    public String getFK_CodPsicologo() {
        return FK_CodPsicologo;
    }

    public void setFK_CodPsicologo(String FK_CodPsicologo) {
        this.FK_CodPsicologo = FK_CodPsicologo;
    }

    public String getTitulo_Cuento() {
        return Titulo_Cuento;
    }

    public void setTitulo_Cuento(String Titulo_Cuento) {
        this.Titulo_Cuento = Titulo_Cuento;
    }

    public String getIntroduccion_Cuento() {
        return Introduccion_Cuento;
    }

    public void setIntroduccion_Cuento(String Introduccion_Cuento) {
        this.Introduccion_Cuento = Introduccion_Cuento;
    }

    public String getNudo_Cuento() {
        return Nudo_Cuento;
    }

    public void setNudo_Cuento(String Nudo_Cuento) {
        this.Nudo_Cuento = Nudo_Cuento;
    }

    public String getDesenlace_Cuento() {
        return Desenlace_Cuento;
    }

    public void setDesenlace_Cuento(String Desenlace_Cuento) {
        this.Desenlace_Cuento = Desenlace_Cuento;
    }

    public byte[] getImagen_Inicial() {
        return Imagen_Inicial;
    }

    public void setImagen_Inicial(byte[] Imagen_Inicial) {
        this.Imagen_Inicial = Imagen_Inicial;
    }

    public byte[] getImagen_Final() {
        return Imagen_Final;
    }

    public void setImagen_Final(byte[] Imagen_Final) {
        this.Imagen_Final = Imagen_Final;
    }

    public String getRutaImagen() {
        return RutaImagen;
    }

    public void setRutaImagen(String RutaImagen) {
        this.RutaImagen = RutaImagen;
    }

    public String getRutaImagen2() {
        return RutaImagen2;
    }

    public void setRutaImagen2(String RutaImagen2) {
        this.RutaImagen2 = RutaImagen2;
    }

    public Image obtenerImagenComoImage() {
        if (Imagen_Inicial != null) {
            try (ByteArrayInputStream bais = new ByteArrayInputStream(Imagen_Inicial)) {
                return ImageIO.read(bais);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Image obtenerImagenFinalComoImage() {
        if (Imagen_Final != null) {
            try (ByteArrayInputStream bais = new ByteArrayInputStream(Imagen_Final)) {
                return ImageIO.read(bais);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
