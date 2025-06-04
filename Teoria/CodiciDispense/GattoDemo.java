//import java.util.Scanner;

class Gatto {
    private String nome;
    private String razza;
    private int eta;

    public void leggiNome(){
        nome = "Minu";
        razza = "Orange";
        eta = 2;

        System.out.println("Nome: " + nome + "\tRazza: " + razza + "\tEta': " + eta);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getRazza(){
        return razza;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getEta(){
        return eta;
    }
}

public class GattoDemo {
    public static void main(String[] args) {
        Gatto g = new Gatto();
        Gatto g1 = new Gatto();
        g.leggiNome();
        System.out.println(g);
        System.out.println(g1);
    }
}