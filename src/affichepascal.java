public class affichepascal {
static int [][] Tab;

static void Pascal(int [] [] Tab){
    int i,j;
    i=0;
    do {
        Tab[i][0]= 1;
        Tab[i][i]= 1;
        i = i+1;
    }while( i <=Tab.length - 1);

    i=2;
    do{
        j= 1;
        do{
            Tab[i][j]= Tab[i-1][j-1] + Tab[i-1][j];
            j = j+1;
        }while(j <= Tab[i].length - 1);
        i = i+1;
     }while(i <= Tab.length - 1);
  }
  
  
  static void AffichMulti(int [][] Tab) {
     int i,j;
     
     i = 0;
     do {
        j = 0;
        do {
           System.out.print(Tab[i][j] + "\t");
           j = j+1;
        }while(j <= i);
        System.out.print("\n");
        i = i+1;
     }while(i <= Tab.length - 1);
  }


  public static void main(String[] args) {
     //T = new double [][] {{1,3,6,-2,0},{-3,4,2,25,10},{11,-12,20,18,4}};
     int [][] Tab;
     int n = 6;
     Tab = new int[n][n];
     Pascal(Tab);
     AfficheMulti(Tab);
  }
}