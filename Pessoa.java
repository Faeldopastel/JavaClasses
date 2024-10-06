public class Pessoa {

    private float altura, peso;
    private int idade;
    private String nome;
    float aumento = 0;

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void envelhecer(int idade, int anos){
        setIdade(idade + anos);
    }

    public void engordar(float peso, float kg){
        setPeso(peso + kg);

    }

    public void emagrecer(float peso, float kg){
        if(peso < 0){
            System.out.print("O peso está negativo, indo para o peso referente a sua altura: ");
            setPeso(52 + (0.75f *(getAltura() - 154.4f)));
        } else{
            setPeso(peso - kg);
        }
    }

    public void crescer(float altura, int idade, int anos){
        
        if(idade < 21){
            aumento = (21f - idade) * 0.05f;
            
            
            setAltura(altura + aumento);
        }else{
            setAltura(altura);
        }
        
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Seu nome: ");
        builder.append(nome);
        builder.append("\nSua nova idade: ");
        builder.append(idade);
        builder.append("\nSua nova altura: ");
        builder.append(altura);
        builder.append("\nSeu novo peso: ");
        builder.append(peso);

        return builder.toString();
    }
}
