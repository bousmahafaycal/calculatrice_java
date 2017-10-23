public abstract class OperationBinaire extends Expression {

	protected Expression nb, nb2; 
	protected int type;

	public OperationBinaire(){
		
	}

	public OperationBinaire(Expression nb, Expression nb2){
		this.nb = nb;
		this.nb2 = nb2;
		this.type = Expression.typeOfTwoExpression(nb,nb2);
	}

	public abstract Number getNumber();

	public String getString(){
		return nb.getString() + " "   +nb2.getString() + " " + this.getSymbol();
	}
	public abstract String getSymbol();

	public int typeOf (){
		return this.type;
	}

	public void setExpressions(Expression nb, Expression nb2){
		this.nb = nb;
		this.nb2 = nb2;
		this.type = Expression.typeOfTwoExpression(nb,nb2);
	}

	public void subst(String name, Number n, Expression parent){
		System.out.println("Subst OperationBinaire");
		UnknownNumber tmp;
		if (this.nb instanceof UnknownNumber){
			tmp = (UnknownNumber) nb;
			if (tmp.name == name){
				setExpressions(n, nb2);
				parent.calculate();
			}
					
		}
		else if(this.nb instanceof OperationUnaire || this.nb instanceof OperationBinaire){
			nb.subst(name,n);
		}

		if (this.nb2 instanceof UnknownNumber){
			tmp = (UnknownNumber) nb2;
			if (tmp.name == name){
				setExpressions(nb, n);
				parent.calculate();
				
			}
					
		}
		else if(this.nb2 instanceof OperationUnaire || this.nb2 instanceof OperationBinaire){
			nb.subst(name,n);
		}

		


		
	}

	public void calculate(){
		Number n;
		OperationBinaire op1, op2;
		OperationUnaire ou1, ou2;
		if (nb.typeOf() != 4){
			if (nb instanceof OperationBinaire){
				op1 = (OperationBinaire)nb;
				n  = op1.getNumber();
				nb = n;
			}
			if (nb instanceof OperationUnaire){
				ou1 = (OperationUnaire)nb;
				n  = ou1.getNumber();
				nb = n;
			}
			
		}

		if (nb2.typeOf() != 4){
			if (nb2 instanceof OperationBinaire){
				op2 = (OperationBinaire)nb2;
				n  = op2.getNumber();
				nb2 = n;
			}
			if (nb2 instanceof OperationUnaire){
				ou2 = (OperationUnaire)nb2;
				n  = ou2.getNumber();
				nb2 = n;
			}
			
		}
		
	}
	
}