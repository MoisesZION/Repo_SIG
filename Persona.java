public class Persona {

    String nombre;
    int actividad;

    public Persona(String nombre, int actividad) {
        this.nombre = nombre;
        this.actividad = actividad;
    }

    public void hacerActividad() {

        if (actividad == 1) {
            System.out.println(nombre + " va a estudiar");
        }

        if (actividad == 2) {
            System.out.println(nombre + " va a chambear");
        }

        if (actividad == 3) {
            System.out.println(nombre + " va a caminar");
        }

        for (int i = 1; i <= 2; i++) {
            System.out.println(nombre + " sigue con su actividad");
        }
    }
}
