class DoubleNumber extends Number {
	protected double nb;

	public DoubleNumber(double nb){
		this.nb = nb;
	}

	public int typeOf(){
		return 0;
	}

	public DoubleNumber add(DoubleNumber nb, DoubleNumber nb2){
		return new DoubleNumber(nb.nb+nb2.nb);
	}

	public DoubleNumber substract(DoubleNumber nb, DoubleNumber nb2){
		return new DoubleNumber(nb.nb-nb2.nb);
	}

	public DoubleNumber multiplicate(DoubleNumber nb, DoubleNumber nb2){
		return new DoubleNumber(nb.nb*nb2.nb);
	}

	public DoubleNumber divide(DoubleNumber nb, DoubleNumber nb2){
		return new DoubleNumber(nb.nb/nb2.nb);
	}
}