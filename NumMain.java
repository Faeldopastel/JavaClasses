import java.util.Scanner;
public class NumMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Num num = new Num();

        int pri_num, sec_num;
        System.out.print("Digite um número de início:");
        pri_num = entrada.nextInt();
        System.out.print("\nDigite o número de fim: ");
        sec_num = entrada.nextInt();

        num.setPri_num(pri_num);
        num.setSec_num(sec_num);

        num.troca(pri_num, sec_num);
        System.out.print(num);



        entrada.close();

    }
    
}
