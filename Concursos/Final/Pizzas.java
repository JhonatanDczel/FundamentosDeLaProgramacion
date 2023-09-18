import java.util.*; 

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int dias = sc.nextInt();
    int precio = sc.nextInt();
    int total = 0;
    for(int i = 0; i < dias; i++){
      int pizzas = sc.nextInt();
      total += pizzas * precio;
    }
    System.out.println(total);
  }
}
