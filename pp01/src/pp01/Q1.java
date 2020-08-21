package pp01;
import java.util.Scanner;

public class Q1 {
  public void run() {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite n1");
    int n1 = scanner.nextInt();  
    System.out.println("digite n2");
    int n2 = scanner.nextInt();  
    if(n1>n2){
       System.out.println("Maior número: " + n1);
    }else if(n1==n2){
      System.out.println("São números iguais");
    } else{
      System.out.println("Maior número: " + n2);
    }
  }
  
}
