import java.util.Scanner;

/**
 * Created by erickchali on 2/22/15.
 */
public class IniciarJuego {
    public int nivel,l1=3,l2=5,l3=7;
    public String p1,pa1,pa2,pa3,palabra,man,manoi="\\",manod="/",centro="|",piei="_",pied="_",cabeza="O",cadena;
    public String[] palabras;
    public char[] construyendo;
    public String[] n1 = new String[3];
    public String[] n2 = new String[5];
    public String[] n3 = new String[7];
    public int vidas,puntos;
    public int[] niv1;
    public int[] niv2;
    public int[] niv3;
    public int posicion;

    public IniciarJuego(){
        niv1 = new int[3];
        niv2 = new int[5];
        niv3 = new int[7];
        palabras = new String[10];
        palabras[0] = "oso";
        palabras[1] = "otornitorrinco";
        palabras[2] = "avion";
        palabras[3] = "computadora";
        palabras[4] = "jimena";
        palabras[5] = "luminoso";
        palabras[6] = "variable";
        palabras[7] = "periferico";
        palabras[8] = "kilogramo";
        palabras[9] = "herencia";
        man = manoi+cabeza+manod+"\n"+piei+centro+pied;
        n1[0] = "";
        n1[1] = "";
        n1[2] = "";
        n2[0] = "";
        n2[1] = "";
        n2[2] = "";
        n2[3] = "";
        n2[4] = "";
        n3[0] = "";
        n3[1] = "";
        n3[2] = "";
        n3[3] = "";
        n3[4] = "";
        n3[5] = "";
        n3[6] = "";
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
        System.out.println("Ingrese su nombre jugador\n");
        p1 = j.next();
        if(p1.equals("")){
            System.out.println("El jugador debe ingresar su nombre.\n");
            iniciarJugadores();
        }else {
            generarPalabras();
        }
    }
    public void generarPalabras(){
        if(nivel == 1){
            for(int x=0;x<=2;x++){
                do {
                    posicion = (int) (Math.random()*(9-0+1)+0);
                }while(verficarPalabraN1(posicion));
                niv1[x]=posicion;
                n1[x]=palabras[posicion];
            }
            for(int x=0;x<=2;x++){
                System.out.println("Palabra: " + n1[x]+ " " + niv1[x]);
            }
            jugarNivel1();
        }else if(nivel == 2){
            for(int x=0;x<=4;x++){
                do {
                    posicion = (int) (Math.random()*(9-0+1)+0);
                }while(verficarPalabraN2(posicion));
                niv2[x]=posicion;
                n2[x]=palabras[posicion];
            }
            for(int x=0;x<=4;x++){
                System.out.println("Palabra: " + n2[x]+ " " + niv2[x]);
            }
            jugarNivel2();
        }else{
            for(int x=0;x<=6;x++){
                do {
                    posicion = (int) (Math.random()*(9-0+1)+0);
                }while(verficarPalabraN3(posicion));
                niv3[x]=posicion;
                n3[x]=palabras[posicion];
            }
            for(int x=0;x<=6;x++){
                System.out.println("Palabra: " + n3[x]+ " " + niv3[x]);
            }
            jugarNivel3();
        }
    }

    private void jugarNivel1() {
        int longitud = 0,jugando;
        cadena = "";
        for (int x=0;x<=2;x++){
            jugando=x;
            for (int y=0;y<n1[x].length();y++){
                cadena = cadena + "*";
            }
            System.out.println(man+ "\n\n" +cadena);
            pedirLetra(jugando);
            cadena = "";
        }

    }
    private void jugarNivel2() {
        int longitud = 0,jugando;
        cadena = "";
        for (int x=0;x<=4;x++){
            jugando=x;
            for (int y=0;y<n1[x].length();y++){
                cadena = cadena + "*";
            }
            System.out.println(man+ "\n\n" +cadena);
            pedirLetra2(jugando);
            cadena = "";
        }

    }
    private void jugarNivel3() {
        int longitud = 0,jugando;
        cadena = "";
        for (int x=0;x<=6;x++){
            jugando=x;
            for (int y=0;y<n1[x].length();y++){
                cadena = cadena + "*";
            }
            System.out.println(man+ "\n\n" +cadena);
            pedirLetra3(jugando);
            cadena = "";
        }

    }

    private void pedirLetra(int jugando) {
        vidas=6;
        cadena="";
        construyendo = new char[n1[jugando].length()];
        for (int x=0;x<n1[jugando].length();x++){
            construyendo[x]= '*';
        }
        String letra = "";
        char letter;
        int position;
        char[] palabraConvertida = n1[jugando].toCharArray();
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Ingrese una letra para ver si existe.");
            letter = entrada.next().charAt(0);
            position = n1[jugando].indexOf(letter);
            for (int x=0;x<n1[jugando].length();x++){
                if(letter==palabraConvertida[x]){
                    construyendo[x]=letter;

                    puntos=puntos+1;
                }
            }
            if (position<0){
                vidas--;
            }
            System.out.println(construyendo);
        }while(vidas!=0);


    }
    private void pedirLetra2(int jugando) {
        vidas=6;
        cadena="";
        construyendo = new char[n2[jugando].length()];
        for (int x=0;x<n2[jugando].length();x++){
            construyendo[x]= '*';
        }
        String letra = "";
        char letter;
        int position;
        char[] palabraConvertida = n2[jugando].toCharArray();
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Ingrese una letra para ver si existe.");
            letter = entrada.next().charAt(0);
            position = n2[jugando].indexOf(letter);
            for (int x=0;x<n2[jugando].length();x++){
                if(letter==palabraConvertida[x]){
                    construyendo[x]=letter;

                    puntos=puntos+1;
                }
            }
            if (position<0){
                vidas--;
            }
            System.out.println(construyendo);
        }while(vidas!=0);


    }
    private void pedirLetra3(int jugando) {
        vidas=6;
        cadena="";
        construyendo = new char[n3[jugando].length()];
        for (int x=0;x<n3[jugando].length();x++){
            construyendo[x]= '*';
        }
        String letra = "";
        char letter;
        int position;
        char[] palabraConvertida = n3[jugando].toCharArray();
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Ingrese una letra para ver si existe.");
            letter = entrada.next().charAt(0);
            position = n3[jugando].indexOf(letter);
            for (int x=0;x<n3[jugando].length();x++){
                if(letter==palabraConvertida[x]){
                    construyendo[x]=letter;

                    puntos=puntos+1;
                }
            }
            if (position<0){
                vidas--;
            }
            System.out.println(construyendo);
        }while(vidas!=0);


    }

    private boolean verficarPalabraN1(int posicion) {
        int cont = 0;
        for (int x=0;x<=2;x++){
            if(niv1[x]==posicion){
                cont++;
            }
        }
        if(cont>0){
            return true;
        }else {
            return false;
        }

    }
    private boolean verficarPalabraN2(int posicion) {
        int cont = 0;
        for (int x=0;x<=4;x++){
            if(niv2[x]==posicion){
                cont++;
            }
        }
        if(cont>0){
            return true;
        }else {
            return false;
        }

    }
    private boolean verficarPalabraN3(int posicion) {
        int cont = 0;
        for (int x=0;x<=4;x++){
            if(niv3[x]==posicion){
                cont++;
            }
        }
        if(cont>0){
            return true;
        }else {
            return false;
        }

    }

}
