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
    private int idColmenaMadre;
    private int totalKilos;

    public Colmena() {
    }

    public Colmena(int idColmena, String ubicacion, String fabrica, int idColmenaMadre, int totalKilos) {
        this.idColmena = idColmena;
        this.ubicacion = ubicacion;
        this.fabrica = fabrica;
        this.idColmenaMadre = idColmenaMadre;
        this.totalKilos = totalKilos;
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

    public int getIdColmenaMadre() {
        return idColmenaMadre;
    }

    public void setIdColmenaMadre(int idColumnaMadre) {
        this.idColmenaMadre = idColumnaMadre;
    }

    public int getTotalKilos() {
        return totalKilos;
    }

    public void setTotalKilos(int totalKilos) {
        this.totalKilos = totalKilos;
    }
    
    
}
