public abstract class OperationBinaire extends Expression {

	protected Number nb, nb2; 
	protected int type;

	public OperationBinaire(Number nb, Number nb2){
		this.nb = nb;
		this.nb2 = nb2;
		if (nb instanceof FloatNumber || nb2 instanceof FloatNumber){
			type = 0;
		}else if (nb instanceof RationalNumber || nb2 instanceof RationalNumber){
			type = 1;
		}else {
			type = 2;
		}
	}

	public abstract Number getNumber();

	public abstract String getString();
	
}