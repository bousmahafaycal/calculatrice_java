import java.util.LinkedList;
public class Expression {

	LinkedList<Expression> list = new LinkedList();

	public Expression (){

	}

	public Expression (Expression e){
		list.add(e);
	}

	

	public static int typeOfTwoExpression(Expression e1, Expression e2){
		int a = e1.typeOf();
		int b = e2.typeOf();
		if (a>b){
			return a;
		}
		return b;
	}

	public int typeOf(){
		// 1 is for Integer, 2 for Rational, 3 for DoubleNumber, 4 for expression (if there is any variable)
		int max = 1;
		for (int i = 0; i < list.size() ; i++ ) {
			if (list.get(i).typeOf() > max){
				max = list.get(i).typeOf();
			}
		}
		return max;
	}



	
}