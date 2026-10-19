import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String contraseña;

        System.out.println("Ingresar contraseña:");
        contraseña = scanner.nextLine();

        while (!contraseña.equals("JAVA2026")) {

            System.out.println("Contraseña incorrecta");
            System.out.println("Vueleve a intentarlo");
        
            contraseña = scanner.nextLine();
        }

        scanner.close();

        System.out.println("Contraseña correcta");
    }
}
