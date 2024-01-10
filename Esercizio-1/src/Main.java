import it.sam.be.rettangoli.Rettangolo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Esercizio 1");

        Rettangolo ret1 = new Rettangolo(2, 3);
        Rettangolo ret2 = new Rettangolo(4, 6);

        System.out.printf("L'area e il perimetro del rettangolo sono: ");
        stampaRettangolo(ret1);
        stampaDueRettangoli(ret1, ret2);
    }

    public static void stampaRettangolo(Rettangolo x){
        System.out.println(x.area() + "," + x.perimetro());
    }

    public static void stampaDueRettangoli(Rettangolo x, Rettangolo y){
        System.out.println("Primo rettangolo " + x.area() + "," + x.perimetro());
        System.out.println("Secondo rettangolo " + y.area() + "," + y.perimetro());

        int sommaP = x.perimetro() + y.perimetro();
        int sommaA = x.area() + y.area();

        System.out.println("La somma dei perimetri è: " + sommaP);
        System.out.println("La somma delle aree è: " + sommaA);
    }
}