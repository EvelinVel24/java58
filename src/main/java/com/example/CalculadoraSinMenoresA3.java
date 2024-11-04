package main.java.com.example;

import java.util.List;
import java.util.stream.Collectors;

public class CalculadoraSinMenoresA3 implements ICalculadora {
    private List<Alumno> alumnos;

    public CalculadoraSinMenoresA3(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public List<Alumno> calcularPromedios() {
        for (Alumno alumno : alumnos) {
            List<Integer> notasFiltradas = alumno.getNotas().stream().filter(nota -> nota >= 3).collect(Collectors.toList());
            float promedio = (float) notasFiltradas.stream().mapToInt(Integer::intValue).average().orElse(0);
            alumno.setPromedio(promedio);
        }
        return alumnos;
    }
}
