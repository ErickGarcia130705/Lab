abstract class Proceso {
    protected int id;
    protected String nombre;

    public Proceso(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }

    public abstract String ejecutar(); 
}
