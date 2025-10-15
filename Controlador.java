import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Controlador {
    private Queue<Proceso> cola = new ArrayDeque<>();

    public void agregar(Proceso p) {
        cola.add(p);
    }

    public List<String> ejecutar() {
        List<String> logs = new ArrayList<>();
        while (!cola.isEmpty()) {
            Proceso p = cola.poll();
            logs.add(p.ejecutar());
        }
        return logs;
    }

    public List<String> ejecutar(int veces) {
        List<String> logs = new ArrayList<>();
        for (int i = 0; i < veces && !cola.isEmpty(); i++) {
            Proceso p = cola.poll();
            logs.add(p.ejecutar());
        }
        return logs;
    }

    public List<Proceso> obtenerCola() {
        return new ArrayList<>(cola);
    }
}
