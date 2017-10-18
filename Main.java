class Main {

	public static void main(String[] args) {
		DoubleNumber n = new DoubleNumber(2.0);
		Expression e = new Expression(n);
		System.out.println(e.list.get(0).typeOf()); 
		System.out.println("Bienvenue dans la calculatrice en notation polonaise inversée crée par Mouhamed Diallo et Fayçal Bousmaha.");
		System.out.println();
		Menu.menuPrincipal();

		// calculatrice();
	}

	public static void calculatrice(){
		while(true){
			
		}
	}

}