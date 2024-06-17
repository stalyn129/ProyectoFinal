/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_VISTA
        ;


import Vista.PaginaMascota;
import Vista.*;

/**
 *
 * @author alexa
 */
public class PaginaPrincipalController {

    PaginaPrincipal VistaPrincipal;
Ventana_Cliente client;
PaginaMascota mascot;
Ventana_Veterinario veter;
    public PaginaPrincipalController( PaginaPrincipal VistaPrincipal) {
        this.VistaPrincipal= new PaginaPrincipal();
        this.VistaPrincipal =VistaPrincipal;
        
        this.VistaPrincipal.setVisible(true);
         this.client=new Ventana_Cliente();
         this.mascot=new PaginaMascota();
         this.veter=new Ventana_Veterinario();
        this.VistaPrincipal.btn_Veterinario.addActionListener((e) ->veter.setVisible(true) );
        this.VistaPrincipal.btn_cliente.addActionListener((e) ->veter.setVisible(true) );
        this.VistaPrincipal.btn_mascota.addActionListener((e) ->veter.setVisible(true) );
        
    }
    

}
