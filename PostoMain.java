import java.util.Scanner;
public class PostoMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Posto abs = new Posto();

        int abastecer = 1, escolha;
        float dindin, litro;
        String comb;
        float valor_l;
        float qtd_comb;
        

        System.out.print("Digite o combustível: ");
        abs.setComb(entrada.nextLine());
        System.out.print("\nDigite o Valor do litro: ");
        abs.setValor_l(entrada.nextFloat());
        System.out.print("\nQuantidade de comb na bomba: ");
        abs.setQtd_comb(entrada.nextFloat());

        while(abastecer == 1){
            System.out.print("Alterar Combustível? 1- sim; 2 - não: ");
            escolha = entrada.nextInt();

            while((escolha<1 || escolha > 2)){
                System.out.print("\nDigite novamente:");
                escolha = entrada.nextInt();
            }

            if(escolha == 1){
                entrada.nextLine();
                System.out.print("Digite o novo comb:");
                comb = entrada.nextLine();

                while(abs.getComb().equalsIgnoreCase(comb)){
                    System.out.print("Comb iguais. Digite novamente: ");
                    comb = entrada.nextLine();
                }
                abs.setComb(comb);
                System.out.print("\nDigite o valor do novo comb; ");
                valor_l = entrada.nextFloat();

                while(valor_l < 0){
                    System.out.print("\nValor negativo. Digite novamente");
                    valor_l = entrada.nextFloat();
                }
                abs.setValor_l(valor_l);
            }

            System.out.print("\nAbastecer por litro ou por grana? 1 - litro; 2 - grana");
            escolha = entrada.nextInt();

            while((escolha<1 || escolha > 2)){
                System.out.print("\nDigite novamente:");
                escolha = entrada.nextInt();
            }

            if(escolha == 1){
                System.out.print("quantos litros?: ");
                litro = entrada.nextFloat();

                while(litro < 0 || litro > abs.getQtd_comb()){
                    System.out.print("Litros incompatíveis. Digite novamente: ");
                    litro = entrada.nextFloat();
                }
                abs.ab_litro(litro);
            } else{
                System.out.print("quantos malote?: ");
                dindin = entrada.nextFloat();

                while(dindin < 0 || abs.ab_val(dindin) == 0){
                    System.out.print("Litros incompatíveis. Digite novamente: ");
                    dindin = entrada.nextFloat();
                }
                abs.ab_val(dindin);

            }

            System.out.print("\nNovo carro? 1 - sim; 2 - não");

            escolha = entrada.nextInt();

            while((escolha<1 || escolha > 2)){
                System.out.print("\nDigite novamente:");
                escolha = entrada.nextInt();
            }

            if(escolha == 1){
                System.out.print("\nReabasteça a bomba");
                qtd_comb = entrada.nextFloat();

                while(qtd_comb < 0){
                    System.out.print("\nDigite novamente: ");
                    qtd_comb = entrada.nextFloat();
                }
                abs.setQtd_comb(qtd_comb);
            }
            else{
                abastecer = 2;
            }
            

        }

        System.out.print(abs);

        entrada.close();
    }
    
}
