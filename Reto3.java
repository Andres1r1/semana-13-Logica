import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double edades = 0;

        for (int i=0; i<3; i++) {
        
            System.out.println("Ingresa la edad del animal:");
            double edad = scanner.nextDouble();
            
            edades += edad;
        
        }

        scanner.close();

        System.out.println("el promedio de edades es: " + edades/3);
    }
}
