public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;   
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal (){
        canal++;
    }

     public void diminuirCanal (){
        canal--;
    }

    public void aumentarvolume(){
        volume++;
        System.out.println("Aumentando o Volume para:" + volume);
        
    }
    public void diminuirVolume(){
        volume--;
         System.out.println("diminuindo o Volume para:" + volume);
    }



    public void ligar() {
        ligada = true;
    }

        public void desligar() {
        ligada = false;
    }
}
