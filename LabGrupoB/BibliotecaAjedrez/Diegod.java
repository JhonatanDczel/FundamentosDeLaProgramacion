import graphics.*;

public class Diegod{
    public static void main(String[] args){
        Picture negro = Picture.casilleroBlanco().invertir();
        Picture cuadro1 = Picture.casilleroBlanco().alLado(Picture.casilleroBlanco().invertir());
        Picture cuadro = cuadro1.encima(cuadro1.invertir());
        cuadro = cuadro.encima(cuadro);
        Picture columna = negro.repetirH(2);
        Picture fila = negro.repetirV(6);
        cuadro = columna.encima(cuadro).encima(columna);

        Picture tablero = fila.alLado(cuadro);
        Picture pablero = tablero.alLado(tablero.voltearH().voltearV());

        Graphics g = new Graphics(pablero);

        g.print();
    }
}
