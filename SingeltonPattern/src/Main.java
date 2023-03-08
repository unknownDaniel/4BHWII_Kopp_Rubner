import Models.Drucker;

public class Main {

    public static void main(String[] args) {


        Drucker d1 = Drucker.getDrucker();
        //private --> Instanz nur so verfügbar
        Drucker d2 = Drucker.getDrucker();

        if (d1 == d2){
            System.out.println("Gleicher Drucker:\n");
            System.out.println(d1.Drucken());
            System.out.println(d2.Drucken());
        }else{
            System.out.println(d1.Drucken());
            System.out.println(d2.Drucken());

        }

        System.out.println(d1.Drucken2());


    }



}
