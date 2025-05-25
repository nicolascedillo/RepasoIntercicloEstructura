public class EstudiantesController {
    public void ordenarPorFaculad(Estudiante[] estudiantes){
        int n = estudiantes.length;
        for (int i = 0; i<n-1;i++){
            int inx = i;
            for (int j = i+1; j<n;j++){
                if (estudiantes[j].getCarrera().getFacultad().getNombre().compareTo(estudiantes[inx].getCarrera().getFacultad().getNombre())<0){
                    inx = j;
                }
            }
            if (inx != i){
                Estudiante aux = estudiantes[i];
                estudiantes[i] = estudiantes[inx];
                estudiantes[inx] = aux;
            }
        }
    }

    public void ordenarPorMateriasAprovadas(Estudiante[] estudiantes){
        int n = estudiantes.length;
        for (int i = 0; i<n-1;i++){
            int inx = i;
            for (int j = i+1; j<n;j++){
                int numArpovadas = 0;
                for (MateriaCursada ma: estudiantes[j].getMaterias()){
                    if (ma.isProvada()){
                        numArpovadas ++;
                    }
                }
                int numArpovadasInx = 0;
                for (MateriaCursada ma: estudiantes[inx].getMaterias()){
                    if (ma.isProvada()){
                        numArpovadasInx ++;
                    }
                }
                if (numArpovadas<numArpovadasInx){
                    inx = j;
                }
            }
            if (inx != i){
                Estudiante aux = estudiantes[i];
                estudiantes[i] = estudiantes[inx];
                estudiantes[inx] = aux;
            }
        }
    }
}
