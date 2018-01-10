--Script de creation des tables de la base COMPTE

Prompt *************************************************************************************
Prompt CONNEXION A LA BASE DE DONNEES 

connect system/bourne;
drop user khaled cascade;
create user khaled identified by khaled;
grant connect, create view, resource to khaled;
connect khaled/khaled;

Prompt *************************************************************************************
Prompt LANCEMENT DU SCRIPT DE CREATION DE LA BASE COMPTE-VERSION 2018



--SUPPRESSION DES TABLES
Prompt *************************************************************************************
Prompt SUPPRESSION DES TABLES
Prompt *************************************************************************************

drop table gerant cascade constraints purge;
drop table conseiller cascade constraints purge;
drop table client cascade constraints purge;
drop table compte cascade constraints purge;
drop table virement cascade constraints purge;
drop table user_roles cascade constraints purge;


--CREATION DES TABLES

Prompt *************************************************************************************
Prompt CREATION DES TABLES
Prompt *************************************************************************************

Prompt CREATION DE LA TABLE GERANT

create table gerant
 (idger  number(6) constraint pk_idger primary key,
 loginger varchar(30) UNIQUE ,
 password varchar(5) UNIQUE,
 prenomger varchar(20) UNIQUE,
 nomger varchar(20));

 
 
Prompt CREATION DE LA TABLE CONSEILLER

create table conseiller
( idcons 		  number(6) constraint pk_idcons primary key,
  logincons  	  varchar(30) UNIQUE, 
  password		  varchar(5) UNIQUE,
  prenomcons      varchar(20),
  nomcons         varchar(20),
  idger   	 	  number(6) constraint fk_idgerc references gerant(idger));
 

Prompt CREATION DE LA TABLE CLIENT

create table client
( idcli          number constraint pk_idcli primary key,
  prenomcli      varchar(20),
  nomcli         varchar(20),
  Adresse        varchar(60),
  codepostal     varchar(5),
  Ville          varchar(30),
  Telephone      varchar(10),
  Email			 varchar(40),
  idcons         number(30) constraint fk_logconscl references conseiller(idcons));
  
Prompt CREATION DE LA TABLE COMPTE

create table compte
( numcompte    number(6) constraint pk_ncc primary key,
  idcli          number constraint fk_idclcc references client(idcli),
  TYPE_COMPTE    varchar(10),
  dateouv		 date,
  solde          number(10,2), 
  decouvert      number(10,2),
  tauxrem        number(1,2));
 

Prompt CREATION DE LA TABLE VIREMENT

create table virement
( numvir         number constraint pk_nvir primary key,
  idcons      	 number(30) constraint fk_logconsvir references conseiller(idcons),
  compteemetteur number(6),
  comptecible    number(6),
  montantvir     number (8,2),
  datevir        date,
  libelle		 varchar(30));



Prompt *************************************************************************************

--INSERTION DES DONNEES

Prompt INSERTION DES DONNEES
Prompt *************************************************************************************

Prompt INSERTION DANS GERANT
delete from GERANT;
insert into gerant values (1,'jchirac','popo','Jacques','Chirac'); 
insert into gerant values (2,'emacron','pupu','Emmanuel','Macron');
insert into gerant values (3,'fhollande','papa','Francois','Hollande');

Prompt INSERTION DANS CONSEILLER

DELETE FROM CONSEILLER;
insert into conseiller values (1,'pdupond','toto','Paul','Dupond',1); 
insert into conseiller values (2,'jfontaine','tutu','Jean','Fontaine',2);
insert into conseiller values (3,'rhoareau','titi','Remi','Hoareau',3);
insert into conseiller values (4,'psanchez','tata','Pierre','Sanchez',3);
insert into conseiller values (5,'pierre.sanchez','tyty','Pierre','Sanchez',1);


Prompt INSERTION DANS CLIENT

delete from client;

