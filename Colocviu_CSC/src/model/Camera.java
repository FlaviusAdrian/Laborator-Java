package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import exceptii.AnimaleIncompatibile;

public class Camera {
    private static final int CAPACITATE_MAXIMA = 5;
    private int id;
    private List<Animal> animale = new ArrayList<>();

    public Camera(int id) { 
    	this.id = id; 
    	}

    public int getId() { 
    	return id; 
    	}

    public void cazeaza(Animal animal) throws AnimaleIncompatibile, ClinicaFull {
        if (!animale.isEmpty() && !animale.get(0).getSpecie().equals(animal.getSpecie())) {
            throw new AnimaleIncompatibile("Nu poti caza animale de specii diferite in aceeasi camera.");
        }
        if (animale.size() >= CAPACITATE_MAXIMA) {
            throw new ClinicaFull("Camera este plina.");
        }
        animal.seteazaDataCazare(LocalDateTime.now());
        animale.add(animal);
    }

    public void decazeaza(Animal animal) {
        animale.remove(animal);
    }

    public boolean esteGoala() { return animale.isEmpty(); }
    public int locuriRamase() { return CAPACITATE_MAXIMA - animale.size(); }
    public String getSpecie() { return esteGoala() ? null : animale.get(0).getSpecie(); }
    public int getNumarAnimale() { return animale.size(); }
    public List<Animal> getAnimale() { return animale; }
}