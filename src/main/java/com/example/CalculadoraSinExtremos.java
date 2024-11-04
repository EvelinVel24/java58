package main.java.com.example;
import java.util.List;
import java.util.stream.Collectors;

public class CalculadoraSinExtremos implements ICalculadora {
    private List<Alumno> alumnos;

    public CalculadoraSinExtremos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public List<Alumno> calcularPromedios() {
        for (Alumno alumno : alumnos) {
            List<Integer> notasOrdenadas = alumno.getNotas().stream().sorted().collect(Collectors.toList());
            if (notasOrdenadas.size() > 2) {
                notasOrdenadas = notasOrdenadas.subList(1, notasOrdenadas.size() - 1);
            }
            float promedio = (float) notasOrdenadas.stream().mapToInt(Integer::intValue).average().orElse(0);
            alumno.setPromedio(promedio);
        }
        return alumnos;
    }
}


