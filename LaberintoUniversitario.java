import java.util.Random;
import java.util.Scanner;

public class LaberintoUniversitario {

    public static void main(String[] args) {
        int[][] laberinto = new int[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generar el laberinto con valores aleatorios del 1 al 9
        for (int fila = 0; fila < laberinto.length; fila++) {
            for (int col = 0; col < laberinto[fila].length; col++) {
                laberinto[fila][col] = random.nextInt(9) + 1;
            }
        }

        // Mostrar el laberinto generado
        System.out.println("=== LABERINTO UNIVERSITARIO ===");
        mostrarMatriz(laberinto);

        // Instrucciones del reto
        System.out.println("""
        ¡Bienvenido al Laberinto Universitario!
        Este sistema representa los pasillos secretos de tu facultad.
        Cada número indica un nivel de energía en ese punto.
        Tu misión es explorar este laberinto cumpliendo los siguientes desafíos:

        1. Contar cuántos números pares hay mayores a 4. ⚡ listo
        2. Calcular el promedio de los números impares. 🎯
        3. Calcular la suma de los valores de cada fila. 🧮 listo
        4. BONUS: Encuentra la posición del mayor número del laberinto. 👑
        """);

        // Aquí puedes invocar los métodos para cada uno de los puntos anteriores
        // Por ejemplo:
        // contarParesMayoresA4(laberinto);
        // promedioImpares(laberinto);
        // etc...

        scanner.close();
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    // Aquí puedes agregar los métodos necesarios para resolver el laberinto
    // Ejemplo:
    // public static void contarParesMayoresA4(int[][] matriz) { ... }

    public static void numerosPares (int[][] matriz){
        for(int i = 0; i < 5; i++){
            int paresFilas = 0;
            int pares = (i % 2);
            if(pares == 0){
                pares ++;
            }
        }
    }

    public class promedioImpares (int[][] matriz){
        int n = 5; // Número de elementos a considerar
        int suma = 0;
        int contador = 0;

        for (int i = 1; i <= n; i += 2) {
            suma += i;
            contador++;
        }

        double promedio = (double) suma / contador;

        System.out.println("El promedio de los primeros " + n + " números impares es: " + promedio);
    
    }

    public static void sumaFilas (int[][] matriz){
        for(int i = 0; i < 5; i++){
            int sumaFilas = 0;
            for(int j = 0; i < 5; i++){
                sumaFila+= matriz [i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }
    }



}
