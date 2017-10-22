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

	public static DoubleNumber oppisite(DoubleNumber nb){
		return new DoubleNumber(-nb.nb);
	}

	public static DoubleNumber inverse(DoubleNumber nb){
		return new DoubleNumber(1/nb.nb);
	}

	public String getString(){
		return " "+Double.toString(nb)+" ";
	}
}