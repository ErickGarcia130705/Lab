class ProcesoEntradaSalida extends Proceso {
    public ProcesoEntradaSalida(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public String ejecutar() {
        return "E/S " + nombre + " espera al dispositivo";
    }
}
