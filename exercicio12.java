import java.util.Scanner;

//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

public class exercicio12 {
    public static void main(String[] args) {

        double altura, pesoideal;

        Scanner teclado = new Scanner(System.in);
        System.out.println("escreva sua altura");
        altura = teclado.nextDouble();
        teclado.close();

        pesoideal = (72.7*altura) - 58;

        System.out.println("seu peso ideal é");
        System.out.println(pesoideal);


        
    }
}
