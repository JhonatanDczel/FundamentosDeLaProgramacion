import graphics.*;

public class Piramide{
    public static void main(String[] args){
        Picture casB = Picture.casilleroBlanco();
        Picture alfil = Picture.alfil().superponer(casB);
        Picture patron = casB.alLado(alfil);
        
        Picture fila1 = alfil.alLado(patron.repetirH(3));
        Picture fila2 = alfil.alLado(patron.repetirH(2));
        Picture fila3 = alfil.alLado(patron.repetirH(1));
        Picture fila4 = alfil;

        Picture tablero = casB.repetirH(3).alLado(fila4).alLado(casB.repetirH(3));
        tablero = tablero.encima(casB.repetirH(2).alLado(fila3).alLado(casB.repetirH(2)));
        tablero = tablero.encima(casB.repetirH(1).alLado(fila2).alLado(casB.repetirH(1)));
        tablero = tablero.encima(fila4);

        Graphics g = new Graphics(tablero);
        g.print();
    }
}
