import java.util.Scanner;

/**
 * Created by erickchali on 2/22/15.
 */
public class Launcher {

    public int numero(){
        Scanner s = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese un numero.");
        n = s.nextInt();
        return n;
    }
    public static void main(String args[]){
        Launcher l = new Launcher();
        System.out.println(l.numero()+10);
    }
}
