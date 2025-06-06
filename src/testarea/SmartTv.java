package testarea;

public class SmartTv {
    boolean ligada = false;
    int canal;
    int volume = 70;



    public void ligar (){
        ligada = true;
    }
    public void desligar (){
        ligada = false;
    }

    public void abaixarVolume(){
        volume--;
    }
    public void aumentarVolume(){
        volume++;
    }


    public void abaixarCanal(){
        
        canal--;
    }
    public void aumentarCanal(){
        if(canal==99){
            canal= 0;
        }else{
            canal++;
        }
    }
    public void definirCanal(int novoCanal){
        canal = novoCanal;
    }
}
