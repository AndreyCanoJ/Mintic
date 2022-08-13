/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5.modelo.VO;

/**
 *
 * @author Andrey Cano
 */
public class Lider {
    private int ID_Lider;
    private String Nombre;
    private String Primer_Apellido;
    private String Ciudad_Residencia;

    public Lider() {
    }

    public Lider(int ID_Lider, String Nombre, String Primer_Apellido, String Ciudad_Residencia) {
        this.ID_Lider = ID_Lider;
        this.Nombre = Nombre;
        this.Primer_Apellido = Primer_Apellido;
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    public int getID_Lider() {
        return ID_Lider;
    }

    public void setID_Lider(int ID_Lider) {
        this.ID_Lider = ID_Lider;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String Primer_Apellido) {
        this.Primer_Apellido = Primer_Apellido;
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String Ciudad_Residencia) {
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    @Override
    public String toString() {
        return "Lider{" + "ID_Lider=" + ID_Lider + ", Nombre=" + Nombre + ", Primer_Apellido=" + Primer_Apellido + ", Ciudad_Residencia=" + Ciudad_Residencia + '}';
    }

    

    
    }

    