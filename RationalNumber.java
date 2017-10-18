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
		long numerator1 = 0, numerator2 = 0, denominator1 = 0, denominator2 = 0;
		numerator1 = nb.numerator*nb2.denominator;
		denominator1 *= nb.denominator*nb2.denominator;
		numerator2 *= nb2.numerator*nb.denominator;
		denominator2 *= nb2.denominator*nb.denominator;
		return new RationalNumber(numerator1+numerator2, denominator1+denominator2);
	}

	public static RationalNumber substract(RationalNumber nb, RationalNumber nb2){
		long numerator1 = 0, numerator2 = 0, denominator1 = 0, denominator2 = 0;
		numerator1 = nb.numerator*nb2.denominator;
		denominator1 *= nb.denominator*nb2.denominator;
		numerator2 *= nb2.numerator*nb.denominator;
		denominator2 *= nb2.denominator*nb.denominator;
		return new RationalNumber(numerator1-numerator2, denominator1-denominator2);
	}

	public static RationalNumber multiplicate(RationalNumber nb, RationalNumber nb2){
		return new RationalNumber(nb.numerator*nb2.numerator, nb.denominator*nb2.denominator);
	}

	public static RationalNumber divide(RationalNumber nb, RationalNumber nb2){
		long numerator = nb.numerator*nb2.denominator;
		long denominator = nb.denominator*nb2.numerator;
		long divisor = pgcd(valeurAbsolue(numerator), valeurAbsolue(denominator));
		if(nb.nb<0 && nb2.nb<0){
			nb.nb = -nb.nb;
			nb2.nb = -nb2.nb;
		}else if(nb2.nb<0){
			nb.nb = -nb.nb;
			nb2.nb = -nb2.nb;
		}
		return new RationalNumber(nb.numerator*nb2.denominator, nb.denominator*nb2.numerator);
	}
}