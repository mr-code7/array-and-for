import java.util.Scanner;

public class prova {
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il numero di giocatori");
        int nGiocatori = tastiera.nextInt();
        int[] array = new int[nGiocatori];
        array[0] = 3;
        int i = 0;
        while (i < nGiocatori) {
            System.out.println("inserisci il punteggio del giocatore" + i);
            array[i] = tastiera.nextInt();
            i++; // i = i + 1;
        }
        int j;
        for (j = 0; j < nGiocatori; j++) {
            System.out.println(j);
        }
        System.out.println("fuori dal ciclo: " + j);

    }
}