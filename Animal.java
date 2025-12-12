public class Animal {

    String nombre;
    int tipo;

    public Animal(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerAcciones() {

        if (tipo == 1) {
            System.out.println(nombre + " mueve la cola");

            int i = 1;
            while (i <= 2) {
                System.out.println(nombre + " ladra");
                i++;
            }

            System.out.println(nombre + " se para en dos patas");
        }

        if (tipo == 2) {
            System.out.println(nombre + " maulla");

            for (int i = 1; i <= 2; i++) {
                System.out.println(nombre + " da cabezazos");
            }

            System.out.println(nombre + " abraza y salta");
        }
    }
}
