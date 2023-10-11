package edu.guilherme.sintaxejava.metodos;

public class Usuario {
    public static void main(String [] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        System.out.println("[SMART TV]");
        System.out.println("Ligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        System.out.println("================");

        smartTv.ligar(); // TV LIGADA TRUE

        smartTv.aumentarVolume(); // VOLUME 26
        smartTv.aumentarVolume(); // VOLUME 27
        smartTv.aumentarVolume(); // VOLUME 28
        smartTv.diminuirVolume(); // VOLUME 27

        smartTv.aumentarCanal(); // CANAL 2
        smartTv.aumentarCanal(); // CANAL 3
        smartTv.aumentarCanal(); // CANAL 4
        smartTv.aumentarCanal(); // CANAL 5
        smartTv.diminuirCanal(); // CANAL 4

        System.out.println("[SMART TV]");
        System.out.println("Ligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        System.out.println("================");

        smartTv.mudarCanal(8); // CANAL 8
        
        smartTv.diminuirVolume(); // VOLUME 26
        smartTv.diminuirVolume(); // VOLUME 25
        smartTv.diminuirVolume(); // VOLUME 24

        System.out.println("[SMART TV]");
        System.out.println("Ligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
    }
}
