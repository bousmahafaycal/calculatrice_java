public class Substraction extends OperationBinaire {

	public Substraction(){
		
	}
	public Substraction(Expression nb, Expression nb2){
		super(nb, nb2);
	}

	public Number getNumber(){
		int type = Expression.typeOfTwoExpression(nb,nb2);
		Number n ;
		if (type == 1){
			n = LongNumber.substract((LongNumber)this.nb, (LongNumber)this.nb2);
		}else if (type == 2){
			n = RationalNumber.substract(RationalNumber.getRationalNumber((Number)this.nb), RationalNumber.getRationalNumber((Number)this.nb2));
		}else {
			n = DoubleNumber.substract(DoubleNumber.getDoubleNumber((Number)this.nb), DoubleNumber.getDoubleNumber((Number)this.nb2));
		}
		return n;
	}

	public String getSymbol(){
		return "+";
	}
	
}