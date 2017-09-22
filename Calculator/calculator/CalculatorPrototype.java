package calculator;

public class CalculatorPrototype implements CalculatorIF {
   public int sum(int m, int n){
       for (int i=0;i<n;i++)
           m+=1;
     return m;
    }
   public int divide(int m, int n){
       int c=0;
       while(m>0){
           m=m-n; c+=1;
       }
       if(m!=0)
           c-=1;
       return c;
    }

}
