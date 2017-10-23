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
		return nb.getString() + " " + this.getSymbol() + " " +nb2.getString();
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

	public void subst(String name, Number n){
		UnknownNumber tmp;
		if (this.nb instanceof UnknownNumber){
			tmp = (UnknownNumber) nb;
			if (tmp.name == name){
				nb = n;
			}
					
		}
		else if(this.nb instanceof OperationUnaire || this.nb instanceof OperationBinaire){
			nb.subst(name,n);
		}

		if (this.nb2 instanceof UnknownNumber){
			tmp = (UnknownNumber) nb;
			if (tmp.name == name){
				nb = n;
			}
					
		}
		else if(this.nb2 instanceof OperationUnaire || this.nb2 instanceof OperationBinaire){
			nb.subst(name,n);
		}


		
	}
	
}