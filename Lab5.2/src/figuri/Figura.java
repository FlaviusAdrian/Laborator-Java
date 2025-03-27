package figuri;

public abstract class Figura {
    protected char culoare;  
    protected String pozitie;

    public Figura(char culoare, String pozitie) {
        this.culoare = culoare;
        this.pozitie = pozitie;
    }

    public abstract boolean esteMutareValida(String destinatie);
    
    public char getCuloare() {
        return culoare;
    }

    public String getPozitie() {
        return pozitie;
    }
    
    public void setCuloare(char culoare) {
    	this.culoare = culoare;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }
}