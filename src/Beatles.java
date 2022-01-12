import java.util.ArrayList;
import java.util.Scanner;

public class Beatles {

    private static ArrayList grupo = new ArrayList();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;
        do {
            menu();
            opcion = pideNumero();

            switch (opcion) {
                case 0:
                    opcion=10;
                    break;
                case 1:
                    anyadeMember();
                    break;
                case 2:
                    borraMember();
                    break;
                case 3:
                    listaGrupo();
                    break;
                case 4:
                    System.out.println("El tamaño del grupo es: " + tamanyoGrupo());

                default:
                    System.out.println(" Opción incorrecta, vuelva a seleccionar una opción del menú");
                    opcion=100;
            }

        } while (opcion != 10);

    }

    public static void menu() {
        System.out.println("===============================");
        System.out.println("=        MENU                 =");
        System.out.println("= 1 - Añadir Miembro Grupo    =");
        System.out.println("= 2 - Borrar Miembro Grupo    =");
        System.out.println("= 3 - Listar Grupo            =");
        System.out.println("= 4 - Tamaño del Grupo        =");
        System.out.println("===============================");
    }



    public static void anyadeMember() {

        teclado = new Scanner(System.in);
        System.out.println("Introduce nombre del componente banda");
        String miembro = teclado.nextLine();
        grupo.add(miembro);
    }

    public static void borraMember() {
        teclado = new Scanner(System.in);
        listaGrupo();
        System.out.println("Introduce posición del componente banda a borrar");
        int a = teclado.nextInt();
        grupo.remove(a);
    }

    public static int pideNumero() {
        teclado = new Scanner(System.in);
        System.out.println("Escoge una opción (número entero) o 0 para salir del menu");
        int a = teclado.nextInt();
        a--;
        return a;
    }

    public static void listaGrupo() {
        for (int i = 1; i < grupo.size(); i+=1) {
            System.out.println("Miembro de la banda: " + (i-1) + " nombre: " + grupo.get(i));
        }
    }

    public static int tamanyoGrupo() {
        return (grupo.size()+1);
    }

}

