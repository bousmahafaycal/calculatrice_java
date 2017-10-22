public class Opposite extends OperationUnaire {

	public Opposite(){
		
	}
	public Opposite(Expression nb){
		super(nb);
	}

	public Number getNumber(){
		Number n ;
		if (type == 1){
			// n = LongNumber.substract((LongNumber)this.nb, (LongNumber)this.nb2);
		}else if (type == 2){
			// n = RationalNumber.substract((RationalNumber)this.nb, (RationalNumber)this.nb2);
		}else {
			// n = DoubleNumber.substract((DoubleNumber)this.nb, (DoubleNumber)this.nb2);
		}
		return n;
	}

	public String getSymbol(){
		return "&";
	}
	
}