import graphics.*;

public class TableroMarco{
    public static void main(String[] args){

        Picture cBlanco = Picture.casilleroBlanco();
        Picture cNegro = cBlanco.invertir();

        Picture fila1 = cNegro.repetirH(6);
        Picture fila2 = cNegro.alLado(cBlanco.repetirH(4)).alLado(cNegro);

        Picture tablero = fila1.encima(fila2.repetirV(4)).encima(fila1);

        Graphics g = new Graphics(tablero);
        g.print();
    }
}
