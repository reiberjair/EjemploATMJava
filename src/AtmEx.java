import java.util.Scanner;

public class AtmEx {
    public static void main(String[] args) {
        var saldo = 1000.00;
        var consola = new Scanner(System.in);
        var sistema = false;

        System.out.print("***Sistena de Cajero Automatico***");
        while(!sistema){
            System.out.print("""
                    \n----------------------------------------- 
                    1. Consultar tu saldo.
                    2. Depositar dinero.
                    3. Retirar dinero.
                    4. Salir del sistema.
                   ----------------------------------------- \n
                    Seleccion la operacion que desea realizar:\s""");
            var opcion = Integer.parseInt(consola.nextLine());

            switch (opcion){
              case 1 -> System.out.printf("Tu saldo es: %.2f%n%n", saldo);
              case 2 -> {
                  System.out.print("Ingrese monto a depositar: ");
                  var deposito = Double.parseDouble(consola.nextLine());
                  saldo += deposito;
                  System.out.printf("Su nuevo saldo es: %.2f%n%n", saldo);
              }
              case 3 -> {
                  System.out.println("Ingrese el monto a retirar: ");
                  var retiro = Double.parseDouble(consola.nextLine());
                  if(retiro <= saldo){
                      saldo -= retiro;
                      System.out.printf("Su saldo ahora es: %.2f%n%n", saldo);
                  } else {
                      System.out.printf("No tienes el saldo suficiente." +
                              " Tu saldo es: %.2f%n%n", saldo);
                  }

              }
              case 4 -> {
                  System.out.println("Saliendo del sistema... Regresa pronto :)");

                  sistema = true;
              }
                default -> System.out.println("Opcion invalida! Ingrese una opcion valida por favor.");
            }
        }

        System.out.println("Sistema finalizado...");
    }
}
