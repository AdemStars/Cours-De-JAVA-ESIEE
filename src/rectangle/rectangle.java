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

    public double Perimetre(){
        return (this.largeur*this.longueur)*2;
        
    }
    public double Surface(){
       return (this.largeur*this.longueur);
    }
    public void Changelongueur(double L) {
        if (L>0.0){
        this.longueur=L;
        }else{
            System.out.println("Veuillez choisir une valeur positive");
        }
    }
    public void Changelargeur(double l) {
        if (l>0.0){
        this.largeur=l;
        }else{
            System.out.println("Veuillez choisir une valeur positive");
        }
    }
}
