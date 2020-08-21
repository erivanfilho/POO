package pp01;
import java.util.Scanner; 
import java.lang.Math; 

public class Q3 {
  
  public void run() {
    double x1;
    double x2;
    System.out.println("Digite os coeficientes a, b e c");
    Scanner scanner = new Scanner(System.in);
    double a = 0;
    while (a == 0){
      a = scanner.nextDouble();
    }
    double b = scanner.nextDouble();  
    double c = scanner.nextDouble();  
    double delta = ((b*b) - 4*a*c);
    System.out.println(delta);
    
    if(delta == 0){
      System.out.println("delta = 0");
      x1 = (-b/(2*a));
      x2 = x1;
      System.out.println("x1: " + x1);
      System.out.println("x2: " + x2);
    } else if(delta > 0){
      System.out.println("delta > 0");
      x1 = ((-b-(Math.sqrt((b*b)-4*a*c))/(2*a)));
      x2 = ((-b+(Math.sqrt((b*b)-4*a*c))/(2*a)));
      System.out.println("x1: " + x1);
      System.out.println("x2: " + x2);
    } else if(delta < 0){
      System.out.println("delta < 0");
      double parteReal = (-b/(2*a));
      double parteImaginaria = (Math.sqrt(-(b*b)-(4*a*c))/(2*a));
      System.out.println("Parte real: " + parteReal);
      System.out.println("Parte imaginária: " + parteImaginaria);
    }
    
  }
  
}