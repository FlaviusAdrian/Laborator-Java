package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Clinica {
    public List<Camera> camere = new ArrayList<>();

    public Clinica() {
        for (int i = 1; i <= 6; i++) {
            camere.add(new Camera(i));
        }
    }

    public void evalueazaAnimal(Animal animal) throws Exception {
        if (animal.getRana() == TipRana.Usoara) return;
        for (Camera camera : camere) {
            if (camera.getSpecie() == null || camera.getSpecie().equals(animal.getSpecie())) {
                try {
                    camera.cazeaza(animal);
                    return;
                } catch (ClinicaFull ignored) {}
            }
        }
        throw new ClinicaFull("Clinica este plina pentru specia: " + animal.getSpecie());
    }

    public void decazeaza(Animal animal) {
        for (Camera camera : camere) {
            if (camera.getAnimale().contains(animal)) {
                camera.decazeaza(animal);
                return;
            }
        }
    }

    public int calculeazaNumarCamereLibere() {
        int count = 0;
        for (Camera c : camere) {
            if (c.esteGoala()) count++;
        }
        return count;
    }

    public void raportGradOcupare() {
        for (Camera c : camere) {
            String specie = c.getSpecie() == null ? "niciun animal" : c.getSpecie();
            System.out.println("In camera " + c.getId() + " se afla " + c.getNumarAnimale() + " " + specie + 
                " si mai exista " + c.locuriRamase() + " locuri libere.");
        }
    }

    public void numarAnimaleUltimaLuna() {
        int total = 0;
        LocalDateTime lunaInUrma = LocalDateTime.now().minusMonths(1);
        for (Camera c : camere) {
            for (Animal a : c.getAnimale()) {
                if (a.getDataCazare().isAfter(lunaInUrma)) {
                    total++;
                }
            }
        }
        System.out.println("Numar animale cazate in ultima luna: " + total);
    }

    public void raportClinica() {
        int canguri = 0, koala = 0, veverite = 0;
        for (Camera c : camere) {
            for (Animal a : c.getAnimale()) {
                switch (a.getSpecie()) {
                    case "Cangur" -> canguri++;
                    case "Koala" -> koala++;
                    case "Veverita" -> veverite++;
                }
            }
        }
        int total = canguri + koala + veverite;
        int specii = (canguri > 0 ? 1 : 0) + (koala > 0 ? 1 : 0) + (veverite > 0 ? 1 : 0);

        System.out.println("In clinica se afla " + specii + " specii de animale diferite dintre care");
        System.out.println(canguri + " canguri,\n" + koala + " koala,\n" + veverite + " veverite.");
        System.out.println("In total in clinica se afla " + total + " animale.");
    }
}