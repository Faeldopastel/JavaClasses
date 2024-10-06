import java.util.Scanner;
public class InssMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Inss total_sal = new Inss();

        float sal = 0;
        int horas;

        System.out.print("Digite o quantas horas vc trabalha: ");
        horas = entrada.nextInt();
        System.out.print("\nDigite o quanto vc ganha por hora: ");
        sal = entrada.nextFloat();

        sal *= horas * 25;

        total_sal.setSal(sal);
        total_sal.calc_sal(sal);
        System.out.println(total_sal);
        entrada.close();



        
        
    }
    
}
