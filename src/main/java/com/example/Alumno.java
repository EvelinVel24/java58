package main.java.com.example;

import java.util.List;

public class Alumno {
    private String rut;
    private String nombre;
    private List<Integer> notas;
    private Float promedio;

    public Alumno(String rut, String nombre, List<Integer> notas, Float promedio) {
        this.rut = rut;
        this.nombre = nombre;
        this.notas = notas;
        this.promedio = promedio;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }
}
