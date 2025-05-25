public class MateriaCursada {
    private String nombre;
    private boolean provada;

    public String getNombre() {
        return nombre;
    }
    
    public MateriaCursada(String nombre, boolean provada) {
        this.nombre = nombre;
        this.provada = provada;
    }

    public boolean isProvada() {
        return provada;
    }
    
}
