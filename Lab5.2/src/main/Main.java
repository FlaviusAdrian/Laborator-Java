package main;

import tabla.TablaSah;

public class Main {
    public static void main(String[] args) {
        TablaSah tabla = new TablaSah();

        boolean succes = tabla.mutaFigura("e2", "e4");
        System.out.println(succes ? "Mutare realizată cu succes!" : "Mutare eșuată.");
        
        boolean succes2 = tabla.mutaFigura("c2", "c3");
        System.out.println(succes2 ? "Mutare realizată cu succes!" : "Mutare eșuată.");

        boolean succes3 = tabla.mutaFigura("b1", "a3");
        System.out.println(succes3 ? "Mutare realizată cu succes!" : "Mutare eșuată.");
        
        boolean succes4 = tabla.mutaFigura("d2", "d4");
        System.out.println(succes4 ? "Mutare realizată cu succes!" : "Mutare eșuată.");
        
        boolean succes5 = tabla.mutaFigura("c1", "h6");
        System.out.println(succes5 ? "Mutare realizată cu succes!" : "Mutare eșuată.");

        boolean succes6 = tabla.mutaFigura("b8", "a6");
        System.out.println(succes6 ? "Mutare realizată cu succes!" : "Mutare eșuată.");
        
        boolean succes7 = tabla.mutaFigura("d7", "d5");
        System.out.println(succes7 ? "Mutare realizată cu succes!" : "Mutare eșuată.");

        boolean succes8 = tabla.mutaFigura("d8", "d6");
        System.out.println(succes8 ? "Mutare realizată cu succes!" : "Mutare eșuată.");
        
        boolean succes9 = tabla.mutaFigura("d6", "a3");
        System.out.println(succes9 ? "Mutare realizată cu succes!" : "Mutare eșuată.");
        
        boolean succes10 = tabla.mutaFigura("g8", "g5");
        System.out.println(succes10 ? "Mutare realizată cu succes!" : "Mutare eșuată.");
        
        boolean succes11 = tabla.mutaFigura("a8", "d3");
        System.out.println(succes11 ? "Mutare realizată cu succes!" : "Mutare eșuată.");

    }    
}