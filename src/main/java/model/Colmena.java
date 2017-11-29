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
public class Colmena {
    private int idColmena;
    private String ubicacion;
    private String fabrica;
    private int idColumnaMadre;

    public Colmena() {
    }

    public Colmena(int idColmena, String ubicacion, String fabrica, int idColumnaMadre) {
        this.idColmena = idColmena;
        this.ubicacion = ubicacion;
        this.fabrica = fabrica;
        this.idColumnaMadre = idColumnaMadre;
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

    public int getIdColumnaMadre() {
        return idColumnaMadre;
    }

    public void setIdColumnaMadre(int idColumnaMadre) {
        this.idColumnaMadre = idColumnaMadre;
    }
    
    
}
