package it.sam.be.automobili;

public class Automobile {
    //ATTRIBUTI ( non è obbligatorio inizializzarli)
    private int numeroRuote = 4;
    private int cilindrata;
    private String targa;
    private boolean motoreAcceso = false;


    // COSTRUTTORE ( ha SEMPRE lo stesso nome della classe )
    public  Automobile(int _cilindrata, String _targa){
        System.out.println("ho instanziato e costruito la classe");
        this.cilindrata = _cilindrata;
        this.targa = _targa;
    }


    // METODI DELLA CLASSE
    public void accendiMotore(){
        System.out.println("si sta accendendo il motore");
        this.motoreAcceso = true;
        System.out.println(isMotoreAcceso());
    }

    public void spegniMotore(){
        System.out.println("si sta spegnendo il motore");
        this.motoreAcceso = false;
        System.out.println(isMotoreAcceso());
    }

    public boolean isMotoreAcceso() {
        return motoreAcceso;
    }
}
