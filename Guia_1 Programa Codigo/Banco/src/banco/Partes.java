/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 * Clase para manejar los datos de una parte de computador
 * @author Edgar
 */
public class Partes {
    private int id;
    private String name;
    private int cantidad;
    private int value;
    private String estado;

    public Partes(int id, String name, int cantidad, int value, String estado) {
        this.id = id;
        this.name = name;
        this.cantidad = cantidad;
        this.value = value;
        this.estado = estado;
    }

    
    //-----------------------------------GETTERS-----------------------------------    
    public int getNumeroCuenta() {
        return id;
    }

    public String getNombreTitular() {
        return name;
    }

    public int getApellidoTitular() {
        return cantidad;
    }

    public int getCedulaTitular() {
        return value;
    }

    public String getMonto() {
        return estado;
    }
    
    //-----------------------------------SETTERS-----------------------------------

    public void setNumeroCuenta(int id) {
        this.id = id;
    }

    public void setNombreTitular(String name) {
        this.name = name;
    }

    public void setApellidoTitular(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCedulaTitular(int value) {
        this.value = value;
    }

    public void setMonto(String estado) {
        this.estado = estado;
    }
    
    //-----------------------------------PRINT OUT-----------------------------------

    @Override
    public String toString() {
        return "Partes{" + "            ID: " + id + ",             Parte: " + name + ",            Cantidad: " + cantidad + ",             Valor: " + value + ",           Estado: " + estado + '}';
    }
    
}

