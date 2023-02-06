package rectangle;

public class rectangle {
    private double largeur;
    private double longueur;

    public rectangle(){
        this.largeur = 5;
        this.longueur = 5;
    }
    public rectangle(double l, double L){
        this.largeur= l;
        this.longueur= L;
    }
    
    public void Affiche(){
        System.out.println("Longueur :" + this.longueur);
        System.out.println("Largeur :" + this.largeur);
    }

    public double DonneLongueur() {
        return this.longueur;
    }

    public double DonneLargeur() {
        return this.largeur;
    }

    public void Perimetre(){
        double perimetre=(this.largeur*this.longueur)*2;
        System.out.print(perimetre);
    }
    public void Surface(){
        double surface=(this.largeur*this.longueur);
        System.out.print(surface);
    }
    public void Changelongueur(double L) {
        this.longueur=L;
        System.out.print(this.longueur);
    }
    public void Changelargeur(double l) {
        this.largeur=l;
        System.out.print(this.largeur);
    }
}
