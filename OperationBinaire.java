public abstract class OperationBinaire extends Expression {

	protected Expression nb, nb2; 
	protected int type;

	public OperationBinaire(Expression nb, Expression nb2){
		this.nb = nb;
		this.nb2 = nb2;
		this.type = Expression.typeOfTwoExpression(nb,nb2);
	}

	public abstract Number getNumber();

	public abstract String getString();

	public int typeOf (){
		return this.type;
	}
	
}