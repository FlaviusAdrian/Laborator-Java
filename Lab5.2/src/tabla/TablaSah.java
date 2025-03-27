package tabla;

import view.TablaDeSahView;

import figuri.*;
import javax.swing.*;
import java.util.HashMap;

public class TablaSah {
    private HashMap<String, Figura> tabla;
    private TablaDeSahView tablaView;
    private JFrame frame;

    public TablaSah() {
        tabla = new HashMap<>();
        initializeazaTabla();
        tablaView = new TablaDeSahView(tabla);
        frame = new JFrame("Tabla de Sah");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(tablaView);
        frame.pack();
        frame.setVisible(true);
    }

    private void initializeazaTabla() {
        tabla.put("a1", new Turn('B', "a1"));
        tabla.put("b1", new Cal('B', "b1"));
        tabla.put("c1", new Nebun('B', "c1"));
        tabla.put("d1", new Regina('B', "d1"));
        tabla.put("e1", new Rege('B', "e1"));
        tabla.put("f1", new Nebun('B', "f1"));
        tabla.put("g1", new Cal('B', "g1"));
        tabla.put("h1", new Turn('B', "h1"));
        for (char i = 'a'; i <= 'h'; i++) {
            tabla.put(i + "2", new Pion('B', i + "2"));
        }

        tabla.put("a8", new Turn('N', "a8"));
        tabla.put("b8", new Cal('N', "b8"));
        tabla.put("c8", new Nebun('N', "c8"));
        tabla.put("d8", new Regina('N', "d8"));
        tabla.put("e8", new Rege('N', "e8"));
        tabla.put("f8", new Nebun('N', "f8"));
        tabla.put("g8", new Cal('N', "g8"));
        tabla.put("h8", new Turn('N', "h8"));
        for (char i = 'a'; i <= 'h'; i++) {
            tabla.put(i + "7", new Pion('N', i + "7"));
        }
    }

    public boolean mutaFigura(String dePe, String la) {
        Figura figura = tabla.get(dePe);
        if (figura == null) {
            System.out.println("Nu exista piesa la pozitia " + dePe);
            return false;
        }

        if (!figura.esteMutareValida(la)) {
            System.out.println("Mutare invalida!");
            return false;
        }

        Figura destinatieFigura = tabla.get(la);
        if (destinatieFigura != null && destinatieFigura.getCuloare() == figura.getCuloare()) {
            System.out.println("Nu se poate muta pe o casetă ocupată de o piesă de aceeași culoare.");
            return false;
        }

        animaFigura(figura.getPozitie(), la);

        tabla.put(la, figura);
        tabla.remove(dePe);
        figura.setPozitie(la);
        return true;
    }

    public void animaFigura(String dePe, String la) {
        final int[] deX = {dePe.charAt(0) - 'a'};
        final int[] deY = {8 - (dePe.charAt(1) - '0')};
        final int[] laX = {la.charAt(0) - 'a'};
        final int[] laY = {8 - (la.charAt(1) - '0')};

        int pasX = (laX[0] - deX[0]) / 10;
        int pasY = (laY[0] - deY[0]) / 10;

        Timer timer = new Timer(50, e -> {
            if (deX[0] != laX[0] || deY[0] != laY[0]) {
                deX[0] += pasX;
                deY[0] += pasY;
                tablaView.repaint();
            } else {
                ((Timer) e.getSource()).stop();
            }
        });
        timer.start();
    }
}
