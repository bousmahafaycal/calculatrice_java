public abstract class OperationUnaire extends Expression {
	
	Expression nb; 
	int type = 0;

	public OperationUnaire(){

	}

	public OperationUnaire(Expression nb){
		this.nb = nb;
		this.type = nb.typeOf();
	}


	public abstract Number getNumber();

	public String getString(){
		return getSymbol()+"("+nb.getString()+")";
	}


	public abstract String getSymbol();


	public  void setExpression(Expression nb){
		this.nb = nb;
		this.type = nb.typeOf();
	}

	public int typeOf (){
		return this.type;
	}

	public void subst(String name, Number n, Expression parent){
		UnknownNumber tmp;
		if (this.nb instanceof UnknownNumber){
			tmp = (UnknownNumber) nb;
			if (tmp.name.equals( name)){
				nb = n;
			}
					
		}
		else if(this.nb instanceof OperationUnaire || this.nb instanceof OperationBinaire){
			nb.subst(name,n, this);
		}
		parent.calculate();
		
	}

	public void calculate(){
		Number n;
		OperationBinaire op1;
		OperationUnaire ou1;
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
		
	}

}