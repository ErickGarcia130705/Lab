class ProcesoCPU extends Proceso {
    public ProcesoCPU(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public String ejecutar() {
        return "CPU " + nombre + " realiza cálculos ";
    }
}
