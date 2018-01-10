import {Client} from './client';
import {Conseiller} from './conseiller';
import{Compte} from './compte';

export class Virement {
    idVirement: number;
    compteDebit: Compte;
    compteCredit: Compte;
   montant:number;
   data:string;
   conseiller:Conseiller;
}