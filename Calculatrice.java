import java.util.*;

class Calculatrice {
	ParseString parser;
	Expression expression;

	public Calculatrice(){

	}

	public void calculatrice(){
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
					if(!expression.addNumber(parser.list.get(i))){
						backup = i;
						break;
					}
				}else if(parser.list.get(i) instanceof OperationBinaire){
					if(!expression.addOperationBinaire(parser.list.get(i))){
						if(!expression.addNumber(parser.list.get(i))){
							backup = i;
							break;
					}
				}else if(parser.list.get(i) instanceof OperationUnaire){
					if(!expression.addOperationUnaire(parser.list.get(i))){
						if(!expression.addNumber(parser.list.get(i))){
							backup = i;
							break;
					}
				}
			}for (int i = 0; i<backup; i++) {
				expression.list.remove(expression.list.size()-1-i);
			}System.out.println(expression.list.getString()+"\n");
		}
	}
}