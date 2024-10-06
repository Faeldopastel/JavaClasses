public class Banc {

    private int num_conta;
    private String nome;
    private float saldo;
    float valor = 0;


    public Banc(){
        setNome(nome);
        setNum_conta(num_conta);
        setSaldo(saldo);
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }
    public int getNum_conta() {
        return num_conta;
    }
    
    public String getNome() {
        return nome;
    };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }

    public int incluir(int num_conta){
        if(this.num_conta == num_conta){
            System.out.print("\nContas iguais!");
            return 0;
        }else{
            System.out.print("\nInclusa!");
            setNum_conta(num_conta);
            return 1;
        }
    }

    public int mudar_name(String nome){
        if(this.nome.equalsIgnoreCase(nome)){
            System.out.print("\nNomes iguais!\n");
            return 0;
        }else{
            System.out.print("\nNome alterado com Sucesso!\n");
            setNome(nome);
            return 1;
            
        }

    };

    public int saque(float saldo, float valor){
        if((saldo - valor) < 0){
            System.out.print("Não há dinheiro o suficiente no seu saldo. Coloque outro valor:\n");
            return 0;

        }else{
            this.valor = valor;
            saldo -= this.valor;
            setSaldo(saldo);
            return 1;
        }
    }
    public void depo(float saldo, float valor){
        setSaldo(this.saldo + valor);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Conta: ");
        builder.append(num_conta);
        builder.append("       Nome: ");
        builder.append(nome);
        builder.append("\nTotal da conta: ");
        builder.append(saldo);
        
        
        return builder.toString();
    }
    
}
