# Calculatrice avec  notation polonaise inversée

Projet réalisé par Fayçal BOUSMAHA et Mouhamed DIALLO pour la matière CPO5 en L3 informatique à l'université Paris Diderot.

Le projet a été réalisé dans son intégralité, c'est-à-dire jusqu'à l'exercice 4.
Il est simple d'éxecution, il suffit de compiler tous les fichiers ".java" et de lancer le fichier "Main.java".

Nous avons pu ajouter quelques fonctions bonus, notamment "help()" (qui répertorie les fonctions disponible), "clean" (qui vide la pile et efface les données précedentes) ou encore load (qui permet de charger des expressions depuis un fichier).

Dans notre schéma, "Expression" prédomine. C'est en grande partie de la que tout découle. Ensuite il y a "Number" qui englobe tout ce qui concerne les différents types de nombres que l'on peut avoir. Et l'autre grande partie est axé sur les types de calculs bien qu'en réalité les calculs primaires soient contenuent dans les sous classes de nombres (ex : RationalNumber, DoubleNumber...)