import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite = sc.nextInt();
        int tramos = sc.nextInt();
        int subida = sc.nextInt();
        int plano = sc.nextInt();
        int bajada = sc.nextInt();
        int tiempo = 0;
        int count = 0;

        sc.nextLine();

        while (tiempo <= limite && count < tramos) {
            String tramo = sc.next(); 

            int segmentTime = 0;

            if (tramo.equals("F")) {
              segmentTime += plano + plano;
            }else{
              segmentTime += subida + bajada;
            }

            if (tiempo + segmentTime <= limite) {
                tiempo += segmentTime;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
