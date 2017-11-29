/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LabingXEON
 */
public class Colmenitas {
    private int idColmena;
    private String ubicacion;
    private String fabrica;

    public Colmenitas() {
    }

    public Colmenitas(int idColmena, String ubicacion, String fabrica) {
        this.idColmena = idColmena;
        this.ubicacion = ubicacion;
        this.fabrica = fabrica;
    }

    public int getIdColmena() {
        return idColmena;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFabrica() {
        return fabrica;
    }

    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }
    
    

    
}
