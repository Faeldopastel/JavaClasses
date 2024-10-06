public class Qua {
    
    private int lado;

    public Qua(){
        setLado(lado);
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    public int getLado() {
        return lado;
    }

    public void area(int lado){
        lado*= lado;
        setLado(lado);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Sua área total do quadrado é: ");
        builder.append(lado);

        return builder.toString();
    }


    
}
