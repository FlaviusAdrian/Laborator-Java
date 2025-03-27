package model;

public class MatriceComplexe {
    private Complex[][] matrice;
    private int numarLinii;
    private int numarColoane;

    public MatriceComplexe(int linii, int coloane) {
        this.numarLinii = linii;
        this.numarColoane = coloane;
        this.matrice = new Complex[linii][coloane];
    }

    public void setElement(int linie, int coloana, Complex element) {
        matrice[linie][coloana] = element;
    }

    public Complex getElement(int linie, int coloana) {
        return matrice[linie][coloana];
    }

    public MatriceComplexe adunare(MatriceComplexe m) {
        if (this.numarLinii != m.numarLinii || this.numarColoane != m.numarColoane) {
            throw new IllegalArgumentException("Matricele trebuie să aibă aceleași dimensiuni.");
        }

        MatriceComplexe rezultat = new MatriceComplexe(this.numarLinii, this.numarColoane);
        for (int i = 0; i < numarLinii; i++) {
            for (int j = 0; j < numarColoane; j++) {
                Complex suma = this.matrice[i][j].adunare(m.matrice[i][j]);
                rezultat.setElement(i, j, suma);
            }
        }
        return rezultat;
    }

    public MatriceComplexe scadere(MatriceComplexe m) {
        if (this.numarLinii != m.numarLinii || this.numarColoane != m.numarColoane) {
            throw new IllegalArgumentException("Matricele trebuie să aibă aceleași dimensiuni.");
        }

        MatriceComplexe rezultat = new MatriceComplexe(this.numarLinii, this.numarColoane);
        for (int i = 0; i < numarLinii; i++) {
            for (int j = 0; j < numarColoane; j++) {
                Complex diferenta = this.matrice[i][j].scadere(m.matrice[i][j]);
                rezultat.setElement(i, j, diferenta);
            }
        }
        return rezultat;
    }

    public MatriceComplexe inmultire(MatriceComplexe m) {
        if (this.numarColoane != m.numarLinii) {
            throw new IllegalArgumentException("Numărul de coloane al primei matrice trebuie să fie egal cu numărul de linii al celei de-a doua matrice.");
        }

        MatriceComplexe rezultat = new MatriceComplexe(this.numarLinii, m.numarColoane);
        for (int i = 0; i < this.numarLinii; i++) {
            for (int j = 0; j < m.numarColoane; j++) {
                Complex suma = new Complex(0, 0);
                for (int k = 0; k < this.numarColoane; k++) {
                    suma = suma.adunare(this.matrice[i][k].inmultire(m.matrice[k][j]));
                }
                rezultat.setElement(i, j, suma);
            }
        }
        return rezultat;
    }

    public MatriceComplexe inmultireCuScalar(double scalar) {
        MatriceComplexe rezultat = new MatriceComplexe(this.numarLinii, this.numarColoane);
        for (int i = 0; i < numarLinii; i++) {
            for (int j = 0; j < numarColoane; j++) {
                Complex produs = this.matrice[i][j].inmultireCuScalar(scalar);
                rezultat.setElement(i, j, produs);
            }
        }
        return rezultat;
    }

    public void afisareMatrice() {
        for (int i = 0; i < numarLinii; i++) {
            for (int j = 0; j < numarColoane; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
