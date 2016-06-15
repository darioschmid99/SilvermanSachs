public class Controller{

    private F_Vorlage fenster;
    private Bank bank;
    private Kunde kunde;
    private int kto_Akt;
    private String bank_Akt;

    public Controller(){

    }

    public boolean anmeldenKunde(int ktoNr, int pin){
        return false;
    }

    public boolean anmeldenBank(int name, int pin){
        return false;
    }

    public void einzahlen(int ktoNr, double betrag){

    }

    public void abheben(int ktoNr, double betrag){

    }

    public Konto ktostand(int ktoNr){

    }

    public void ueberweisen(int ursprung,int ziel, double betrag){

    }

    public void pinAendern(int ktoNr, int neuePin){

    }

    public void ktoErstellen(Konto kto){

    }

    public void ktoLoeschen(int ktoNr){
    }

    public void ktoBetrachten(int ktoNr){
    }

    public void aktionAbbrechen(){
    }

}