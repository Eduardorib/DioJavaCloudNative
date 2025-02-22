public class Usuario {

    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.out.println(smartTV.ligada);
        System.out.println(smartTV.volume);
        System.out.println(smartTV.canal);

        smartTV.ligar();
        System.out.println(smartTV.ligada);

        smartTV.desligar();
        System.out.println(smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
    }
}
