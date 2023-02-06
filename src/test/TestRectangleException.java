package test;
import java.io.*;

import rectangle.rectangle;

public class TestRectangleException {
    public static void main(){

            String s= new String("");
            double x,y ;
            // rectangle r1= new rectangle(5,10);
            // r1.Affiche();

            // rectangle r2= new rectangle();
            // r2.Affiche();

            // r2.Changelargeur(r1.DonneLongueur());
            // r2.Changelongueur(r1.DonneLargeur());
            // r2.Affiche();

            // System.out.println("Perimetre:" + r1.Perimetre());
            // System.out.println("Surface:" + r1.Surface());
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            do{
                System.out.print("Entrez la longueur: ");
                s = br.readLine();
                x= Double.valueOf(s);
            }while(x<=0);

            do{
            System.out.print("Entrez la largeur: ");
            s= br.readLine();
            y = Double.valueOf(s);
            }while(y<=0);
            
            rectangle r3 = new rectangle(x,y);

            r3.Affiche();
            System.out.println("Perimetre : " + r3.Perimetre());
            System.out.println("Surface : " + r3.Surface());
         }

            catch(Exception e){
                System.out.print("Erreur d'entrée");

            }       
     }
}
