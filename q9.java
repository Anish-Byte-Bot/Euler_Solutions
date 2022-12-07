public class q9 {
    

        public static void main(String[] args) {
            int s=1000,a,b,c=0,c1=0;
            b=c/2;
            for(a=1;a<s/3;a++)
            {
                for(b=a;b<s/2;b++)
                {
                    c=s-a-b;
                    if(a*a+b*b==c*c)
                    {
                        c1++;
                        break;
                    }
                    
                }
                if(c1>0)
                    break;
            }
                System.out.println("abc="+a*b*c);
        }
    
}
