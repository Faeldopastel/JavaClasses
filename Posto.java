public class Posto {

    private String comb;
    private float valor_l;
    private float qtd_comb;
    float total_l = 0, total_v = 0;

    public void setComb(String comb) {
        this.comb = comb;
    }
    public String getComb() {
        return comb;
    }

    public void setValor_l(float valor_l) {
        this.valor_l = valor_l;

    }
    public float getValor_l() {
        return valor_l;
    }

    public void setQtd_comb(float qtd_comb) {
        this.qtd_comb = qtd_comb;
    }
    public float getQtd_comb() {
        return qtd_comb;
    }

    public void alt_val(float valor){
        setValor_l(valor);
    }

    public void alt_comb(String comb){
        setComb(comb);
    }

    public void alt_qtd_comb(float qtd_comb){
        setQtd_comb(qtd_comb);
    }

    public int ab_val(float dindin){

        if(total_l > this.qtd_comb){
            return 0;
        } else{
            total_l = dindin / valor_l;
            return 1;
        }

    }

    public void ab_litro(float litro){
        total_v = litro * valor_l;
    }



    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Tipo de combustível: ");
        builder.append(comb);
        builder.append("\nValor do litro: ");
        builder.append(valor_l);
        builder.append("\nTotal de litros enchidos por valor: ");
        builder.append(total_l);
        builder.append("\nTotal à pagar pelos litros: ");
        builder.append(total_v);

        return builder.toString();
    }
    
}
