package test;

public class voiture {
    public int NombreDeRoues;
    private int couleur;
    public double masse;

    public voiture(){
        this.NombreDeRoues= 4;
        this.masse= 1200.25;
    }
    public voiture(int r, int c, double m){
        this.couleur= c;
        this.masse = m;
        this.NombreDeRoues = r;
    }
}
