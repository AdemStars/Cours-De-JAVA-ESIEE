package test;

public class voiture {
    public int NombreDeRoues;
    private int couleur;
    public double masse;

    public voiture(){
        this.NombreDeRoues= 4;
        this.masse= 1200.25;
        this.couleur= 3;
    }
    public voiture(int r, int c, double m){
        this.couleur= c;
        this.masse = m;
        this.NombreDeRoues = r;
    }
    public void AfficheVoiture(){
        switch(this.couleur){
            case 1:{
                System.out.println("Couleur: jaune");
                break;
            }
            case 2:{
                System.out.println("Couleur: bleu");
                break;
            }
            case 3:{
                System.out.println("Couleur: noir");
                break;
            }
        }
    }
    public void ChangeCouleur(int c){
        if ((1 <= c)&&(c <=3)){
            this.couleur=c;
        }else{
            System.out.println("Couleur comprise entre 1 et 3 ");
        }
    }
}
