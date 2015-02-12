import static java.util.Arrays.fill;
import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

class Rerun {

	public static void main(String args[]){
	
	long [] primes = new long [200];
	primes[0] = 2L;
	primes[1] = 3L;
	int count = 2;
	
	long number = 5L;
	
	outer:
	for( ; count < primes.length; number += 2L ){
	
	long limit = (long)ceil(sqrt((double)number));
	
	for(int i = 1; i < count && primes[i] <= limit; ++i){
	
		if(number%primes[i] == 0L){
		
		continue outer;
		
		}
	
	}
	
	primes[count++] = number;
	
	}
	
	for(long n : primes){System.out.println(n);}
	//displayElements(myArray);
	System.out.println(primes.length);
	}


	



}