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
		return new DoubleNumber(1.0/nb.nb);;
	}

	public String getString(){
		return " "+Double.toString(nb)+" ";
	}
}