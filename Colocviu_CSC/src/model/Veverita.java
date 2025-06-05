package model;

public class Veverita extends Animal {
    private boolean areCoadaStufoasa;

    public Veverita(String nume, TipRana rana, boolean areCoadaStufoasa) {
        super(nume, rana);
        this.areCoadaStufoasa = areCoadaStufoasa;
    }

    @Override
    public String getSpecie() { return "Veverita"; }
}