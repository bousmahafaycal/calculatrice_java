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

	public String getString(){
		String s = "";
		for (int i = 0; i < list.size() ; i++ ) {
			
			s += list.get(i).getString();
			
		}
		return s;
	}

	public void addNumber(Number nb){
		list.add(nb);
	}

	public boolean addOperationBinaire(OperationBinaire op){
		int size = list.size();
		if (size < 2){
			return false;
		}

		Expression e = this.list.get(size-1);
		Expression e2 = this.list.get(size-2);
		this.list.remove(size-1);
		this.list.remove(size-2);
		op.setExpressions(e,e2);

		if (op.typeOf() == 4){
			list.add(op);
		}else {
			Expression n = op.getNumber();
			list.add(n);
		}

		return true;

	}

	public boolean addOperationUnaire(OperationUnaire op){
		int size = list.size();
		if (size < 1){
			return false;
		}
		list.add(op);
		return true;
	}
	
	public void subst(String name, Number n){
		UnknownNumber tmp;
		for (int i = 0; i < list.size() ; i++ ) {
			if (list.get(i) instanceof UnknownNumber ){
				tmp = (UnknownNumber) list.get(i);
				if (tmp.name == name)
					list.remove(i);
					list.add(i,n);
			}else if(list.get(i) instanceof OperationUnaire || list.get(i) instanceof OperationBinaire){
				list.get(i).subst(name,n);
			}
			
		}
	}
}