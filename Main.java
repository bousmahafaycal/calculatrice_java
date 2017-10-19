class Main {

	public static void main(String[] args) {
		DoubleNumber n = new DoubleNumber(2.0);
		Expression e = new Expression(n);
		System.out.println(e.list.get(0).typeOf()); 
		System.out.println("Bienvenue dans la calculatrice en notation polonaise inversée crée par Mouhamed Diallo et Fayçal Bousmaha.");
		System.out.println();
		Menu.menuPrincipal();
		// DoubleNumber n2 = new DoubleNumber(5.0);
		Multiplication m = new Multiplication();
		//e.addNumber(n2);
		//e.addNumber(n2);
		e.addOperationBinaire(m);
		System.out.println("Aa");
		System.out.println(e.list.size());
		System.out.println(e.getString());
		// calculatrice();
	}

	public static void calculatrice(){
		while(true){
			
		}
	}



}