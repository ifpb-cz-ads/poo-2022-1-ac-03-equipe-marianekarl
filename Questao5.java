import java.util.Scanner;
class Questao5 {
  public static void main(String[] args) {
    System.out.print("Digite um número: ");
    int idade;
    
    Scanner entrada = new Scanner(System.in);

    while((idade = entrada.nextInt()) != 0 ) {

      if (idade <= 15){
        System.out.println("Não é permitido votar.");
      }
      if(idade==16 || idade==17 || idade>65){
            System.out.println("O voto é facultativo.");
      }
      if(idade >= 18 &&  idade < 65){
        System.out.println("O voto é obrigatório.");
        }

      System.out.print("Digite um número: ");
      
    }
  }
}