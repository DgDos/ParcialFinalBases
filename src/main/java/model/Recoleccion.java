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
public class Recoleccion {
    private int idRecoleccion;
    private String fecha;
    private int kilos;
    private int idColmena;
    private int idTrabajador;

    public Recoleccion() {
    }

    public Recoleccion(int idRecoleccion, String fecha, int kilos, int idColmena, int idTrabajador) {
        this.idRecoleccion = idRecoleccion;
        this.fecha = fecha;
        this.kilos = kilos;
        this.idColmena = idColmena;
        this.idTrabajador = idTrabajador;
    }

    public int getIdRecoleccion() {
        return idRecoleccion;
    }

    public void setIdRecoleccion(int idRecoleccion) {
        this.idRecoleccion = idRecoleccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public int getIdColmena() {
        return idColmena;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
    
}
