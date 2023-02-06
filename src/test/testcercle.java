package test;
import cercle.cercle;
import java.io.*;

public class testcercle {

    public static void main(String[] args) throws Exception{
     String s= new String("");
     Double r;
     try{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        do{
            System.out.print("Entrez le rayon: ");
            s = br.readLine();
            r= Double.valueOf(s);
        }while(r<=0);
        cercle c = new cercle(r);
        c.AfficheCercle();
        c.ChangeRayon(3.5+c.DonneRayon());
        c.AfficheCercle();
        System.out.println("Perimetre: " + c.Perimetre());
        System.out.println("Surface: " + c.Surface());

     }  catch(Exception e){
        System.out.println("Erreur recommencer l'opération");
        testcercle.main(args);
         }
     return; 
    }
    
}
