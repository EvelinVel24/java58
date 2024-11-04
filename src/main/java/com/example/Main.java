package main.java.com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("15562563", "HeathSchowalter", Arrays.asList(6, 7, 2), 0f));
        alumnos.add(new Alumno("13635430", "RozellaBartoletti", Arrays.asList(3, 2, 6, 6, 6, 4, 3, 3, 4), 0f));
        alumnos.add(new Alumno("17554475", "JedRunolfsdottir", Arrays.asList(2, 5, 3, 6, 2, 1, 7, 2), 0f));
        // Agrega más alumnos según los datos proporcionados

        ICalculadora calculadoraTodos = new CalculadoraTodos(alumnos);
        ICalculadora calculadoraSinMenoresA3 = new CalculadoraSinMenoresA3(alumnos);
        ICalculadora calculadoraSinExtremos = new CalculadoraSinExtremos(alumnos);

        Profesor profesor = new Profesor(calculadoraTodos);
        System.out.println("Promedio considerando todas las notas:");
        profesor.mostrarPromedioGeneral();

        profesor = new Profesor(calculadoraSinMenoresA3);
        System.out.println("Promedio sin notas menores a 3:");
        profesor.mostrarPromedioGeneral();

        profesor = new Profesor(calculadoraSinExtremos);
        System.out.println("Promedio sin la nota más alta y más baja:");
        profesor.mostrarPromedioGeneral();
    }
}

