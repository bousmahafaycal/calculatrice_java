import  java.util.ArrayList;
class ParseFunction {
	private String s;
	ArrayList<String> function = new ArrayList<String>() ;
	ArrayList<String[]> args = new ArrayList<String[]> ();


	String [] list_function = {"exit","setvariable","getvariable", "clean", "subst", "help"};

	public ParseFunction(String s){
		s = s.replace(" ","");
		// Mettre en minuscule s
		this.s = s;


	}

	public ParseFunction(){

	}

	public int doParse(){
		// -1 = function not found but () found
		// 0 = no ( or )
		// 1 = Ok 
		int left = Outils.findNb(s,"(");
		int right = Outils.findNb(s,")");
		if (left == -1 || right == -1){
			return 0;
		}

		String in = s.substring(left, right);
		String function =  s.substring(0,left);
		for (int i = 0; i < list_function.length ; i++) {
			if (function.equals(list_function[i])){
				this.function.add(function);
				this.args.add(in.split(","));
				return 1;
			}
		}
		
		

		return -1;

	}

	public void setString(String s){
		s = s.replace(" ","");
		this.s = s;
	}

	


	public void printListFunction(){
		// Maybe move it in the consol interface
		System.out.println("Voici la liste de fonctions disponible :");
		for (int i = 0; i < list_function.length; i++){
			System.out.println("- "+list_function[i]);
		}
		System.out.println();
	}



}