public class q16 {
    
        // Sum of the digits
         public static void main(String[] args) {
            int k=0;
    int s=0;
           int n =(int)Math.pow(2, 1000);
           //System.out.println(n);
           while(n>0){
           k=n%10;
           s=s+k;
           n=n/10;}
           System.out.println(s);
    
        } 
        
    }
    

