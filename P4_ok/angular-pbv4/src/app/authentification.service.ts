import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

import { Client } from './client';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable()
export class AuthService {
  
 

  constructor( ) {  }

  identifier(login:String, motdepasse:string): Boolean {
      if(login==="pdupond" && motdepasse==="toto"){
          return true;
      }
      else{
          return false;
      }
   
  }




  
}