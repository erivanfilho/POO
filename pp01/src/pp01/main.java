package pp01;
import java.util.Scanner;

class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escolha a questão a ser respondida.");
    System.out.println("- 1 para Questão 1\n- 2 para Questão 2\n- 3 para Questão 3");
    System.out.print("Digite a opção: ");
    int opcao = scanner.nextInt();
    
    switch(opcao) {
      case 1: Q1 q1 = new Q1();
              q1.run();
              break;
              
      case 2: Q2 q2 = new Q2();
              q2.run();
              break;
              
      case 3: Q3 q3 = new Q3();
              q3.run();
              break;              
      default: System.out.println("Questão inexistente!");
    }
  }
}
