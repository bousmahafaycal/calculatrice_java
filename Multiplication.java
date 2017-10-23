public class Multiplication extends OperationBinaire {

	public Multiplication(){
		
	}
	public Multiplication(Expression nb, Expression nb2){
		super(nb, nb2);
	}

	public Number getNumber(){
		int type = Expression.typeOfTwoExpression(nb,nb2);
		Number n ;
		if (type == 1){
			n = LongNumber.multiplicate((LongNumber)this.nb, (LongNumber)this.nb2);
		}else if (type == 2){
			n = RationalNumber.add(RationalNumber.getRationalNumber((Number)this.nb), RationalNumber.getRationalNumber((Number)this.nb2));
		}else {
			n = DoubleNumber.multiplicate((DoubleNumber)this.nb, (DoubleNumber)this.nb2);
		}
		return n;
	}

	public String getSymbol(){
		return "*";
	}
	
}