insert into client values(1,'Richard','FOSTER','9 RUE DU LAC',45900,'LA SOURCE','0302345698','r.foster@forbes.com',1);
insert into client values(2,'Jean-Filipo ','DE LATTRE DE FRANCE','13 AVENUE DES TILLEULS',92310,'SEVRES','0134568934',null,2);
insert into client values(3,'Paul','PRAT','89 RUE DES CHEVREAUX',33000,'BORDEAUX','0455237806','p.prat@oticien.com',2);
insert into client values(4,'Lucien','VIGOT','78 RUE EISENBERG',75005,'PARIS','0126597820',null,4);
insert into client values(5,'Hattmann','BELLEUS','15 RUE DE LA BOHEME',75007,'PARIS','0135678712','h.belleus@gmail.com',5);
insert into client values(6,'Loriane','EYMANN','13 AVENUE DES TILLEULS',92310,'SEVRES','0134568934',null,4);
insert into client values(7,'Stanislas','DESORGES','60 RUE DE BIARRITZ',13008,'MARSEILLE','0456788932','desorges@desorges.fr',3);
insert into client values(8,'John','SMITH','SQUARE DU PETIT MARIN',13008,'MARSEILLE','0356999013','jsmith@hotmail.fr',4);
insert into client values(9,'Albert','MOUNIER','126 RUE DES MARINS',29000,'BREST','0302345698','a.mounier@hsbc.com',1);
insert into client values(10,'Paul','MOULIN','13 AVENUE DES TILLEULS',94000,'CRETEIL','0134568934',null,2);
insert into client values(11,'Paul','PRAT','89 RUE DES CHEVREAUX',33000,'BORDEAUX','0455237806','p.prat@oticien.com',2);
insert into client values(12,'Lucien','VIGOT','78 RUE EISENBERG',75005,'PARIS','0126597820',null,4);
insert into client values(13,'Hattmann','BELLEUS','15 RUE DE LA BOHEME',75007,'PARIS','0135678712','h.belleus@gmail.com',5);
insert into client values(14,'Loriane','EYMANN','13 AVENUE DES TILLEULS',92310,'SEVRES','0134568934',null,4);
insert into client values(15,'Stanislas','DESORGES','60 RUE DE BIARRITZ',13008,'MARSEILLE','0456788932','desorges@desorges.fr',3);
insert into client values(16,'John','SMITH','SQUARE DU PETIT MARIN',13008,'MARSEILLE','0356999013','jsmith@hotmail.fr',4);

prompt INSERTION DANS COMPTE

delete from compte;

insert into compte values (711010,1,'courant','26/11/2017',300000.00,500.00,null);
insert into compte values (918303,3,'courant','26/11/2017',1000000.50,500.00,null);
insert into compte values (916562,6,'courant','26/11/2017',2500.00,500.00,null);
insert into compte values (917417,7,'courant','26/11/2017',-100.00,500.00,null);
insert into compte values (718456,2,'courant','26/11/2017',6400.78,500.00,null);
insert into compte values (914302,8,'courant','26/11/2017',-300.00,500.00,null);
insert into compte values (714878,9,'courant','26/11/2017',15000.00,500.00,null);
insert into compte values (911045,10,'courant','26/11/2017',3530.00,500.00,null);
insert into compte values (718167,12,'courant','26/11/2017',7530.00,500.00,null);
insert into compte values (912264,11,'courant','26/11/2017',112000.90,500.00,null);
insert into compte values (717694,5,'courant','26/11/2017',12500.00,500.00,null);
insert into compte values (711987,13,'courant','26/11/2017',125000.00,500.00,null);
insert into compte values (719485,14,'courant','26/11/2017',7139.36,500.00,null);
insert into compte values (714009,15,'courant','26/11/2017',1190.07,500.00,null);
insert into compte values (728457,2,'epargne','26/11/2017',75000.00,null,.03);
insert into compte values (924695,4,'epargne','26/11/2017',10000000.00,null,.03);
insert into compte values (727610,5,'epargne','26/11/2017',800000.00,null,.03);
insert into compte values (924545,3,'epargne','26/11/2017',3000000.10,null,.03);
insert into compte values (927646,8,'epargne','26/11/2017',100000.09,null,.03);
insert into compte values (921026,10,'epargne','26/11/2017',45000.00,null,.03);
insert into compte values (728181,11,'epargne','26/11/2017',958000.37,null,.03);
insert into compte values (728246,12,'epargne','26/11/2017',8601.98,null,.03);
insert into compte values (729930,13,'epargne','26/11/2017',7823.09,null,.03);
insert into compte values (728327,14,'epargne','26/11/2017',802223.74,null,.03);
insert into compte values (722892,15,'epargne','26/11/2017',320937,null,.03);
insert into compte values (928263,16,'epargne','26/11/2017',8609483.25,null,.03);

Prompt *************************************************************************************

create table user_roles (
  logincons         varchar(15) not null,
  role_name         varchar(15) not null,
  primary key (logincons, role_name)
);

insert into user_roles values ('psanchez','conseiller');
insert into user_roles values ('pdupond','conseiller'); 
insert into user_roles values ('jfontaine','conseiller');
insert into user_roles values ('rhoareau','conseiller');
insert into user_roles values ('pierre.sanchez','conseiller');

commit;



Prompt FIN DE CREATION DE LA BASE COMMANDE.


Prompt *************************************************************************************                        
