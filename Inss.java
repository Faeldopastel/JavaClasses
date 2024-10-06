public class Inss {

    private float sal, sal_liq;
    private float ir = 0.11f, inss = 0.08f, sind = 0.05f;
    float desconto = 0;


    public Inss(){
        setSal(sal);
    }


    public float getSal() {
        return sal;
    }

    public void setSal (float sal) {
        this.sal = sal;
    }

    public float getSal_liq() {
        return sal_liq;
    }

    public void setSal_liq (float sal_liq) {
        this.sal_liq = sal_liq;
    }



    public void calc_sal(float sal){
        desconto += sal * inss;
        desconto += sal * ir;
        desconto += sal * sind;

        

        setSal_liq(sal - desconto);

    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Sálario base = ");
        builder.append(sal);
        builder.append("\nInss = ");
        builder.append(sal * inss);
        builder.append("\nIR = ");
        builder.append(sal * ir);
        builder.append("\nSindicato = ");
        builder.append(sal * sind);
        builder.append("\nSalário liquido = ");
        builder.append(sal_liq);


       return builder.toString();
    }


}
    
    

