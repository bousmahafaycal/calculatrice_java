abstract class Number extends Expression {

	public abstract int typeOf();

	public static long pgcd(long a, long b){
		long r;
		while (b != 0){
    		r = a%b;
    		a = b;
    		b = r;
    	}
		return a;
	}

	public long valeurAbsolue(long n){
		if(n<0)
			return -n;
		return n;
	}
}