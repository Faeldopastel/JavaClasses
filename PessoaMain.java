import java.util.Scanner;
public class PessoaMain {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        Pessoa model = new Pessoa();

        String nome;
        int idade, anos;
        float altura, peso, kg, tip;

        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();

        System.out.print("\nDigite sua idade: ");
        idade = entrada.nextInt();
        System.out.print("\nDigite sua altura: ");
        altura = entrada.nextFloat();
        System.out.print("\nDigite o seu peso: ");
        peso = entrada.nextFloat();

        model.setNome(nome);
        model.setIdade(idade);
        model.setAltura(altura);
        model.setPeso(peso);


        System.out.print("\nDigite 1 - Emagrecer; 2 Engordar;  ");
        tip = entrada.nextInt();

        while(tip < 1 || tip > 2){
            System.out.print("\nDigite novamente: ");
            tip = entrada.nextFloat();
        }

        System.out.print("Digite o peso que vc quer Adicionar/Remover: ");
        kg = entrada.nextFloat();

        if (tip == 1) {
            model.emagrecer(peso, kg);
        } else{
            model.engordar(peso, kg);
        };

        System.out.print("\nDigite os anos que passaram: ");
        anos = entrada.nextInt();
        model.envelhecer(idade, anos);
        model.crescer(altura, idade, anos);


        System.out.print(model);
        entrada.close();





    }
    
}
