import java.util.Scanner;

public class CompruebaParidad {

    // En esta aplicación, el usuario introduce un número entero y
    // la acción que quiere realizar: o bien comprobar si el número
    // es par, o bien comprobar si es impar
    public static void main(String args[]) {

        // En esta variable guardaré el número que introduzca el usuario
        int numero;

        // En esta variable guardaré la palabra “par” o la palabra “impar”,
        // dependiendo de lo que haya decidido el usuario
        String opcion;

        // ¡Esta función “pideNumero” no la he hecho yo! La hizo un
        // compañero hace unos años. Se supone que pide al usuario un
        // número y lo captura correctamente. Espero que funcione bien…
        numero = pideNumero();

        // ¡Esta función “pideOpcion” tampoco la hice yo! En teoría, devuelve
        // “PAR” o “IMPAR”, dependiendo de lo que elija el usuario.
        // ¿Lo hará correctamente? Ojalá.
        opcion = pideOpcion();

        // El siguiente código sí que es mío, y he comprobado personalmente
        // su funcionamiento: todo ok
        if(opcion.equals("PAR")) {
            if(numero%2 == 0) {
                System.out.println("Si que lo es!");
            }
            else {
                System.out.println("Pues no, no lo es");
            }
        }
        if(opcion.equals("IMPAR")) {
            if(numero%2 == 0) {
                System.out.println("Pues no, no lo es");
            }
            else {
                System.out.println("Si que lo es!");
            }
        }
        // ¡Y HASTA AQUÍ HAY QUE MIRAR! Ignorad el resto del código
    }











    // Esta función no es mía, así que ni la miro (¡seguramente será tan
    // complicada que no entenderé nada!)
    public static int pideNumero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        int a = teclado.nextInt();

        a++;
        return a;
    }

    // Esta función tampoco es mía, así que tampoco la miro (¡seguramente será
    // tan complicada que no entenderé nada!)
    public static String pideOpcion() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué quieres comprobar? Escribe la palabra PAR o IMPAR (en mayúsculas, por favor)");
        String a = teclado.nextLine() ;
        return a;
    }

}




