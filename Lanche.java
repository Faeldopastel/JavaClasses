public class Lanche {

    private  int qtd, cod;
    private float CQ = 1.20f;
    private float BS = 1.30f;
    private float BCO = 1.50f;
    private float H = 1.20f;
    private float CB = 1.30f;
    private float RE = 1.00f;

    float total = 0, qtd_CQ = 0, qtd_BS = 0, qtd_BCO = 0, qtd_H = 0, qtd_CB = 0, qtd_RE = 0;

    public Lanche(){
        setQtd(qtd);
        setCod(cod);
    }

    public void setCod(int cod) {
        this.cod = cod;
    } 
    public int getCod() {
        return cod;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }



    public void total_compra(int qtd, int cod){

        if(cod == 100){

            if(qtd_CQ == 0){
                qtd_CQ+= qtd;
                total += qtd_CQ * CQ;
            }
            else{
                total -= qtd_CQ * CQ;
                qtd_CQ += qtd;
                total += qtd_CQ * CQ;
            }
        }
        else if(cod == 101){

            if(qtd_BS == 0){
                qtd_BS+= qtd;
                total += qtd_BS * BS;
            }
            else{
                total -= qtd_BS * BS;
                qtd_BS += qtd;
                total += qtd_BS * BS;
            }
        }
        else if(cod == 102){


            if(qtd_BCO == 0){
                qtd_BCO += qtd;
                total += qtd_BCO * BCO;
            }
            else{
                total -= qtd_BCO * BCO;
                qtd_BCO += qtd;
                total += qtd_BCO * BCO;
            }
        }
        else if(cod == 103){

            if(qtd_H == 0){
                qtd_H += qtd;
                total += qtd_H * H;
            }
            else{
                total -= qtd_H * H;
                qtd_H += qtd;
                total += qtd_H * H;
            }
        } else if(cod == 104){

            if(qtd_CB == 0){
                qtd_CB += qtd;
                total += qtd_CB * CB;
            }
            else{
                total -= qtd_CB * CB;
                qtd_CB += qtd;
                total += qtd_CB * CB;
            }

        } else if(cod == 105){

            if(qtd_RE == 0){
                qtd_RE += qtd;
                total += qtd_RE * RE;
            }
            else{
                total -= qtd_RE * RE;
                qtd_RE += qtd;
                total += qtd_RE * RE;
            }
        }

    }

    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Cachorro Quente total = ");
        builder.append(qtd_CQ * CQ);
        builder.append("\nBauru Simples = ");
        builder.append(qtd_BS * BS);
        builder.append("\nBauru com ovo = ");
        builder.append(qtd_BCO * BCO);
        builder.append("\nHamburguer = ");
        builder.append(qtd_H * H);
        builder.append("\nCheeseburguer = ");
        builder.append(qtd_CB * CB);
        builder.append("\nRefrigerante = ");
        builder.append(qtd_RE * RE);
        builder.append("\nTotal = ");
        builder.append(total);

        return builder.toString();
    }
    
}
