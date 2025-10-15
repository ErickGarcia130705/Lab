public class Main {
    public static void main(String[] args) {
        Controlador planificador = new Controlador();

        planificador.agregar(new ProcesoCPU(1, "Compilación"));
        planificador.agregar(new ProcesoEntradaSalida(2, "Lectura de disco"));
        planificador.agregar(new ProcesoDeamons(3, "Logger"));

        System.out.println("Cola inicial");
        for (Proceso p : planificador.obtenerCola()) {
            System.out.println("- PID " + p.getId() + " | " + p.getNombre());
        }

        System.out.println("\n>> Ejecutar 2 procesos :");
        for (String log : planificador.ejecutar(2)) {
            System.out.println(log);
        }

        System.out.println("\n>> Ejecutar lo restante:");
        for (String log : planificador.ejecutar()) {
            System.out.println(log);
        }
    }
}
