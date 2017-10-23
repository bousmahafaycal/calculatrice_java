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

	public static long absoluteValue(long n){
		if(n<0)
			return -n;
		return n;
	}

	public static Number createNumber(String s){
		int nb_point = Outils.compter(s,".");
		int nb_divide = Outils.compter(s,"/");
		
		if (nb_divide >= 2){
			return null;
		}
		if (nb_point == 0){
			if (nb_divide==0)
				return new LongNumber(Long.parseLong(s));
			else{
				String [] tab = s.split("/");
				return new RationalNumber(Long.parseLong(tab[0]),Long.parseLong(tab[1]));
			}
			

		} else if (nb_point == 1){
			return new DoubleNumber(Double.parseDouble(s));
		}return null;
	}
}