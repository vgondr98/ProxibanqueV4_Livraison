import {Client} from './client';


export class Compte {
    numcompte: number;
    idcli: string;
    TYPE_COMPTE:string;
    dateouv: string;
    solde:number;
    decouvert:number;
    tauxrem:number;
    client?:Client;
}