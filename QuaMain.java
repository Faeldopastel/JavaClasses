import java.util.Scanner;
public class QuaMain {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Qua area_qua = new Qua();

        int lado;

        System.out.print("Digite um lado do quadrado: ");
        lado = entrada.nextInt();

        area_qua.setLado(lado);
        area_qua.area(lado);

        System.out.print(area_qua);

        entrada.close();
    }
    
}
