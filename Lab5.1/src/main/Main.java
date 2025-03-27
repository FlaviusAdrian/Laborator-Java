package main;

import model.Complex;
import model.MatriceComplexe;

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);  
        Complex c2 = new Complex(1, 2); 
        Complex c3 = new Complex(5, -6); 

        System.out.println("Numărul complex c1: " + c1);
        System.out.println("Numărul complex c2: " + c2);

        Complex suma = c1.adunare(c2);
        System.out.println("Suma c1 + c2: " + suma);

        Complex diferenta = c1.scadere(c2);
        System.out.println("Diferența c1 - c2: " + diferenta);

        Complex produs = c1.inmultire(c2);
        System.out.println("Produsul c1 * c2: " + produs);

        Complex inmultireCuScalar = c1.inmultireCuScalar(2);
        System.out.println("c1 * 2: " + inmultireCuScalar);

        MatriceComplexe matrice = new MatriceComplexe(2, 2);
        
        matrice.setElement(0, 0, c1);
        matrice.setElement(0, 1, c2);
        matrice.setElement(1, 0, c3);
        matrice.setElement(1, 1, new Complex(-1, 1));

        System.out.println("\nMatricea complexă:");
        matrice.afisareMatrice();

        MatriceComplexe matrice2 = new MatriceComplexe(2, 2);
        matrice2.setElement(0, 0, new Complex(0, 1));
        matrice2.setElement(0, 1, new Complex(1, 1));
        matrice2.setElement(1, 0, new Complex(2, 2));
        matrice2.setElement(1, 1, new Complex(3, 3));

        MatriceComplexe sumaMatrice = matrice.adunare(matrice2);
        System.out.println("\nSuma matricelor:");
        sumaMatrice.afisareMatrice();

        MatriceComplexe inmultireMatrice = matrice.inmultire(matrice2);
        System.out.println("\nProdusul matricelor:");
        inmultireMatrice.afisareMatrice();

        MatriceComplexe inmultireScalar = matrice.inmultireCuScalar(2);
        System.out.println("\nMatricea înmulțită cu scalarul 2:");
        inmultireScalar.afisareMatrice();
    }
}
