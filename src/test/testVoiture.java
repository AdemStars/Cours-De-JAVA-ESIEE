package test;

public class testVoiture {


public static void main(String [] args){
    voiture v1 = new voiture();
    voiture v2 = new voiture(8,2,1500.50);
    voiture v3 = new voiture(18,3,1200.50);

    v1.ChangeCouleur(1);
    v1.AfficheVoiture();
    }
}