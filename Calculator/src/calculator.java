public class calculator implements CalculatorIF {
   public int sum(int m, int n){
       for (i=0;i<n;i++)
           m+=1;
     return m;
    }
   public int divide(int m, int n){
       int s; int c=0;
       while(m>0)
           s=m-n; c+=1;
       if(m!=0)
           c-=1;
       return c;
    }

}
