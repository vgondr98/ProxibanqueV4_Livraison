import { Injectable } from '@angular/core';

import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';

import { Conseiller } from './conseiller';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { StatsVir } from './statsvir';

@Injectable()
export class StatsService {

  constructor( private http: HttpClient) {  }

  getStatsVir(idConseiller): Observable<StatsVir> {    
    return this.http.get<StatsVir>('./assets/data/statsvir.json');
  }

}