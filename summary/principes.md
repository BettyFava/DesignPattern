 # Principe de conception


## Identifier les aspects de votre application qui varient et séparez-les de ceux qui demeurent constants
Si un aspect du code est amené à changer au gré des exigences, il faut l'extraire du code qui, lui, ne changera pas. 
Partie variable à extraire et à encapsuler pour y effectuer des modifications sans affecter le reste du code. 

**BASE de tout Design Pattern !!!**


## Programmer une interface, non une implémentation. 
Dans le cas des exemples canard : 
* Interface pour représenter chaque comportement (vol/cancan)
* Implémentation d'un comportement implémentera l'une de ces interfaces.
Cela nécessite de créer un ensemble de classe qui ne servira que pour représenter un comportement et qui implémentera l'interface comportementale. 
Programmer une interface = programmer un supertype (interface ou classe abstraite). Les objets affectés à ces variables peuvent provenir de n'importe quelle implémentation concrète du supertype --> la classe qui les déclare n'a pas besoin de savoir quels sont les types des objets réels !

## Préférer la composition à l'héritage
Ceci permet de :
* Encapsuler une famille d'algorithmes dans leur propore ensemble de classes
* Modifier le comportement au moment de l'exécution tant que l'objet implémente l'interface correcte.
Au lieu d'hériter, il vaut mieux que les objets obtiennent un comportements en étant composé avec le bon objet comportemental.

## Efforcez-vous de coupler faiblement les objets qui interagissent
Comme dans le cas du pattern Observer, avec le faible couplage, nous pouvons réutiliser les objets et les sujets indépendamment les uns des autres. 
Les modifications, par exemple, des sujets ne vont pas affecter les observateurs et vice-versa. 
Ainsi, avec un couplage faible, nous pouvons construire des systèmes souples avec une interdépendances faible entre les objets. 
Le code peut donc être amené à changer plus facilement. 

## Les classes doivent être ouvertes à l'extension mais fermées à la modification

## Le principe d'inversion des dépendances : dépendez d'abstractions et ne dépendez pas des classes concrètes
Les composants de haut niveau (classe dont le comportement est défini en termes d'autres composants de bas niveau) ne doivent pas dépendre des composants de bas niveau mais d'abstractions. 

## Ne jamais parler à des inconnus
Nous devons être attentif au nombre de classe avec lesquels un objet interagit et à la façon dont il entre en interaction avec elles.
Ceci empêche de créer des systèmes constitués d'un grand nombre de classes fortement couplées dans lesquels les modifications d'une composante se propagent en cascades aux autres parties. Les interdépendances fragilisent les systèmes et complexifient la maintenance 

## Ne nous appelez pas, nous vous appellerons
Evite la gangrène des dépendances c'est-à-dire le fait que des composants de haut niveau dépendent de composants de bas niveau qui dépendent de composants de haut niveau qui dépendent de composants transverses. Dès lors, on ne comprends plus le code. Ce principe permet aux composants de bas niveau de s'adapter à un système mais les composants de haut niveau déterminent quand on en a besoin et comment. 


# Les différents pattern

## Stratégie
Définit une famille d'algorithmes, encapsule chacun d'eux et les rend interchangeables. 
Stratégie permet donc à l'algorithme de varier indépendamment des clients qui l'utilisent. 

## Observateur
Définit une relation entre objets de type n-à plusieurs de façon que, lorsque un objet change d'état, tout ceux qui en dépendent en soient notifiés et mis à jour de manière automatique 

## Décorateur
Attache des responsabilités supplémentaires à un objet de façon dynamique. Il permet une solution alternative pratique à la dérivation pour étendre les fonctionnalités (suit les principes ouvert-fermé). Ce pattern est donc une solution d'étendue du comportement sans sous-classer. Un ensemble de classes "décorateurs" va être utiliser pour "envelopper" des composants concrets et ces classes reflètent ce qu'elles décorent (elles sont du même type) 
Cependant, de nombreux objets sont amenés à être crées générant une certaine complexité. 

## Fabrique Abstraite
Fournit une interface pour créer des familles d'objets apparentés ou dépendants sans avoir à spécifier leurs classes concrètes. 
Le code utilisant cette interface va être découpler de la fabrique réelle qui fabrique ce produit. On peut alors implémenter une gamme de fabriques qui créent des produits destinés  différents contextes. Le code est découplé des produits réels, on peut substituer différentes fabriques pour obtenir différents comportements. 

## Fabrication
Définit une interface pour la création d'un objet mais en laissant aux sous-classe le choix des classes à instancier. 
Fabrication permet à une classe de déléguer l'instanciation à des sous-classes. Ce pattern s'appuie sur l'héritage : la création des objets est déléguée aux sous-classes qui implémentent la méthode de fabrication pour créer des objets. 

## Singleton
Garantit qu'une classe n'a qu'une seule instance et fournit un point d'accès de type global à cette instance. On utilise donc un constructeur privée et une méthode statique combinée à une variable statique. Il faut examiner les contraintes de performances pour choisir l'implémentation adéquate.

## Commande
Encapsule une requête comme un objet autorisant ainsi le paramètrage des clients par différents requêtes, files d'attente et récapitulatifs de requêtes tout en permettant la réversibilité des opérations. Le pattern Commande découple un objet émettant une requête de celui qui sait comment l'exécuter. L'objet Commande est au centre du mécanisme de découplage et encapsule un récépeur avec une action ou un ensemble d'action.

## Adaptateur
Convertit l'interface d'une classe en une autre conforme à celle du client. L'adaptateur permet à des classes de collaborer alors qu'elles n'auraient pas pu le faire du fait d'interfaces incompatibles. Ce pattern est utile pour utiliser une classe existante dont l'interface n'est pas celle dont on a besoin. Un adaptateur transforme donc une interface en celle que le client attend.
Il existe deux formes :
* les adaptateurs d'objet
* les adaptateurs de classe (appel à l'héritage multiple)

## Façade
Fournit une interface unifiée à l'ensemble des interfaces d'un sous-système. La façade fournit une interface de plus haut niveau qui rend le sous-système plus facile à utiliser. Utile pour simplifier et unifier une grosse interface ou un ensemble d'interfaces complexes et pour découpler un client d'un sous-système complexe. Pour implémenter une façade, on recourt à la délégation. 

## Méthode
Définit le squelette d'un algorithme dans une méthode en déléguant certaines étapes en sous-classes. Cela permet aux sous-classes de redéfinir certaines étapes d'un algorithme sans modifier la structure de celle-ci. 
