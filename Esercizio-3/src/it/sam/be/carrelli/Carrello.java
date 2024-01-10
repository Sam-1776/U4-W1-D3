package it.sam.be.carrelli;

import it.sam.be.articoli.Articolo;

public class Carrello {
    private String cAs;
    private Articolo[] eA;
    private float tot;

    public Carrello(String _cAs, Articolo[] _eA, float _tot){
        this.cAs = _cAs;
        this.eA = _eA;
        this.tot = _tot;
    }

    public String stampaDatiCarrello(){
        String str = "Cliente:" + this.cAs + "\n";
        for (int i = 0; i < this.eA.length; i++) {
            str += this.eA[i].codiceArticolo() + " " + this.eA[i].calcSingProdotto() +"\n";
        }
        str += "Totale:" + this.tot;
        return str;
    }


}
