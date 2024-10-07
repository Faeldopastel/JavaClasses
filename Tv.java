public class Tv {

    private int canal, vol;

    public void setCanal(int canal) {
        this.canal = canal;

    }
    public int getCanal() {
        return canal;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public int getVol() {
        return vol;
    }


    public int t_canal(int canal){
        if(this.canal == canal){
            System.out.print("Mesmo canal\n");
            return 0;
        } else{
            System.out.print("Troca feita\n");
            setCanal(canal);
            return 1;
        }
    }

    public int m_vol(int vol, int mudar_v){
        if(vol < 0){
            return 0;
        }
        else{

            if(mudar_v == 1 && vol < this.vol){
                System.out.print("Volume diminuido!\n");
                setVol(vol);
                return 1;

            } 
            else if
                (mudar_v == 2 && (vol > this.vol && vol <= 100)){
                System.out.print("Aumentando o volume");
                setVol(vol);
                return 2;
            }

            return 0;

        }
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Canal: ");
        builder.append(canal);
        builder.append("\nVol: ");
        builder.append(vol);


        return builder.toString();
    }
    
}
