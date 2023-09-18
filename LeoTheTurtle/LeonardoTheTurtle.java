import episunsa.*;
import java.util.*;
import galapagos.*;
import java.awt.*;

public class LeonardoTheTurtle {
    public static void main(String[] args) {

        SimpleImage img = new SimpleImage("ImagenMates.png");

        TurtleDrawingWindow lienzo = crearLienzo();

        Turtle[] leoDaTurtle = new Turtle[img.getWidth()];

        for (int x = 0; x < img.getWidth(); x++) {
            leoDaTurtle[x] = new Turtle(Turtle.NO_DEFAULT_WINDOW);
            leoDaTurtle[x].jumpTo(x * 6, 0);
            lienzo.add(leoDaTurtle[x]);
			leoDaTurtle[x].heading(-90.0);
            leoDaTurtle[x].penSize(30);
            leoDaTurtle[x].bodyColor(new Color(x*4%250, x*x % 250, x));

        }

    }


    public static TurtleDrawingWindow crearLienzo(){
        TurtleDrawingWindow lienzo = new TurtleDrawingWindow();
        lienzo.setSize(1084, 746);
        lienzo.setResizable(true);
        lienzo.setOrigin(216, -142);
        lienzo.setBackground(new Color(0, 0, 0));
        lienzo.setTitle("Turtle-Vinci");
        lienzo.setVisible(true);
        lienzo.setGrid(false);
        lienzo.setUnit(2.5);
        return lienzo;
    }
}	       
