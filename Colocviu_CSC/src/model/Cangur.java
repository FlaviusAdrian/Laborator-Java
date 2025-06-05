package model;

public class Cangur extends Animal {
    private double lungimeSaritura;
    private boolean arePungaMarsupiala;

    public Cangur(String nume, TipRana rana, double lungimeSaritura, boolean arePungaMarsupiala) {
        super(nume, rana);
        this.lungimeSaritura = lungimeSaritura;
        this.arePungaMarsupiala = arePungaMarsupiala;
    }

    @Override
    public String getSpecie() { return "Cangur"; }
}