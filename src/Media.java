import java.util.Scanner;

public class Media {

    String nome;
    double nota1;
    double nota2;
    double nota3;
    int peso1;
    int peso2;
    int peso3;
    Double Resultado;

    public void obterdados(){

        Scanner leitorString = new Scanner(System.in);
        Scanner leitorDouble = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leitorString.nextLine();

        System.out.println("Digite sua primeira nota: ");
        nota1 = leitorDouble.nextLine();

        System.out.println("Digite sua segunda nota: ");
        nota2 = leitorDouble.nextLine();

        System.out.println("Digite sua terceira nota: ");
        nota3 = leitorDouble.nextLine();

        System.out.println("Digite o peso da sua primeira nota: ");
        peso1 = leitorInt.nextLine();

    }

}