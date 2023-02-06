class App {

        static void afficherEllement(){
        int i =0;
        int  j =0;
        for(i=0;i<=s.length-1;i++){

           // System.out.print(i+" : ");

            for(j=0;j<=s[i].length-1;j++){

                System.out.print(s[i][j]+", ");

            }
            j=0;
            System.out.println();
        }

    }static double [] [] s ={{1,3,6,-2,0},{-3,4,2,25,10},{11,-12,20,18,4}};
    static int n=8;
    static int [][] mat=new int [n][n];



    static void trianglePascal(){
        int i=0;
        int j =0;
        do {

            i++;
            mat[i][0]=1;
            mat[i][i]=1;
            System.out.println();

            for(j=0;j<=mat.length-1;j++){

                if(i>=1 && j>=1){
                    mat[i][j] = mat[i-1][j-1] + mat[i-1][j];
                }

                if(mat[i][j]==0){
                    System.out.print(" \t");
                }else{
                    System.out.print(mat[i][j]+ "\t");
                }


            }

            j=0;
        
        } while (i<mat.length-1);

    }

    static double calculPuissance(double a, int n){
        int i=0;
        double c =1;

        while(i<=n-1){
            c=c*a;
            i++;
        }

       // System.out.println(c);
        return c;

    }

    static int calculFacto(int a){
        int i=0;
        int c=1;
        
        if(a==0){
            System.out.println(c);
        }

        while(i!=a){

            c+=c*i;
            i++;
        
        }
        //System.out.println(c);
        return c;

    }

    static void sinus(double x,int n){ 
        double sin = 0;
        int i=0;


        while(i<=n){

            sin += (calculPuissance(-1, i) * calculPuissance(x, 2*i+1))/calculFacto(2*i+1);
            i++;

        }

        System.out.println(sin);

    }
    
    static void carremagique(int n, int[][] Tab){
        int k;

        int j = n / 2;
        int i = n /2 + 1 ;
        Tab[i][j]=1;
        for (k=2;(k<= n*n); k++){
            i= i +1;
            if(i ==n){
                i=0;
            }
            j= j+1;
            if(j==n){
                j=0;
            }
            if(Tab[i][j] !=0){
                i = i+1;
                if(i ==n){
                    i=0;
                    if(j==-1){
                        j=n-1;
            }
        }
        Tab[i][j]=k;
    }
}
    }
static void AfficheMulti(int [][] Tab) {
    int i,j;
    
    i = 0;
    do {
       j = 0;
       do {
          System.out.print(Tab[i][j] + "\t");
          j = j+1;
       }while(j <= Tab[i].length-1);
       System.out.print("\n");
       i = i+1;
    }while(i <= Tab.length - 1);
 }

    }
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        //trianglePascal();
        //afficherEllement();
        //calculPuissance(2, 5);
        //calculFacto(56);
        //sinus(3.14/2, 7);
        int n=3;
        int[][] Tab= new int[n][n];
        carremagique(n,Tab);
        AfficheMulti(Tab);
        

    }