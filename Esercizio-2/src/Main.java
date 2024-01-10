import it.sam.be.sim.CardSim;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 2");
        CardSim sim1;
        sim1 = new CardSim("453467732245", 0, 5);

        sim1.caricaC(5);
        sim1.chiamata("748593957389", 10);
        sim1.chiamata("723945734953", 4);
        sim1.chiamata("334235959385", 7);
        sim1.caricaC(20);
        sim1.chiamata("283957836283", 20);
        sim1.chiamata("902094857648", 10);

        System.out.println(sim1.stampaDati());
    }
}