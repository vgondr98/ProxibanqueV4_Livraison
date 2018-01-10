import { Injectable } from '@angular/core';

import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Conseiller } from './conseiller';



@Injectable()
export class ConseillerService {

  constructor( private http: HttpClient) {  }




  getConseillers(): Observable<Conseiller[]> {
    return this.http.get<Conseiller[]>('./assets/data/conseillers.json');
  }

  getConseiller(idConseiller): Observable<Conseiller> {
    return this.http.get<Conseiller>('./assets/data/conseiller.json');
  }

}