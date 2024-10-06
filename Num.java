public class Num {

    private int pri_num, sec_num;

    public int getPri_num() {
        return pri_num;
    }

    public void setPri_num(int pri_num) {
        this.pri_num = pri_num;
    }

    public int getSec_num() {
        return sec_num;
    }

    public void setSec_num(int sec_num) {
        this.sec_num = sec_num;
    }
    

   public int troca(int pri_num, int sec_num){
        int aux = 0;
        if(pri_num > sec_num){
            aux = sec_num;
            sec_num = pri_num;
            pri_num = aux;

            setPri_num(pri_num);
            setSec_num(sec_num);
        }
        return 0;
   }

   @Override
   public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Números nesse intervalo são: ");
        builder.append("[");
        for(int i = pri_num; i <= sec_num; i++){
            builder.append(i);
            if(i == sec_num){
                builder.append("");
            }else{
                builder.append(",");
            }

        }
        builder.append("]");
        

        return builder.toString();
   }

}
