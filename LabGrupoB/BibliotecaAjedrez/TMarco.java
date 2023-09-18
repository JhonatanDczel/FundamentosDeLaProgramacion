import graphics.*;

public class TMarco{
    public static void main(String[] args){
        Picture cuadroB = Picture.casilleroBlanco();
        Picture cuadroN = cuadroB.invertir();

        Picture patron = cuadroB.alLado(cuadroN);
        patron = patron.encima(patron.invertir());
        patron = patron.repetirH(2).repetirV(2);

        Picture topeS = cuadroN.repetirH(3);
        Picture topeI = cuadroN.repetirV(2);

        patron = topeS.encima(topeI.alLado(patron));

        Picture tablero = patron.alLado(patron.voltearV());
        tablero = tablero.encima(tablero.voltearH());

        Graphics g = new Graphics(tablero);

        g.print();
    }
}
