package figuri;

public class Rege extends Figura {

    public Rege(char culoare, String pozitie) {
        super(culoare, pozitie);
    }

    @Override
    public boolean esteMutareValida(String destinatie) {
        int distantaColoana = Math.abs(destinatie.charAt(0) - pozitie.charAt(0));
        int distantaRand = Math.abs(destinatie.charAt(1) - pozitie.charAt(1));

        return (distantaColoana <= 1 && distantaRand <= 1);
    }
}