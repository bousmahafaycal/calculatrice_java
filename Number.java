abstract class Number extends Expression {

	public abstract int typeOf();

	public int pgcd(int a, int b){
		int r;
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