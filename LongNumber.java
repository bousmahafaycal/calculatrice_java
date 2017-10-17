class LongNumber extends Number {
	protected long nb;

	public LongNumber(long nb){
		this.nb = nb;
	}

	public int typeOf(){
		return 3;
	}

	public LongNumber add(LongNumber nb, LongNumber nb2){
		return new LongNumber(nb.nb+nb2.nb);
	}

	public LongNumber substract(LongNumber nb, LongNumber nb2){
		return new LongNumber(nb.nb-nb2.nb);
	}

	public LongNumber multiplicate(LongNumber nb, LongNumber nb2){
		return new LongNumber(nb.nb*nb2.nb);
	}

	public Number divide(LongNumber nb, LongNumber nb2){
		if(nb.nb%nb2.nb == 0)
			return new LongNumber(nb.nb/nb2.nb);
		return new DoubleNumber(nb.nb, nb2.nb);
	}
}