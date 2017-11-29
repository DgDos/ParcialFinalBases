/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author LabingXEON
 */
public class Union {
    private int idColmena;
    private String ubicacion;
    private String fabrica;
    private int totalKilos;
    private int idColmenaMadre;
    private String idColmenaMadreU;
    private String idColmenaMadreF;

    public Union() {
    }

    public Union(int idColmena, String ubicacion, String fabrica, int totalKilos, int idColmenaMadre, String idColmenaMadreU, String idColmenaMadreF) {
        this.idColmena = idColmena;
        this.ubicacion = ubicacion;
        this.fabrica = fabrica;
        this.totalKilos = totalKilos;
        this.idColmenaMadre = idColmenaMadre;
        this.idColmenaMadreU = idColmenaMadreU;
        this.idColmenaMadreF = idColmenaMadreF;
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

    public int getTotalKilos() {
        return totalKilos;
    }

    public void setTotalKilos(int totalKilos) {
        this.totalKilos = totalKilos;
    }

    public int getIdColmenaMadre() {
        return idColmenaMadre;
    }

    public void setIdColmenaMadre(int idColmenaMadre) {
        this.idColmenaMadre = idColmenaMadre;
    }

    public String getIdColmenaMadreU() {
        return idColmenaMadreU;
    }

    public void setIdColmenaMadreU(String idColmenaMadreU) {
        this.idColmenaMadreU = idColmenaMadreU;
    }

    public String getIdColmenaMadreF() {
        return idColmenaMadreF;
    }

    public void setIdColmenaMadreF(String idColmenaMadreF) {
        this.idColmenaMadreF = idColmenaMadreF;
    }

    
    
}
