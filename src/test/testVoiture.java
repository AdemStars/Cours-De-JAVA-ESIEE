package test;

public class testVoiture {
    

public static void main(String [] args){
    voiture v1 = new voiture();
    voiture v2 = new voiture(8,2,1500.50);

    System.out.println("Masse: "+ v1.masse);
    System.out.println("Nombre de roues: "+ v1.NombreDeRoues);

    System.out.println("Masse: "+ v2.masse);
    System.out.println("Nombre de roues: "+ v2.NombreDeRoues);

    }
}