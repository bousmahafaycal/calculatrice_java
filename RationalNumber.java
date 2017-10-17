class RationalNumber extends Number {
	protected long numerator;
	protected long denominator;

	public RationalNumber(long numerator, long denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int typeOf(){
		return 1;
	}

	public RationalNumber add(RationalNumber nb, RationalNumber nb2){
		long numerator1, numerator2, denominator1, denominator2;
		numerator1 = nb.numerator*nb2.denominator;
		denominator1 *= nb.denominator*nb2.denominator;
		numerator2 *= nb2.numerator*nb.denominator;
		denominator2 *= nb2.denominator*nb.denominator;
		return new RationalNumber(numerator1+numerator2, denominator1+denominator2);
	}

	public RationalNumber substract(RationalNumber nb, RationalNumber nb2){
		long numerator1, numerator2, denominator1, denominator2;
		numerator1 = nb.numerator*nb2.denominator;
		denominator1 *= nb.denominator*nb2.denominator;
		numerator2 *= nb2.numerator*nb.denominator;
		denominator2 *= nb2.denominator*nb.denominator;
		return new RationalNumber(numerator1-numerator2, denominator1-denominator2);
	}

	public RationalNumber multiplicate(RationalNumber nb, RationalNumber nb2){
		return new RationalNumber(nb.numerator*nb2.numerator, nb.denominator*nb2.denominator);
	}

	public RationalNumber divide(RationalNumber nb, RationalNumber nb2){
		return new RationalNumber(nb.numerator*nb2.denominator, nb.denominator*nb2.numerator);
	}
}