import java.util.Scanner;

/**
 * Created by erickchali on 2/22/15.
 */
public class IniciarJuego {
    public int nivel;
    public String p1,pa1,pa2,pa3;
    public String[] palabras = {"hola","adios","erick","oso","ornitorrinco","edificio","edificacion","pincel","camello","perico"};
    public String[] n1 = new String[3];
    public String[] n2 = new String[5];
    public String[] n3 = new String[7];
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
        System.out.println("Ingrese su nombre del primer jugador\n");
        p1 = j.next();
        if(p1.equals("")){
            System.out.println("El jugador debe ingresar su nombre.\n");
            iniciarJugadores();
        }else {
            generarPalabras();
        }
    }
    public void generarPalabras(){
        Scanner palabra = new Scanner(System.in);
        int posicion;
        if(nivel == 1){
            for(int x=0;x<=2;x++){
                posicion = (int)(Math.random()*9+1);
                n1[x]=palabras[posicion];
            }
            for(int x=0;x<=2;x++){
                System.out.println("Palabra: " + n1[x]);
            }
        }
    }

}
