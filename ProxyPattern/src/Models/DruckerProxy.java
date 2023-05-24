package Models;

public class DruckerProxy implements Drucker {

    private Drucker druckenSw;
    private Drucker druckenFarbe;
    private Drucker laserDrucker;

    public DruckerProxy(){
        this.druckenSw = new SwDrucker();
        this.druckenFarbe = new FarbDrucker();
        this.laserDrucker = new LaserDrucker();

    }



    @Override
    public void drucken(String dokument, int seitenanzahl) {

        if(seitenanzahl < 0){
            System.out.println("Fehler, ungültige Seitenanzahl ");
            return;
        }

        if(seitenanzahl <500 && seitenanzahl >100){
            druckenSw.drucken(dokument,seitenanzahl);
            System.out.println("Bitte Papiereinlage und Tintenpatronen überprüfen ");
        }



        if(seitenanzahl >500 && seitenanzahl<800){
            laserDrucker.drucken(dokument,seitenanzahl);

            return;
        }

        if(seitenanzahl > 800){
            laserDrucker.drucken(dokument, seitenanzahl);
            System.out.println("Papiereinlage überprüfen");
            System.out.println("Drucker warten");
            System.out.println("Papier abkühlen lassen");
            return;
        }

        if(seitenanzahl >= 50){
            druckenSw.drucken(dokument, seitenanzahl);
        }
        else{
            druckenFarbe.drucken(dokument, seitenanzahl);
        }


    }
}
