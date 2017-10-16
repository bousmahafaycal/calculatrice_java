abstract class Number extends Expression {

	public int typeOf(){
		if (this instanceof FloatNumber){
			type = 0;
		}else if (this instanceof RationalNumber){
			type = 1;
		}else {
			type = 2;
		}
	}

	public static int typeOfTwoNumber(Number nb, Number nb2){
		if (nb instanceof FloatNumber || nb2 instanceof FloatNumber){
			type = 0;
		}else if (nb instanceof RationalNumber || nb2 instanceof RationalNumber){
			type = 1;
		}else {
			type = 2;
		}
	}
}