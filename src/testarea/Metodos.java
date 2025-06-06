package testarea;

public class Metodos {
    

    public static void main (String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.println("1- TV Ligada? "+smartTv.ligada);
        System.out.println("1- Canal Atual: "+smartTv.canal);
        System.out.println("1- Volume atual: "+smartTv.volume);


        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.ligar();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();




        System.out.println("2- TV Ligada? "+smartTv.ligada);
        System.out.println("2- Canal Atual: "+smartTv.canal);
        System.out.println("2- Volume atual: "+smartTv.volume);
    }

    // public void dividir(int dividendo, int divisor) throws Exception{

    // }
}
