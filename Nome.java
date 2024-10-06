public class Nome{

    
    private String nome = "";
    private String sobrenome = "";


    public String getSobrenome() {
        return sobrenome;
    }
    public void setNome(String nome) {
        if(nome.length() >= 3)
            this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setSobrenome(String sobrenome) {
        if(sobrenome.length() > 3)
            this.sobrenome = sobrenome;
    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Seu nome é ");
		builder.append(nome);
		builder.append(" ");
		builder.append(sobrenome);
		return builder.toString();

    }

    
    
}