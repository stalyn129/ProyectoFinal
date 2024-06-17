/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vista.PaginaCliente;
import Vista.PaginaMascota;
import Vista.*;

/**
 *
 * @author alexa
 */
public class PaginaPrincipalController {

    PaginaPrincipal VistaPrincipal;
PaginaCliente client;
PaginaMascota mascot;
PaginaVeterinario veter;
    public PaginaPrincipalController( PaginaPrincipal VistaPrincipal) {
        this.VistaPrincipal=VistaPrincipal;
        this.VistaPrincipal.setVisible(true);
         this.client=new PaginaCliente();
         this.mascot=new PaginaMascota();
         this.veter=new PaginaVeterinario();
        this.VistaPrincipal.btn_Veterinario.addActionListener((e) ->veter.setVisible(true) );
        this.VistaPrincipal.btn_cliente.addActionListener((e) ->veter.setVisible(true) );
        this.VistaPrincipal.btn_mascota.addActionListener((e) ->veter.setVisible(true) );
        
    }
    

}
