package it.sam.be.articoli;

public class Articolo {
    private String cA;
    private String dA;
    private float prezzo;
    private int nA;

    public Articolo(String _cA, String _dA, float _prezzo, int _nA){
        this.cA = _cA;
        this.dA = _dA;
        this.prezzo = _prezzo;
        this.nA = _nA;
    }

    public float prezzo(){
        return this.prezzo;
    }

    public String codiceArticolo(){
        return this.cA;
    }

    public float calcSingProdotto(){
        float t = this.prezzo / this.nA;
        return t;
    }

    public void stampaDatiArticolo(){
        System.out.println("Codice articolo:" + this.cA + " Descrizione articolo:" + this.dA);
        System.out.println("Prezzo articolo:" + this.prezzo + " Quantità:" + this.nA);
    }
}
