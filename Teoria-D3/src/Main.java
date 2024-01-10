import it.sam.be.automobili.Automobile;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Teoria D3");

        Automobile auto = new Automobile(1200, "AA 000 AA");
        Automobile auto2 = auto;

        System.out.println(auto.isMotoreAcceso());
        auto2.accendiMotore();
        System.out.println(auto.isMotoreAcceso());
        System.out.println(auto2.isMotoreAcceso());


    }
}