package it.sam.be.rettangoli;

public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo(int _altezza, int _larghezza){
        this.altezza = _altezza;
        this.larghezza = _larghezza;
    }

    public int perimetro (){
        int p = (this.altezza + this.larghezza) * 2;
        return p;
    }

    public int area(){
        int a = this.altezza * this.larghezza;
        return a;
    }
}
