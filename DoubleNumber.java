class DoubleNumber extends Number {
	protected double nb;

	public DoubleNumber(double nb){
		this.nb = nb;
	}

	public int typeOf(){
		return 3;
	}

	static public DoubleNumber add(DoubleNumber nb, DoubleNumber nb2){
		return new DoubleNumber(nb.nb+nb2.nb);
	}

	static public DoubleNumber substract(DoubleNumber nb, DoubleNumber nb2){
		return new DoubleNumber(nb.nb-nb2.nb);
	}

	static public DoubleNumber multiplicate(DoubleNumber nb, DoubleNumber nb2){
		return new DoubleNumber(nb.nb*nb2.nb);
	}

	static public DoubleNumber divide(DoubleNumber nb, DoubleNumber nb2){
		return new DoubleNumber(nb.nb/nb2.nb);
	}
}