import model.Animal;
import model.Koala;
import model.TipRana;
import model.Cangur;
import model.Clinica;
import model.Veverita;

import java.util.List;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();

        Animal a1 = new Cangur("Jack", TipRana.Grava, 2.5, true);
        Animal a2 = new Cangur("Lily", TipRana.Medie, 2.0, false);
        Animal a3 = new Koala("Bubu", TipRana.Usoara, 20, true);
        Animal a4 = new Veverita("Nuts", TipRana.Medie, true);
        Animal a5 = new Koala("Momo", TipRana.Grava, 22, false);
        Animal a6 = new Veverita("Speedy", TipRana.Grava, false);

        try {
            clinica.evalueazaAnimal(a1);
            clinica.evalueazaAnimal(a2); 
            clinica.evalueazaAnimal(a3); 
            clinica.evalueazaAnimal(a4); 
            clinica.evalueazaAnimal(a5); 
            clinica.evalueazaAnimal(a6); 
        } catch (Exception e) {
            System.err.println("Eroare la cazare: " + e.getMessage());
        }

        System.out.println("\n--- RAPORT GRAD OCUPARE ---");
        clinica.raportGradOcupare();

        System.out.println("\n--- NUMAR ANIMALE ULTIMA LUNA ---");
        clinica.numarAnimaleUltimaLuna();

        System.out.println("\n--- RAPORT CLINICA ---");
        clinica.raportClinica();

        clinica.decazeaza(a1);
        System.out.println("\n--- DUPA DECAZAREA LUI JACK ---");
        clinica.raportGradOcupare();
        
        System.out.println("\n--- RAPORT CLINICA DUPA DECAZAREA LUI JACK ---");
        clinica.raportClinica();
    }
}