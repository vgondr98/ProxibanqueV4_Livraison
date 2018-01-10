import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

import { Client } from './client';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable()
export class ClientService {
  
  listeclients:Client[];
  urllisteConseiller ='assets/data/clientsdupond.json';

  constructor( private http: HttpClient) {  }

  getClientConseiller(): Observable<Client[]> {
    return this.http.get<Client[]>('assets/data/clientsdupond.json');
  }


  getAllClients(): Observable<Client[]> {    
    return this.http.get<Client[]>('assets/data/clients.json');
  }

  getClient(idClient: number): Observable<Client> {
    return this.http.get<Client>('assets/data/clientform.json');
  }

  updateClient (client:Client): Observable<any> {
    return this.http.put(this.urllisteConseiller, client, httpOptions);
  }

  addClient (client:Client): Observable<Client> {
    return this.http.post<Client>(this.urllisteConseiller, client, httpOptions);
  }
}