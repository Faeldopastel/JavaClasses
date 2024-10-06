import java.util.Scanner;
public class LancheMain {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Lanche snack = new Lanche();

        final float CQ = 1.20f;
        final float BS = 1.30f;
        final float BCO = 1.50f;
        final float H = 1.20f;
        final float CB = 1.30f;
        final float RE = 1.00f;

        int qtd, cod = 1;

        while(cod != 0){
            System.out.print("Digite o código do produto que você deseja (Digite 0 para terminar):\n ");
            System.out.println("Cachorro quente   100   R$" + CQ);
            System.out.println("Bauru Simples     101   R$" + BS);
            System.out.println("Bauru Com ovo     102   R$" + BCO);
            System.out.println("Hamburguer        103   R$" + H);
            System.out.println("Cheeseburguer     104   R$" + CB);
            System.out.println("Refrigerante      105   R$" + RE);
            cod = entrada.nextInt();

            if (cod == 0) {
                break;
            }

            while((cod < 100 || cod > 105)){
                System.out.print("Digite novamente: ");
                cod = entrada.nextInt();

            }

            snack.setCod(cod);

            System.out.print("\nDigite a qtd: ");
            qtd = entrada.nextInt();

            snack.setQtd(qtd);

            snack.total_compra(qtd, cod);
            
        }

        System.out.print(snack);

        entrada.close();
        
    }
    
}
