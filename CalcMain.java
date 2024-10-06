import java.util.Scanner;
public class CalcMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calc calculo = new Calc();


        System.out.print("Digite um valor: ");
        calculo.setNum1(entrada.nextInt());
        System.out.print("\nDigite outro valor: ");
        calculo.setNum2(entrada.nextInt());




        System.out.print(calculo);

        entrada.close();
    }

    

    
}
