class RationalNumber extends Number {
	protected long numerator;
	protected long denominator;

	public RationalNumber(long numerator, long denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int typeOf(){
		return 2;
	}

	public static RationalNumber add(RationalNumber nb, RationalNumber nb2){
		RationalNumber r = new RationalNumber(nb.numerator*nb2.denominator+nb2.numerator*nb.denominator, nb.denominator*nb2.denominator);
		r.simplificate();
		return r;
	}

	public static RationalNumber substract(RationalNumber nb, RationalNumber nb2){
		RationalNumber r = new RationalNumber(nb.numerator*nb2.denominator-nb2.numerator*nb.denominator, nb.denominator*nb2.denominator);
		r.simplificate();
		return r;
	}

	public static RationalNumber multiplicate(RationalNumber nb, RationalNumber nb2){
		RationalNumber r = new RationalNumber(nb.numerator*nb2.numerator, nb.denominator*nb2.denominator);
		r.simplificate();
		return r;
	}

	public static RationalNumber divide(RationalNumber nb, RationalNumber nb2){
		RationalNumber r = new RationalNumber(nb.numerator*nb2.denominator, nb.denominator*nb2.numerator);
		r.simplificate();
		return r;
	}

	public void simplificate(){
		long divisor = pgcd(absoluteValue(numerator), absoluteValue(denominator));
		numerator /= divisor;
		denominator /= divisor;
		minusOfNominateur();
	}

	public void minusOfNominateur(){
		if(numerator<0 && denominator<0){
			numerator = -numerator;
			denominator = -denominator;
		}else if(denominator<0){
			numerator = -numerator;
			denominator = -denominator;
		}
	}

	public static RationalNumber oppisite(RationalNumber nb){
		return new RationalNumber(-nb.numerator, nb.denominator);
	}

	public static RationalNumber inverse(RationalNumber nb){
		return new RationalNumber(nb.denominator, nb.numerator);
	}

	public String getString(){
		return " "+Long.toString(numerator)+"/"+Long.toString(denominator)+" ";
	}
}