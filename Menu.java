public class Menu {
	public static int menu (String phrase, String [] choix, boolean barre){
		// Fonction affichant un menu de manière structurée et renvoyant le choix de l'utilisateur.
		if (barre)
			System.out.println("--------------------------");

		System.out.println(phrase);
		for (int i = 0; i < choix.length; i++){
			System.out.println(choix[i]);
		}
		System.out.print("Votre choix : ");
		int a = Outils.getInt();
		if (barre)
			System.out.println("--------------------------");
		System.out.println();
		return a;
	}


	public static void menuPrincipal(){
		
		String [] choix = {"1 - Entrer dans la calculatrice en live", "4 - Quitter"};
		int action = menu("Choisissez ce que vous  voulez faire : ", choix, true);
		while (action > choix.length || action < 1){
			System.out.println();
			System.out.println("Erreur : Veuillez entrer un nombre entre "+1+" et "+choix.length);
			action = menu("Choisissez ce que vous  voulez faire : ", choix, true);
		}
		if(action == 1){
			Calculatrice calculatrice = new Calculatrice();
			calculatrice.calcul();
		}
	}
}