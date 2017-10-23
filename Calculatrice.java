import java.util.*;

class Calculatrice {
	ParseString parser;
	Expression expression = new Expression();

	public Calculatrice(){

	}

	public void calcul(){
		Scanner sc = new Scanner(System.in);
		String entrance;
		int backup;
		while(true){
			backup = 0;
			System.out.print("calc> ");
			entrance  = sc.nextLine();
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
			}System.out.println(expression.getString()+"\n");
		}
	}
}