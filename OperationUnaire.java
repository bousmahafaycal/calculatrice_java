public abstract class OperationUnaire extends Expression {
	
	Expression nb; 
	public OperationUnaire(Expression nb){
		this.nb = nb;
	}


	public abstract Number getNumber();

	public String getString(){
		return getSymbol()+"("+nb.getString()+")";
	}


	public abstract String getSymbol();



}