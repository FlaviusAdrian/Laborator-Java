package figuri;

public class Pion extends Figura {

    public Pion(char culoare, String pozitie) {
        super(culoare, pozitie);
    }

    @Override
    public boolean esteMutareValida(String destinatie) {
        int distantaColoana = Math.abs(destinatie.charAt(0) - pozitie.charAt(0));
        int distantaRand = Math.abs(destinatie.charAt(1) - pozitie.charAt(1));

        if (distantaColoana == 0 && distantaRand == 1) {
            return true;
        } else if (distantaColoana == 0 && distantaRand == 2 && (culoare == 'B' && pozitie.charAt(1) == '2' || culoare == 'N' && pozitie.charAt(1) == '7')) {
            return true;
        }
        return false;
    }
}