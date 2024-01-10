package it.sam.be.clienti;

public class Cliente {
    private String cC;
    private String nome;
    private String cognome;
    private String email;
    private String dI;

    public Cliente(String _cC, String _nome, String _cognome, String _email, String _dI){
        this.cC = _cC;
        this.nome = _nome;
        this.cognome = _cognome;
        this.email = _email;
        this.dI = _dI;
    }

    public String getcC(){
        return this.cC;
    }

    public void stampaDatiCliente(){
        System.out.println("Codice cliente:" + this.cC + " E-mail:" + this.email + " Data di Iscrizione:" + this.dI);
        System.out.println("Nome cliente:" + this.nome + " Cognome cliente:" + this.cognome);
    }
}
