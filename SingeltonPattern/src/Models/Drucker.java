package Models;

public class Drucker {
    //Eager Inizialization

    private static final Drucker Instance = new Drucker();


    private Drucker(){
        // um Instanz innerhalb der Klasse zu behalten
    }

    public static Drucker getDrucker(){
        return Instance;
    }


    public static String Drucken(){

        String druck = "ich bin die Instanz:\n" + Drucker.getDrucker();
        return druck;
    }

    public static String Drucken2(){

        String druck2 = "\n\nich bin die Instanz XYZ";
        return druck2;
    }



}
