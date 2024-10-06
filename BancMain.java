import java.util.Scanner;
public class BancMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Banc banco = new Banc();

        String nome;
        int num_conta, escolha = 1;
        float saldo, valor;

        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();
        banco.setNome(nome);

        while(nome.equals("")){
            System.out.print("Digite novamente: ");
            nome = entrada.nextLine();
        }

        System.out.print("\nDigite o número da sua conta: ");
        num_conta = entrada.nextInt();
        banco.setNum_conta(num_conta);

        while(num_conta < 0){
            System.out.print("Digite novamente: ");
            num_conta = entrada.nextInt();
        }

        System.out.print("\nDigite o Seu saldo: ");
        saldo = entrada.nextFloat();
        banco.setSaldo(saldo);

        while(escolha != 0){

            System.out.print("Digite para avançar\n");
            System.out.println("1 = Mudar nome");
            System.out.println("2 = Mudar conta");
            System.out.println("3 = Sacar");
            System.out.println("4 = Depositar");
            System.out.println("0 = Sair");
            escolha = entrada.nextInt();


            if(escolha == 0){

                break;

            }

            else if(escolha == 1){

                entrada.nextLine();
                System.out.print("Digite seu novo nome: ");
                nome = entrada.nextLine();

                while(nome.equals("") || banco.mudar_name(nome) == 0){
                    System.out.print("Digite novamente: ");
                    nome = entrada.nextLine();
                }

                banco.mudar_name(nome);

            }else if(escolha == 2){

                System.out.print("\nDigite sua nova conta: ");
                num_conta = entrada.nextInt();

                while(num_conta < 0 || banco.incluir(num_conta) == 0){
                    System.out.print("Digite novamente: ");
                    num_conta = entrada.nextInt();
                }

                banco.incluir(num_conta);

            }else if(escolha == 3 || escolha == 4){

                System.out.print("Digite o valor para saque/depósito: ");
                valor = entrada.nextFloat();

                if (escolha == 3){
                    banco.saque(saldo, valor);

                    while(banco.saque(saldo, valor) == 0){
                        valor = entrada.nextFloat();
                    }

                }

                else if(escolha == 4){
                    banco.depo(saldo, valor);
                }

            }


        }


        System.out.print(banco);
        entrada.close();

    }
}
