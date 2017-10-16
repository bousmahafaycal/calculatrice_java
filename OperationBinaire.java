public abstract class OperationBinaire extends Expression {

	protected Number nb, nb2; 
	protected int type;

	public OperationBinaire(Number nb, Number nb2){
		this.nb = nb;
		this.nb2 = nb2;
	}

	public abstract Number getNumber();

	public abstract String getString();
	
}