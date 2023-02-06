package cercle;
import java.lang.Math;
import java.util.function.DoubleFunction;

public class cercle {
    double rayon;

    public cercle(double r){
        this.rayon=r;
    }
    public double DonneRayon() {
        return this.rayon;
    }
    public void ChangeRayon(double L) {
        if (L>0.0){
        this.rayon=L;
        }else{
            System.out.println("Veuillez choisir une valeur positive");
        }
    public void AfficheCercle(){
        System.out.println("Le cercle est de rayon :" + this.rayon);
    }
    public Perimetre(){
        return(2*this.rayon*Math.PI);
    }
    public Surface(){
        return((this.rayon)*2*Math.PI);
    }

}
