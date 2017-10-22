class ParseFunction {
	private String s;
	private String [] function ;
	private int function_id;

	private String [] list_function = {"exit","setvariable","getvariable", "clean", "replaceunknown", "help"};

	public ParseFunction(String s){
		s = s.replace(" ","");
		// Mettre en minuscule s
		this.s = s;


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

		this.function = s.substring(0, left);
		this.args = in.split(",");

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