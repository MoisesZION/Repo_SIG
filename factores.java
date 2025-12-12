import java.util.Scanner;

public class factores {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;

        System.out.println("Ingresa un numero");
        n = leer.nextInt();

        System.out.print("Los factores primos del numero " + n + " son: ");
        FactoresPrimos(n);
    }

    public static void FactoresPrimos(int n) {
        int i;

        for (i = 2; i <= n && n > 1; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
    }
}
