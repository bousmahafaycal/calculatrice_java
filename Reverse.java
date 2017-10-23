public class Reverse extends OperationUnaire {

	public Reverse(){
		
	}
	public Reverse(Expression nb){
		super(nb);
	}

	public Number getNumber(){
		Number n ;
		if (this.type == 1){
			n = LongNumber.reverse((LongNumber)this.nb);
		}else if (type == 2){
			n = RationalNumber.reverse((RationalNumber)this.nb);
		}else {
			n = DoubleNumber.reverse((DoubleNumber)this.nb);
		}
		return n;
	}

	public String getSymbol(){
		return "#";
	}
	
}