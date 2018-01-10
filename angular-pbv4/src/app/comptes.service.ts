import { Injectable } from '@angular/core';

import { Conseiller } from './conseiller';
import { Compte } from './compte';


import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class CompteService {
  
  constructor( private http: HttpClient) {  }


  getComptes (): Observable<Compte[]> {
    return this.http.get<Compte[]>('./assets/data/comptes.json');
  }

    

  getComptesConseiller(){
      return this.http.get<Compte[]>('./assets/data/comptesdupond.json');  
  }  

  getComptesClient(idClient){
    if(idClient==1){
      return this.http.get<Compte[]>('./assets/data/comptesdupond1.json'); 
    }

    if(idClient==9){
      return this.http.get<Compte[]>('./assets/data/comptesdupond9.json'); 
    }

  }
  faireVirement(comptedebit, comptecredit, montant){
    

  }
  
}