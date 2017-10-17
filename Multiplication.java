public class Multiplication extends OperationBinaire {

	public Multiplication(Expression nb1, Expression nb2){
		super(nb1, nb2);
	}

	public Number getNumber(){
		if (this.type == 1){

		}else if (this.type == 2){

		}else {
			return null;
		}
		return null;
	}

	public String getSymbol(){
		return "*";
	}
	
}