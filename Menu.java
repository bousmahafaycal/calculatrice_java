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
}