*******************************************************************************
**************************PROXIBANQUE V4***************************************
*****************Benjamin, Joinel, Khaled, Nina, Victor************************

****************** Description de l'application : *****************************

ProxiBanque SI est une application destin�s aux g�rants et conseillers du r�seau 
d'agences Proxibanque. Les diff�rentes fonctionnalit�s de l'applications sont : 
- Authentification des conseillers et des g�rants (l'authetification est requise 
pour acc�der aux fonctionnalit�s de l'application). L'utilisateur peut se 
d�connecter � tout moment.

Pour le conseiller il est possible de : 
- Consulter la liste des clients. L'application lui permet ainsi de mettre � jour
les informations du clients, lister ses diff�rents comptes (courant ou �pargne) 
ainsi que d'effectuer un virement.
- Modifier les informations suivantes du client : nom, pr�nom, email, adresse.
- Ajouter un nouveau client 
- Lister les comptes d'un client
- Effectuer un virement de compte � compte uniquement sur les comptes domicili�s
dans la banque.
- Aleter par les clients � d�couverts

Pour le g�rant il est possible de :
- Effectuer toutes les op�rations du conseiller (d�crites ci-dessus).
- Consulter la liste de tous les conseillers
- Acc�der � des graphiques (histogrammes ou camembert) associ�s aux transactions 
r�alis�s dans les derniers mois ou la derni�re semaine pour l'ensemble des clients

L'application prend en compte un systeme de gestion des erreurs afin d'indiquer 
aux utilsiateurs les dysfocntionnements.

*****************************
PREREQUIS 
*****************************
Installation Java Runtime Environment 8.
Installation de Apache Tomcat v8.5.23
Installation de Oracle DataBase 11g Express Edition
Installation de Google Chrome Version 62.0.3202.94 de pr�f�rence, pour profiter 
de toute l'ergonomie de l'application.

*****************************
DOCUMENTATION 
*****************************

Pour consulter la documentation, vous devez suivre les indications suivantes : 
1) Acc�der au dossier 'doc/'
2) Double cliquez sur 'index.html'

*****************************
EXECUTION DE L'APPLICATION
*****************************

A) T�l�chargement du dossier '/angular-pbv4': veuillez t�l�charger le dossier 
'angular-pbv4' sur votre pc.

B) Ouvrir l'invit� de commande et veuillez vous placer sur le chemin d'acc�s 
de votre dossier o� est situ� le dossier � l'aide de la commande "cd" suivi
du chemin d'acc�s.

C) Veuillez lancer la commande"ng serve --open"
	Si un message d'erreur apprarait, veuillez lancer la commande "npm install"
	et ainsi vous pourrez relancer l'appli avec "ng serve --open"
D) La page d'accueil de l'appli s'affiche Acc�der � la page d'accueil de l'application 
	Proxibanque : 
   1)) Pour vous authentifier voici une liste de login/mot de passe valide pour 
      un conseiller ou g�rant : 
      Login : pdupond Password : toto 
	Vous pouvez ainsi acc�der aux fonctionnalit�s de l'application ProxiBanque.

*****************************************************************
INFORMATIONS COMPLEMENTAIRES TECHNIQUES (AMELIORATIONS)
*****************************************************************	 	
Cette version fonctionnelle est bas�e sur des services dont les donn�es sont issues
de JSON enregistr�s dans l'application ProxiBanque.

Le groupe a d�velopp� n�anmoins deux autres web-service :
1) Le premier non op�rationnel correspondant � un projet MAVEN multi-module qui 
se situe dans le dossier '/WebServiceNonFonctionnel . Il s'agit d'un projet qui 
est beaucoup plus fourni que le second au niveau des webservices. Il sera op�rationnel
lors du prochain sprint.
2) Le second op�rationnel pour produire un flux JSON repr�sentant la liste totale 
de tous les clients ainsi qu'un autre flux JSON repr�sentant la liste de clients 
associ�s � un conseiller. 

Cependant le lien WEBService / Angular (via flux JSON) n'est pas encore r�alis� 
et op�rationnel, c'est pour cela que le groupe a d�cid� de livrer une version 
fonctionnelle r�alis� � partir d'un webservice inject� directement en "dur" sur 
Angular. 
    	  	


