package proyecto_Sem_12_a_18;

public class Catalan {
	public static long fact (long n) {
		long f = 1;
		for (int i = 1; i <= n; i++)
			f *= i;
		return f;
	}
	
	public static long catalan1(long n) {
		return fact(2*n)/(fact(n+1)*fact(n));
	}
	
	public static long catalan2(long n) {
		if (n == 0) 
			return 1;
		return 2*(2*n-1)*catalan2(n-1)/(n+1);
	}	
}
