import java.util.Scanner;
public class TvMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tv troca = new Tv();
        
        int vol, canal;
        int escolha = 1;
        int mudar_c, mudar_v;
        
        System.out.print("Digite o canal: ");
        canal = entrada.nextInt();
        System.out.print("\nDigite o volume: ");
        vol = entrada.nextInt();
        
        troca.setCanal(canal);
        troca.setVol(vol);
        
        while(escolha == 1){

            System.out.print("Alterar? 1 - sim; 2 - não: ");
            escolha = entrada.nextInt();

            while(escolha < 1 || escolha > 2){
                System.out.print("\nDigite novamente: ");
                escolha = entrada.nextInt();
            }
    
            if(escolha == 2){
                break;
            }
            else{
                System.out.print("\nMudar canal? 1-sim; 2 não: ");
                mudar_c = entrada.nextInt();

                if(mudar_c == 1){
                    
                    canal = entrada.nextInt();
                    while(troca.t_canal(canal) == 0){

                        canal = entrada.nextInt();
                    }
                    troca.setCanal(canal);
                }

                System.out.print("\n1-Diminuir volume; 2 - Aumentar volume;  ");
                mudar_v = entrada.nextInt();
                while(vol == 100 && mudar_v == 2){
                    System.out.print("Volume no máximo. Digite novamente: ");
                    mudar_v = entrada.nextInt();
                }

                if (mudar_v == 1 || mudar_v == 2) {
                    
                    vol = entrada.nextInt();
    
                    while(troca.m_vol(vol, mudar_v) == 0){
                        System.out.print("\nVolume menor que o comum. amigo: ");
                        vol = entrada.nextInt();
                    }
                    troca.setVol(vol);
                }
                
            }
            
            
        }

        System.out.print(troca);  
        entrada.close();
    }
    
}
