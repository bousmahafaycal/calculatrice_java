import java.util.*;

class Calculatrice {
	ParseString parser;
	Expression expression = new Expression();

	public Calculatrice(){

	}

	public Calculatrice(Expression e){
		expression = e;
	}

	public void calcul(){
		Scanner sc = new Scanner(System.in);
		String entrance;
		

		while(true){
			System.out.print("calc> ");
			entrance  = sc.nextLine();
			evaluate(entrance);
			
			
			for (int i = 0; i<parser.list_function.size(); i++) {
				System.out.println(i);
				if (parser.list_function.get(i).equals("clean")) {
					expression = Function.cleanUp(); 
				}else if (parser.list_function.get(i).equals("help"))
					Function.help();
				else if (parser.list_function.get(i).equals("subst")){
					if (parser.args.get(i).length == 2) {
						Function.subst(expression, parser.args.get(i)[0], Number.createNumber(parser.args.get(i)[1]));
					}
				}else if (parser.list_function.get(i).equals("save")){
					if (parser.args.get(i).length == 1) {
						Function.save(parser.args.get(i)[0], expression);
					}
				}else if (parser.list_function.get(i).equals("load")){
					if (parser.args.get(i).length == 1) {
						expression = Function.load(parser.args.get(i)[0], expression);
					}
				}
			}
			System.out.println(expression.getString()+"\n");
		}
	}

	public void evaluate(String entrance){
		int backup = 0;
		parser = new ParseString(entrance);
			parser.doParse();

			for (int i = 0; i<parser.list.size(); i++) {
				if(parser.list.get(i) instanceof Number){
					expression.addNumber((Number)parser.list.get(i));
				}else if(parser.list.get(i) instanceof OperationBinaire){
					if(!expression.addOperationBinaire((OperationBinaire)parser.list.get(i))){
						backup = i;
						break;
					}
				}else if(parser.list.get(i) instanceof OperationUnaire){
					if(!expression.addOperationUnaire((OperationUnaire)parser.list.get(i))){
						backup = i;
						break;
					}
				}
			}for (int i = 0; i<backup; i++) {
				expression.list.remove(expression.list.size()-1-i);
			}
	}

}