import java.util.Scanner;
public class NomeMain {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Nome n = new Nome();

        String nome, sobrenome;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        while(nome.equals("") || nome.length() < 3){
            System.out.print("O nome não pode ser vazio. Digite Novamente: ");
            nome = entrada.nextLine();
        }
        System.out.print("\nDigite seu sobrenome: ");
        sobrenome = entrada.nextLine();
        while(sobrenome.equals("")|| sobrenome.length() < 3){
            System.out.print("O sobrenome não pode ser vazio. Digite novamente: ");
            sobrenome = entrada.nextLine();
        }

        n.setNome(nome);
        n.setSobrenome(sobrenome);

        System.out.println(n);

        entrada.close();
        

    }
    
}
