import java.util.Scanner;

/**
 * Created by erickchali on 2/22/15.
 */
public class IniciarJuego {
    public int numeroJug, nivel;
    public String p1,p2,p3,pa1,pa2,pa3,pa4,pa5,pa6,pa7;
    public char[] pj1,pj2,pj3;
    public IniciarJuego(){
        seleccionarNivel();
    }
    public int seleccionarNivel(){
        Scanner n = new Scanner(System.in);
        try {
            System.out.println("Seleccione un nivel del 1 al 3");
            nivel = n.nextInt();
            iniciarJugadores();
        }catch(NumberFormatException e){
            System.out.println("Debe ingresar un nivel del 1 al 3 unicamente\n");
            seleccionarNivel();
        }
        return nivel;
    }
    public void iniciarJugadores(){
        Scanner j = new Scanner(System.in);
        System.out.println("Ingrese el numero del primer jugador\n");
        p1 = j.next();
        System.out.println("Ingrese el numero del segundo jugador\n");
        p2 = j.next();
        System.out.println("Ingrese el numero del tercer jugador\n");
        p3 = j.next();
        if(p1.equals("")||p2.equals("")||p3.equals("")){
            System.out.println("Debe ingresar los nombres de todos los jugadores\n");
            iniciarJugadores();
        }else{
            pedirPalabra();
        }
    }
    public void pedirPalabra(){
        Scanner palabra = new Scanner(System.in);
        System.out.println(p1.toUpperCase() + " ingrese las palabras a jugar");
        if(nivel == 1){
            System.out.println(p1.toUpperCase() + " ingrese la primera palabra");
            pa1 = palabra.next();
            System.out.println(p1.toUpperCase() + " ingrese la primera palabra");
            pa2 = palabra.next();
            System.out.println(p1.toUpperCase() + " ingrese la primera palabra");
            pa3 = palabra.next();
        }
    }

}
