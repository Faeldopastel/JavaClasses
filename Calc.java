public class Calc {

    private  int num1 = 0, num2 = 1;
    private int calc;

    public Calc(){
        setNum1(num1);
        setNum2(num2);
    }



    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getNum2() {
        return num2;
    }

    public void setCalc(int calc) {
        this.calc = calc;
    }

    public int getCalc() {
        return calc;
    }
    

    public  void soma(int num1, int num2){

        setCalc(num1 + num2);

    }

    public void sub(int num1, int num2){

        setCalc(num1 - num2);

    }

    public void mult(int num1, int num2){

        setCalc(num1 * num2);

    };

    public void div(int num1, int num2){
        if(num2 == 0){
            System.out.print("Não pode haver  divisião por 0. Indo para o número padrão\n");
            
            setCalc(num1 / (num2+1));
        } else {
            setCalc(num1/num2);
        }
    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Soma = ");
        soma(num1, num2);
        builder.append(calc);

        builder.append("\nSubtracao = ");
        sub(num1, num2);
        builder.append(calc);

        builder.append("\nMultiplicacao = ");
        mult(num1, num2);
        builder.append(calc);

        builder.append("\nDivisão = ");
        div(num1, num2);
        builder.append(calc);
        


        return builder.toString();
    }

}
