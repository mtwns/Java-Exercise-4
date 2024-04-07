public class Main {
    public static void main(String[] args) {
        int base = 7;

        for (int i = 0; i < base; i++) {
            // Espacios en blanco antes de los asteriscos
            for (int j = base - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Parte superior del árbol
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }

            System.out.println(); // Salto de línea después de imprimir una línea del árbol
        }
    }
}
