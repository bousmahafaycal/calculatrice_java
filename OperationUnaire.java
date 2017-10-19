public abstract class OperationUnaire extends Expression {
	
	Expression nb; 
	int type;

	public OperationUnaire(){

	}

	public OperationUnaire(Expression nb){
		this.nb = nb;
	}


	public abstract Number getNumber();

	public String getString(){
		return getSymbol()+"("+nb.getString()+")";
	}


	public abstract String getSymbol();


	public  void setExpression(Expression nb){
		this.nb = nb;
		this.type = nb.typeOf();
	}

	public int typeOf (){
		return this.type;
	}

}