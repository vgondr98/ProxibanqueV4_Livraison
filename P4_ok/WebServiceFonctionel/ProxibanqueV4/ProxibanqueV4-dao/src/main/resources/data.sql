
insert into gerant (idger, loginger, password, prenomger, nomger) values (1,'jchirac','popo','Jacques','Chirac'); 
insert into gerant (idger, loginger, password, prenomger, nomger) values (2,'emacron','pupu','Emmanuel','Macron');
insert into gerant (idger, loginger, password, prenomger, nomger) values (3,'fhollande','papa','Francois','Hollande');

insert into conseiller (idcons,logincons, password, prenomcons, nomcons, idger) values (1,'pdupond','toto','Paul','Dupond',1); 
insert into conseiller (idcons,logincons, password, prenomcons, nomcons, idger) values (2,'jfontaine','tutu','Jean','Fontaine',2);
insert into conseiller (idcons,logincons, password, prenomcons, nomcons, idger) values (3,'rhoareau','titi','Remi','Hoareau',3);
insert into conseiller (idcons,logincons, password, prenomcons, nomcons, idger) values (4,'psanchez','tata','Pierre','Sanchez',3);
insert into conseiller (idcons,logincons, password, prenomcons, nomcons, idger) values (5,'pierre.sanchez','tyty','Pierre','Sanchez',1);

insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(1,'Richard','FOSTER','9 RUE DU LAC',45900,'LA SOURCE','0302345698','r.foster@forbes.com',1);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(2,'Jean-Filipo ','DE LATTRE DE FRANCE','13 AVENUE DES TILLEULS',92310,'SEVRES','0134568934',null,1);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(3,'Paul','PRAT','89 RUE DES CHEVREAUX',33000,'BORDEAUX','0455237806','p.prat@oticien.com',1);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(4,'Lucien','VIGOT','78 RUE EISENBERG',75005,'PARIS','0126597820',null,1);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(5,'Hattmann','BELLEUS','15 RUE DE LA BOHEME',75007,'PARIS','0135678712','h.belleus@gmail.com',1);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(6,'Loriane','EYMANN','13 AVENUE DES TILLEULS',92310,'SEVRES','0134568934',null,4);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(7,'Stanislas','DESORGES','60 RUE DE BIARRITZ',13008,'MARSEILLE','0456788932','desorges@desorges.fr',3);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(8,'John','SMITH','SQUARE DU PETIT MARIN',13008,'MARSEILLE','0356999013','jsmith@hotmail.fr',4);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(9,'Albert','MOUNIER','126 RUE DES MARINS',29000,'BREST','0302345698','a.mounier@hsbc.com',1);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(10,'Paul','MOULIN','13 AVENUE DES TILLEULS',94000,'CRETEIL','0134568934',null,2);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(11,'Paul','PRAT','89 RUE DES CHEVREAUX',33000,'BORDEAUX','0455237806','p.prat@oticien.com',2);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(12,'Lucien','VIGOT','78 RUE EISENBERG',75005,'PARIS','0126597820',null,4);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(13,'Hattmann','BELLEUS','15 RUE DE LA BOHEME',75007,'PARIS','0135678712','h.belleus@gmail.com',5);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(14,'Loriane','EYMANN','13 AVENUE DES TILLEULS',92310,'SEVRES','0134568934',null,4);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(15,'Stanislas','DESORGES','60 RUE DE BIARRITZ',13008,'MARSEILLE','0456788932','desorges@desorges.fr',3);
insert into client (idcli,prenomcli,nomcli, Adresse, codepostal, Ville, Telephone, Email, idcons) values(16,'John','SMITH','SQUARE DU PETIT MARIN',13008,'MARSEILLE','0356999013','jsmith@hotmail.fr',4);

commit;