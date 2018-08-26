Principe de conception


Identifier les aspects de votre application qui varient et séparez-les de ceux qui demeurent constants -> si un aspect du code est amené à changer au gré des exigences, il faut l'extraire du code qui, lui, ne changera pas. 
Partie variable à extraire et à encapsuler pour y effectuer des modifications sans affecter le reste du code. 

--> BASE de tout Design Pattern !!!


Programmer une interface, non une implémentation. 
Dans le cas des exemples canard --> interface pour représenter chaque comportement (vol/cancan) et l'implémentation d'un comportement implémentera l'une de ces interfaces. Cela nécessite de créer un ensemble de classe qui ne servira que pour représenter un comportement et qui implémentera l'interface comportementale. 
Programmer une interface = programmer un supertype (interface ou classe abstraite). Les objets affectés à ces variables peuvent provenir de n'importe quelle implémentation concrète du supertype --> la classe qui les déclare n'a pas besoin de savoir quels sont les types des objets réels !
[explication avec du code]