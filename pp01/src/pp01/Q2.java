package pp01;
import java.util.Scanner;

public class Q2 {
  
  public void run() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite num1");
    double n1 = scanner.nextDouble();  
    System.out.println("digite num2");
    double n2 = scanner.nextDouble(); 
    double result;
    
    System.out.println("digite (1) para usar switch ou (2) para usar if/else:");
    int opcao = scanner.nextInt();
    if (opcao == 1){
        System.out.println("escolha entre soma (+), subtração (-) , multiplicação (*) e divisão (/)");
        String operacao = scanner.next();
        switch(operacao){
          case "+":
            result = n1+n2;
            System.out.println(n1 + " + " + n2 + " = " + result);
            break;
          case "-":
            result = n1-n2;
            System.out.println(n1 + " - " + n2 + " = " + result);
            break;
          case "*":
            result = n1*n2;
            System.out.println(n1 + " * " + n2 + " = "+ result);
            break;
          case "/":
            result = n1/n2;
            System.out.println(n1 + " / " + n2 + " = " + result);
            break;
          default: System.out.println("operação inválida!");
        }
        
    }else if(opcao == 2){
      System.out.println("escolha entre soma (+), subtração (-) , multiplicação (*) e divisão (/)");
      String operacao = scanner.next();
      if (operacao.equals("+")){
        result = n1+n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
      }else if(operacao.equals("-")){
        result = n1-n2;
        System.out.println(n1 + " - " + n2 + " = " + result);
      }else if(operacao.equals("*")){
        result = n1*n2;
        System.out.println(n1 + " * " + n2 + " = "+ result);
      }else if(operacao.equals("/")){
        result = n1/n2;
        System.out.println(n1 + " / " + n2 + " = " + result);
      }else{
        System.out.println("operação inválida!");
      }
    
      

    }
  }
}