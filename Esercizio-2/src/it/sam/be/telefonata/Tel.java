package it.sam.be.telefonata;

public class Tel {
    private String numero;
    private int durata;
    public Tel(String _n,int _d){
        this.numero=_n;
        this.durata=_d;
    }
    public String getn() {return numero;}
    public int getd() {return durata;}
}
