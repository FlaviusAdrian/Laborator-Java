package model;

public class Koala extends Animal {
    private int oreSomnPeZi;
    private boolean manancaEucalipt;

    public Koala(String nume, TipRana rana, int oreSomnPeZi, boolean manancaEucalipt) {
        super(nume, rana);
        this.oreSomnPeZi = oreSomnPeZi;
        this.manancaEucalipt = manancaEucalipt;
    }

    @Override
    public String getSpecie() { return "Koala"; }
}