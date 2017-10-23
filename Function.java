class Function {
	

	public static void cleanUp(Expression e){
		e = new Expression();
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

}