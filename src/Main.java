import java.util.Scanner;

public class Main {
    static double saldo = 5000;
    static String nombre = "Tony";
    static String tipo = "Corriente";
    static Scanner scanner = new Scanner(System.in);
    static int opcion = 0;

    public static void main(String[] args) {

        System.out.println("****************************************\n");
        System.out.println("Nombre del cliente: " + nombre + "\nTipo de cuenta: " + tipo + "\nSaldo disponible: $" + saldo);
        System.out.println("\n****************************************");

        while (opcion != 9) {
            System.out.println("\n** Escriba el numero de la opcion deseada **\n1- Consultar saldo\n2- Retirar\n3- Depositar\n9- Salir\n");
            opcion = scanner.nextInt();
            switch (opcion){
                case(1):
                    System.out.println("El saldo actualizado es de: $" + saldo);
                    break;
                case(2):
                    retirar();
                    break;
                case(3):
                    depositar();
                    break;
                case(9):
                    System.out.println("Gracias por utilizar nuestros servicios!");
                    break;
                default:
                    System.out.println("Opcion no valida!");
            }
        }
    }

    private static void retirar() {
        System.out.println("Ingrese cuanto desea retirar: ");
        double valor = scanner.nextDouble();
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Se retiro: $" + valor + "\nSaldo restante: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente\nSaldo restante: $" + saldo);
        }
    }

    private static void depositar() {
        System.out.println("Ingrese cuanto desea retirar: ");
        double valor = scanner.nextDouble();
        saldo += valor;
        System.out.println("Saldo restante: $" + saldo);
    }
}