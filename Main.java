import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca = "Melita";
        int capacidadAgua = 1000;
        int capacidadLeche = 500;
        int capacidadCafe = 200;
        Cafetera cafetera = new Cafetera(marca, capacidadAgua, capacidadLeche, capacidadCafe);

        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n--- MENÚ DE LA CAFETERA ---");
            System.out.println("1. Encender cafetera");
            System.out.println("2. Apagar cafetera");
            System.out.println("3. Cargar insumos");
            System.out.println("4. Preparar bebida");
            System.out.println("5. Mostrar estado");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cafetera.prender();
                    break;
                case 2:
                    cafetera.apagar();
                    break;
                case 3:
                    if (!cafetera.encendida) {
                        System.out.print("Cuánto agua quieres cargar (ml)? ");
                        int agua = sc.nextInt();
                        cafetera.recargarAgua(agua);

                        System.out.print("Cuánto café quieres cargar (g)? ");
                        int cafe = sc.nextInt();
                        cafetera.recargarCafe(cafe);

                        System.out.print("Cuánta leche quieres cargar (ml)? ");
                        int leche = sc.nextInt();
                        cafetera.recargarLeche(leche);
                    } else {
                        System.out.println("Apaga la cafetera antes de cargar insumos.");
                    }
                    break;
                case 4:
                    System.out.println("Qué bebida quieres preparar?");
                    System.out.println("1. Café ");
                    System.out.println("2. Capuchino");
                    System.out.println("3. Latte");
                    System.out.print("Elige: ");
                    int bebida = sc.nextInt();
                    switch (bebida) {
                        case 1:
                            cafetera.prepararCafe();
                            break;
                        case 2:
                            cafetera.prepararCapuchino();
                            break;
                        case 3:
                            cafetera.prepararLatte();
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;
                case 5:
                    cafetera.mostrarInfo();
                    break;
                case 6:
                    System.out.println("¡Gracias por usar la cafetera!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

        sc.close();
    }
}
