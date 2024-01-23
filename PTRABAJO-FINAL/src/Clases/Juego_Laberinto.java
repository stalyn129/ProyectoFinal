
package Clases;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Juego_Laberinto {
    
    private String Cod_Juego;
    private String FK_CodPsicologo;
    private String Descripcion_Juego;
    private char Respuestas_Incorrecta1;
    private char Respuestas_Incorrecta2;
    private char Respuestas_Incorrecta3;
    private char Respuesta_Correcta;
    private byte[] Imagen_Lab;
    private String RutaImagen;

    public Juego_Laberinto() {
    }

    public Juego_Laberinto(String Cod_Juego, String FK_CodPsicologo, String Descripcion_Juego, char Respuestas_Incorrecta1, char Respuestas_Incorrecta2, char Respuestas_Incorrecta3, char Respuesta_Correcta, byte[] Imagen_Lab, String RutaImagen) {
        this.Cod_Juego = Cod_Juego;
        this.FK_CodPsicologo = FK_CodPsicologo;
        this.Descripcion_Juego = Descripcion_Juego;
        this.Respuestas_Incorrecta1 = Respuestas_Incorrecta1;
        this.Respuestas_Incorrecta2 = Respuestas_Incorrecta2;
        this.Respuestas_Incorrecta3 = Respuestas_Incorrecta3;
        this.Respuesta_Correcta = Respuesta_Correcta;
        this.Imagen_Lab = Imagen_Lab;
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

    public char getRespuestas_Incorrecta1() {
        return Respuestas_Incorrecta1;
    }

    public void setRespuestas_Incorrecta1(char Respuestas_Incorrecta1) {
        this.Respuestas_Incorrecta1 = Respuestas_Incorrecta1;
    }

    public char getRespuestas_Incorrecta2() {
        return Respuestas_Incorrecta2;
    }

    public void setRespuestas_Incorrecta2(char Respuestas_Incorrecta2) {
        this.Respuestas_Incorrecta2 = Respuestas_Incorrecta2;
    }

    public char getRespuestas_Incorrecta3() {
        return Respuestas_Incorrecta3;
    }

    public void setRespuestas_Incorrecta3(char Respuestas_Incorrecta3) {
        this.Respuestas_Incorrecta3 = Respuestas_Incorrecta3;
    }

    public char getRespuesta_Correcta() {
        return Respuesta_Correcta;
    }

    public void setRespuesta_Correcta(char Respuesta_Correcta) {
        this.Respuesta_Correcta = Respuesta_Correcta;
    }

    public byte[] getImagen_Lab() {
        return Imagen_Lab;
    }

    public void setImagen_Lab(byte[] Imagen_Lab) {
        this.Imagen_Lab = Imagen_Lab;
    }

    public String getRutaImagen() {
        return RutaImagen;
    }

    public void setRutaImagen(String RutaImagen) {
        this.RutaImagen = RutaImagen;
    }

    @Override
    public String toString() {
        return "Juego_Laberinto{" + "Cod_Juego=" + Cod_Juego + ", FK_CodPsicologo=" + FK_CodPsicologo + ", Descripcion_Juego=" + Descripcion_Juego + ", Respuestas_Incorrecta1=" + Respuestas_Incorrecta1 + ", Respuestas_Incorrecta2=" + Respuestas_Incorrecta2 + ", Respuestas_Incorrecta3=" + Respuestas_Incorrecta3 + ", Respuesta_Correcta=" + Respuesta_Correcta + ", Imagen_Lab=" + Imagen_Lab + ", RutaImagen=" + RutaImagen + '}';
    }

    public Image obtenerImagenComoImage() {
        if (Imagen_Lab != null) {
            try ( ByteArrayInputStream bais = new ByteArrayInputStream(Imagen_Lab)) {
                return ImageIO.read(bais);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
  
}
