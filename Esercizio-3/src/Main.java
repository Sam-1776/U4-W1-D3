import it.sam.be.articoli.Articolo;
import it.sam.be.carrelli.Carrello;
import it.sam.be.clienti.Cliente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        private static Articolo arr[] = new Articolo[2];
        private static float conto;
        private static int counter = 0;
    public static void main(String[] args) {

        System.out.println("Esercizio 3");

        Cliente Piero = new Cliente("bfjah23u4hg", "Piero", "Fanelli", "pierofan@gmail.com", "20/01/2020");

        Articolo art1 = new Articolo("AA001", "lorem impsum", 3000, 10);
        Articolo art2 = new Articolo("AB001", "lorem ipsum", 2500, 5);


        Piero.stampaDatiCliente();
        inserisciArt(art1);
        inserisciArt(art2);
        art1.stampaDatiArticolo();
        Carrello cart = new Carrello( Piero.getcC(), arr, conto);
        System.out.println(cart.stampaDatiCarrello());
    }


    public static Articolo[] inserisciArt(Articolo x){
            arr[counter] = x;
            conto = totale(x.calcSingProdotto());
            counter++;
        return arr;
    };

    public static float totale(float x){
        float tot = conto;
        tot = tot + x;
        return tot;
    }
}