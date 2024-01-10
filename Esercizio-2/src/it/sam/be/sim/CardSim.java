package it.sam.be.sim;

import it.sam.be.telefonata.Tel;

public class CardSim {
    private String numero;
    private float credito;
    private int nC;
    private Tel T[];

    public CardSim(String _numero, float _credito, int _dim){
        this.numero = _numero;
        this.credito = _credito;
        this.nC = 0;
        this.T = new Tel[_dim];
    }

    public float caricaC (int x){
        this.credito = this.credito + x;
        return this.credito;
    }

    public void chiamata(String x, int y){
        if (this.nC < T.length) {
        Tel t = new Tel(x, y);
        this.T[this.nC] = t;
            this.credito = this.credito - (y / 4);
        this.nC++;
        }
    }


    public String stampaDati() {
        String st="numero:"+ this.numero +" credito:"+ this.credito + " N.chiamate:" + this.nC +"\n";
        for(int i=0;i < this.nC;i++)st+=T[i].getn()+" "+T[i].getd()+"\n";
        return st;
    }


}
