import java.util.ArrayList;
class ParseString {
	// Parse string to get operande and operations

	
	private String s = new String();
	ArrayList<Expression> list = new ArrayList<Expression>();
	ArrayList<String> list_function = new ArrayList<String>();
	ArrayList<String[]> args = new ArrayList<String[]> ();

	public ParseString(String s){
		s = s.replace("  "," ");
		this.s = s;
		
		


	}

	public boolean doParse(){
		String s = "" ;
		String [] tab = this.s.split(" ");
		int type;
		int ancien = 0 ;
		ParseFunction p = new ParseFunction();
		int p_int;

		for (int i = 0; i < tab.length; i++){
			s = tab[i];
			p.setString(s);
			p_int = p.doParse();
			if (p_int == 0){
				for (int j = 0; j < s.length(); j++ ){
					type = getTypeChar(s.charAt(j));
					if (j != 0){
						if (type != ancien && ! (type == 1 && ancien == 5 || type == 5 && ancien == 1)){
							return false;
						}						
					}

					ancien = type;
				}
				
				if (! addExpression(ancien,s))
					return false;
				
				
			} 
			else if (p_int == -1 ){
				return false;
			}
			
			

			
		}
		list_function = p.function;
		args = p.args;

		return true;

	}

	public boolean addExpression(int ancien, String s){
			if (ancien == 1)
				createNumber(s);
			else if (ancien == 2)
				createUnknown(s);
			else if (ancien == 3)
				createMultiplication(s);
			else if (ancien == 4)
				createAddition(s);
			else if (ancien == 5)
				createDivision(s);
			else if (ancien == 6)
				createSubstraction(s);
			else if (ancien == 7)
				createOpposite(s);
			else if (ancien == 8)
				createReverse(s);
			/* else if (ancien == 9)
				createPower(s);
			else if (ancien == 10)
				createModulo(s); */
			else
				return false;
			
			return true;
	}
	
	private void createAddition(String s){
		System.out.println("Addition");
		list.add(new Addition());
	}

	private void createSubstraction(String s){
		list.add(new Substraction());
	}

	private void createDivision(String s){
		list.add(new Division());
	}

	private void createMultiplication(String s){
		list.add(new Multiplication());
	}

	private void createModulo(String s){
		// list.add(new Multiplication());
	}

	private void createPower(String s){
		// list.add(new Multiplication());
	}

	private void createOpposite(String s){
		list.add(new Opposite());
	}

	private void createReverse(String s){
		list.add(new Reverse());
	}

	private boolean createNumber(String s){
		System.out.println("nb : "+s);
		int nb_point = Outils.compter(s,".");
		int nb_divide = Outils.compter(s,"/");
		
		if (nb_divide >= 2){
			return false;
		}
		if (nb_point == 0){
			if (nb_divide==0)
				list.add(new LongNumber(Long.parseLong(s)));
			else{
				String [] tab = s.split("/");
				list.add(new RationalNumber(Long.parseLong(tab[0]),Long.parseLong(tab[1])));
			}
			

		} else if (nb_point == 1){
			list.add(new DoubleNumber(Double.parseDouble(s)));
		} else {
			return false;
		}
		return true;

	}

	private void createUnknown(String s){
		list.add(new UnknownNumber(s));
	}

	public ArrayList<Expression> getExpressions(){
		
		return list;
	}

	

	public int getTypeChar(char s){
		if (s >= '0' && s <= '9' || s=='.'){
			return 1;	
		}
		else if (s >='a' && s <= 'z' || s == '_' || s>='a' && s <= 'z'){
			return 2;
		}
		else if(s == '*'){
			return 3;
		}

		else if(s == '+'){
			return 4;
		}

		else if (s == '/'){
			return 5;
		}

		else if (s == '-'){
			return 6;
		}

		else if (s == '&'){
			return 7;
		}

		else if (s == '#'){
			return 8;
		}

		/*else if (s == '^'){
			return 9;
		}

		else if (s == '%'){
			return 10;
		}*/

		return 0;

	}

	
}