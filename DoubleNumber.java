class DoubleNumber extends Number {
	protected double nb;

	public DoubleNumber(double nb){
		this.nb = nb;
	}

	public int typeOf(){
		return 3;
	}

	public static DoubleNumber add(DoubleNumber nb, DoubleNumber nb2){
		return new DoubleNumber(nb.nb+nb2.nb);
	}

	public static DoubleNumber substract(DoubleNumber nb, DoubleNumber nb2){
		return new DoubleNumber(nb.nb-nb2.nb);
	}

	public static DoubleNumber multiplicate(DoubleNumber nb, DoubleNumber nb2){
		return new DoubleNumber(nb.nb*nb2.nb);
	}

	public static DoubleNumber divide(DoubleNumber nb, DoubleNumber nb2){
		return new DoubleNumber(nb.nb/nb2.nb);
	}

	public static DoubleNumber opposite(DoubleNumber nb){
		return new DoubleNumber(-nb.nb);
	}

	public static DoubleNumber reverse(DoubleNumber nb){
		return new DoubleNumber(1/nb.nb);
	}

	public String getString(){
		return " "+Double.toString(nb)+" ";
	}

	public static DoubleNumber getDoubleNumber(Number nb){
		if (nb instanceof RationalNumber){
			RationalNumber newDouble = (RationalNumber)nb;
			return new DoubleNumber(newDouble.numerator/newDouble.denominator);
		}else if (nb instanceof LongNumber) {
			LongNumber tmp = (LongNumber)nb;
			double num = (double)tmp.nb;
			return new DoubleNumber(num);
		}
		DoubleNumber newDouble2 = (DoubleNumber)nb;
		return newDouble2;
	}
}