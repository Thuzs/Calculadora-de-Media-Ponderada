import java.util.Scanner;

public class Media {

    String nome;
    double nota1;
    double nota2;
    double nota3;
    int peso1;
    int peso2;
    int peso3;
    int SomaPeso;
    double SomaNotas;

    public void obterdados(){

        Scanner leitorString = new Scanner(System.in);
        Scanner leitorDouble = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leitorString.nextLine();

        System.out.println("Digite sua primeira nota: ");
        nota1 = leitorDouble.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        nota2 = leitorDouble.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        nota3 = leitorDouble.nextDouble();

        System.out.println("Digite o peso da sua primeira nota: ");
        peso1 = leitorInt.nextInt();

        System.out.println("Digite o peso da sua segunda nota: ");
        peso2 = leitorInt.nextInt();

        System.out.println("Digite o peso da sua terceira nota: ");
        peso3 = leitorInt.nextInt();

        exibirResultado();

    }
    public void CalcularMedia(){ SomaPeso = peso1 + peso2 + peso3;}
    public void CalculoMedia(){ SomaNotas= ( nota1 * peso1 + nota2 * peso2 + nota3 * peso3)/ SomaPeso;}

    public void exibirResultado(){
        CalcularMedia();
        CalculoMedia();
        System.out.println("Sua primeira nota: " + nota1 );
        System.out.println("Sua segunda nota: " + nota2);
        System.out.println("Sua terceira nota: " + nota3);
        System.out.println("A média do aluno " + nome + ": " + SomaNotas);

    }



}