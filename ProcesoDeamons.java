class ProcesoDeamons extends Proceso {
    public ProcesoDeamons(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public String ejecutar() {
        return "DEAMONS " + nombre + " corre en segundo plano.";
    }
}
