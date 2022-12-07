public class q10 {
    /*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.*/


	public static void main(String[] args) {
		long s=2;
		for(int i=3;i<2000000;i=i+2)
		{int c=0;
			for(int j=1;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==1)
				s+=i;
		}
		System.out.println("sum of all the primes below two million="+s);
	}


    
}
