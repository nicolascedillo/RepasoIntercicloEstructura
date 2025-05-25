import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Datos
        Facultad filosofia = new Facultad("Filosofia");
        Facultad ciencias = new Facultad("Ciencias");
        Facultad salud = new Facultad("Salud");

        Carrera computacion = new Carrera("Compuatacion", ciencias);
        Carrera medicina = new Carrera("Medicina", salud);
        Carrera letras = new Carrera("Letras", filosofia);
        
        List<MateriaCursada> materiasCompu = new ArrayList<>();
        materiasCompu.add(new MateriaCursada("mate", true));
        materiasCompu.add(new MateriaCursada("Progra", true));
        materiasCompu.add(new MateriaCursada("algebra", true));
        
        List<MateriaCursada> materiasFilo = new ArrayList<>();
        materiasFilo.add(new MateriaCursada("Epistemología", true));
        materiasFilo.add(new MateriaCursada("Filosofía Antigua", false));
        materiasFilo.add(new MateriaCursada("Ética", false));

        List<MateriaCursada> materiasMed = new ArrayList<>();
        materiasMed.add(new MateriaCursada("Anatomía", false));
        materiasMed.add(new MateriaCursada("Fisiología", false));
        materiasMed.add(new MateriaCursada("Bioquímica", false));

        Estudiante estudiante1 = new Estudiante("Juan", 8, letras,materiasCompu);
        Estudiante estudiante2 = new Estudiante("Ana", 42, medicina,materiasMed);
        Estudiante estudiante3 = new Estudiante("Mateo", 19, computacion, materiasCompu);

        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = estudiante1;
        estudiantes[1] = estudiante2;
        estudiantes[2] = estudiante3;

        EstudiantesController eC = new EstudiantesController();
        eC.ordenarPorFaculad(estudiantes);

        for (Estudiante e: estudiantes){
            System.out.println(e + e.getCarrera().getFacultad().getNombre());
        }

        eC.ordenarPorMateriasAprovadas(estudiantes);

        for (Estudiante e: estudiantes){
            System.out.println(e + e.getCarrera().getFacultad().getNombre());
        }
    }
}
