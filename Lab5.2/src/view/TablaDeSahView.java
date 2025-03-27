package view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import figuri.Figura;

public class TablaDeSahView extends JPanel {
    private HashMap<String, Figura> tabla;
    private final int LUNGIME_CASA = 60;

    public TablaDeSahView(HashMap<String, Figura> tabla) {
        this.tabla = tabla;
        setPreferredSize(new Dimension(480, 480));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    g.setColor(Color.BLUE);
                } else {
                    g.setColor(Color.RED);
                }
                g.fillRect(i * LUNGIME_CASA, j * LUNGIME_CASA, LUNGIME_CASA, LUNGIME_CASA);
            }
        }

        for (String pozitie : tabla.keySet()) {
            Figura figura = tabla.get(pozitie);
            int x = pozitie.charAt(0) - 'a';
            int y = 8 - (pozitie.charAt(1) - '0');

            g.setColor(figura.getCuloare() == 'B' ? Color.BLACK : Color.WHITE);
            g.fillOval(x * LUNGIME_CASA + LUNGIME_CASA / 4, y * LUNGIME_CASA + LUNGIME_CASA / 4, LUNGIME_CASA / 2, LUNGIME_CASA / 2);
        }
    }
}

