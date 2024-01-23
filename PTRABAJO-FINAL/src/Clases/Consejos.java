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
public class Consejos {

    private String cod_consejo;
    private String Titulo1Consejo;
    private String Titulo2Consejo;
    private String TexConsejo1;
    private String TexConsejo2;
    private byte[] ImagenConsejo1;
    private byte[] ImagenConsejo2;
    private String RutaImageConsejo1;
    private String RutaImageConsejo2;

    public Consejos() {
    }

    public Consejos(String cod_consejo, String Titulo1Consejo, String Titulo2Consejo, String TexConsejo1, String TexConsejo2, byte[] ImagenConsejo1, byte[] ImagenConsejo2, String RutaImageConsejo1, String RutaImageConsejo2) {
        this.cod_consejo = cod_consejo;
        this.Titulo1Consejo = Titulo1Consejo;
        this.Titulo2Consejo = Titulo2Consejo;
        this.TexConsejo1 = TexConsejo1;
        this.TexConsejo2 = TexConsejo2;
        this.ImagenConsejo1 = ImagenConsejo1;
        this.ImagenConsejo2 = ImagenConsejo2;
        this.RutaImageConsejo1 = RutaImageConsejo1;
        this.RutaImageConsejo2 = RutaImageConsejo2;
    }

    public String getCod_consejo() {
        return cod_consejo;
    }

    public void setCod_consejo(String cod_consejo) {
        this.cod_consejo = cod_consejo;
    }

    public String getTitulo1Consejo() {
        return Titulo1Consejo;
    }

    public void setTitulo1Consejo(String Titulo1Consejo) {
        this.Titulo1Consejo = Titulo1Consejo;
    }

    public String getTitulo2Consejo() {
        return Titulo2Consejo;
    }

    public void setTitulo2Consejo(String Titulo2Consejo) {
        this.Titulo2Consejo = Titulo2Consejo;
    }

    public String getTexConsejo1() {
        return TexConsejo1;
    }

    public void setTexConsejo1(String TexConsejo1) {
        this.TexConsejo1 = TexConsejo1;
    }

    public String getTexConsejo2() {
        return TexConsejo2;
    }

    public void setTexConsejo2(String TexConsejo2) {
        this.TexConsejo2 = TexConsejo2;
    }

    public byte[] getImagenConsejo1() {
        return ImagenConsejo1;
    }

    public void setImagenConsejo1(byte[] ImagenConsejo1) {
        this.ImagenConsejo1 = ImagenConsejo1;
    }

    public byte[] getImagenConsejo2() {
        return ImagenConsejo2;
    }

    public void setImagenConsejo2(byte[] ImagenConsejo2) {
        this.ImagenConsejo2 = ImagenConsejo2;
    }

    public String getRutaImageConsejo1() {
        return RutaImageConsejo1;
    }

    public void setRutaImageConsejo1(String RutaImageConsejo1) {
        this.RutaImageConsejo1 = RutaImageConsejo1;
    }

    public String getRutaImageConsejo2() {
        return RutaImageConsejo2;
    }

    public void setRutaImageConsejo2(String RutaImageConsejo2) {
        this.RutaImageConsejo2 = RutaImageConsejo2;
    }

    @Override
    public String toString() {
        return "Consejos{" + "cod_consejo=" + cod_consejo + ", Titulo1Consejo=" + Titulo1Consejo + ", Titulo2Consejo=" + Titulo2Consejo + ", TexConsejo1=" + TexConsejo1 + ", TexConsejo2=" + TexConsejo2 + ", ImagenConsejo1=" + ImagenConsejo1 + ", ImagenConsejo2=" + ImagenConsejo2 + ", RutaImageConsejo1=" + RutaImageConsejo1 + ", RutaImageConsejo2=" + RutaImageConsejo2 + '}';
    }
    
    public Image obtenerImagenConsejo1() {
        if (ImagenConsejo1 != null) {
            try ( ByteArrayInputStream bais = new ByteArrayInputStream(ImagenConsejo1)) {
                return ImageIO.read(bais);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

        public Image obtenerImagenConsejo2() {
        if (ImagenConsejo2 != null) {
            try ( ByteArrayInputStream bais = new ByteArrayInputStream(ImagenConsejo2)) {
                return ImageIO.read(bais);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
