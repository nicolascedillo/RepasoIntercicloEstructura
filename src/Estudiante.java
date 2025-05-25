import java.util.List;

public class Estudiante {

    private String nombre;
    private int edad;
    private Carrera carrera;
    private List<MateriaCursada> materias;

    public Estudiante(String nombre, int edad, Carrera carrera, List<MateriaCursada> materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + "]";
    }

    public List<MateriaCursada> getMaterias() {
        return materias;
    } 

    
}
