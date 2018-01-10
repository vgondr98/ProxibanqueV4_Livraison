*******************************************************************************
**************************PROXIBANQUE V4***************************************
*****************Benjamin, Joinel, Khaled, Nina, Victor************************

****************** Description de l'application : *****************************

ProxiBanque SI est une application destinés aux gérants et conseillers du réseau 
d'agences Proxibanque. Les différentes fonctionnalités de l'applications sont : 
- Authentification des conseillers et des gérants (l'authetification est requise 
pour accéder aux fonctionnalités de l'application). L'utilisateur peut se 
déconnecter à tout moment.

Pour le conseiller il est possible de : 
- Consulter la liste des clients. L'application lui permet ainsi de mettre à jour
les informations du clients, lister ses différents comptes (courant ou épargne) 
ainsi que d'effectuer un virement.
- Modifier les informations suivantes du client : nom, prénom, email, adresse.
- Ajouter un nouveau client 
- Lister les comptes d'un client
- Effectuer un virement de compte à compte uniquement sur les comptes domiciliés
dans la banque.
- Aleter par les clients à découverts

Pour le gérant il est possible de :
- Effectuer toutes les opérations du conseiller (décrites ci-dessus).
- Consulter la liste de tous les conseillers
- Accéder à des graphiques (histogrammes ou camembert) associés aux transactions 
réalisés dans les derniers mois ou la dernière semaine pour l'ensemble des clients

L'application prend en compte un systeme de gestion des erreurs afin d'indiquer 
aux utilsiateurs les dysfocntionnements.

*****************************
PREREQUIS 
*****************************
Installation Java Runtime Environment 8.
Installation de Apache Tomcat v8.5.23
Installation de Oracle DataBase 11g Express Edition
Installation de Google Chrome Version 62.0.3202.94 de préférence, pour profiter 
de toute l'ergonomie de l'application.

*****************************
DOCUMENTATION 
*****************************

Pour consulter la documentation, vous devez suivre les indications suivantes : 
1) Accéder au dossier 'doc/'
2) Double cliquez sur 'index.html'

*****************************
EXECUTION DE L'APPLICATION
*****************************

A) Téléchargez et Dézippez le repository sur votre machine.

B) A l'aide de l'invite de commande, placez-vous dans le dossier 'angular-pbv4'

C) Veuillez lancer la commande"ng serve --open"
	Si un message d'erreur apprarait, veuillez lancer la commande "npm install"
	et ainsi vous pourrez relancer l'appli avec "ng serve --open"
D) La page d'accueil de l'appli s'affiche Accéder à la page d'accueil de l'application 
	Proxibanque : 
   1)) Pour vous authentifier voici une liste de login/mot de passe valide pour 
      un conseiller ou gérant : 
      Login : pdupond Password : toto 
	Vous pouvez ainsi accéder aux fonctionnalités de l'application ProxiBanque.

*****************************************************************
INFORMATIONS COMPLEMENTAIRES TECHNIQUES (AMELIORATIONS)
*****************************************************************	 	
Cette version fonctionnelle est basée sur des services dont les données sont issues
de JSON enregistrés dans l'application ProxiBanque.

Le groupe a développé néanmoins deux autres web-service :
1) Le premier non opérationnel correspondant à un projet MAVEN multi-module qui 
se situe dans le dossier '/WebServiceNonFonctionnel . Il s'agit d'un projet qui 
est beaucoup plus fourni que le second au niveau des webservices. Il sera opérationnel
lors du prochain sprint.
2) Le second opérationnel pour produire un flux JSON représentant la liste totale 
de tous les clients ainsi qu'un autre flux JSON représentant la liste de clients 
associés à un conseiller. 

Cependant le lien WEBService / Angular (via flux JSON) n'est pas encore réalisé 
et opérationnel, c'est pour cela que le groupe a décidé de livrer une version 
fonctionnelle réalisé à partir d'un webservice injecté directement en "dur" sur 
Angular. 
    	  	


