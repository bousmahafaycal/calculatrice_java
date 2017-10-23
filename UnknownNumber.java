class UnknownNumber extends Number {

	String name;

	public UnknownNumber(String name){
		this.name = name;
	}

	public int typeOf(){
		return 4;
	}

	public String getString(){
		return name;
	}
}