class Function {
	

	public static Expression cleanUp(){
		Expression e = new Expression();
		return e;
	}

	public static void help(){
		String [] list_function = ParseFunction.list_function;
		System.out.println("Voici la liste de fonctions disponible :");
		for (int i = 0; i < list_function.length; i++){
			System.out.println("- "+list_function[i]);
		}
		System.out.println();
		System.out.println("Par ailleurs, les fonctions sont toujours exécutes après les operandes et les opérations");
		System.out.println();
	}

	public static void subst(Expression e, String name, Number n){
		e.subst(name, n);
	}

	public static void save(String path, Expression e){
		try{
			Outils.ecrireFichier(path, e.getString());
		}catch(Exception exception){

		}
	}


	public static Expression load(String path, Expression e){
		Calculatrice c = new Calculatrice(e);
		try{
			String str = Outils.lireFichier(path);
			str = str.replace("  "," ");
			if (str.charAt(0) == ' ')
				str = str.substring(1);
			c.evaluate(str);
			return c.expression;
		}
		catch(Exception exc){
			return e;
		}
		

	}

}