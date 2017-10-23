public class Opposite extends OperationUnaire {

	public Opposite(){
		
	}
	public Opposite(Expression nb){
		super(nb);
	}

	public Number getNumber(){
		Number n ;
		if (type == 1){
			n = LongNumber.opposite((LongNumber)this.nb);
		}else if (type == 2){
			n = RationalNumber.opposite((RationalNumber)this.nb);
		}else {
			n = DoubleNumber.opposite((DoubleNumber)this.nb);
		}
		return n;
	}

	public String getSymbol(){
		return "&";
	}
	
}