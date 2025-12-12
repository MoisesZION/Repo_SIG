public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Moises", 1);
        Persona p2 = new Persona("Loren", 2);
        Persona p3 = new Persona("Natalia", 3);

        Animal a1 = new Animal("Papi", 1);
        Animal a2 = new Animal("Chimuelo", 2);
        Animal a3 = new Animal("Ashoka", 2);

        p1.hacerActividad();
        p2.hacerActividad();
        p3.hacerActividad();

        a1.hacerAcciones();
        a2.hacerAcciones();
        a3.hacerAcciones();
    }
}
