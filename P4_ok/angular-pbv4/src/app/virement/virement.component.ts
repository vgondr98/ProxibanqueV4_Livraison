import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';


import {Client} from '../client';
import{Compte} from '../compte';
import {CompteService} from '../comptes.service';


@Component({
  selector: 'app-virement',
  templateUrl: './virement.component.html',
  styleUrls: ['./virement.component.css']
})
export class VirementComponent implements OnInit {

 
  comptedebit:Compte;
  comptescredit:Compte[];
  montant:number;
  message:string;
  
  listeCptDebit:Compte[];
  listeCptCredit:Compte[];

  formvirement: FormGroup;


  constructor(private fb: FormBuilder, private compteservice:CompteService) {
  
   }

getComptesDebit(){
  this.compteservice.getComptesConseiller().subscribe(comptes => this.listeCptDebit = comptes);
}

faireVirement(comptedebit, comptecredit, montant){
  this.message="Virement Effectué"
  this.compteservice.faireVirement(comptedebit, comptecredit, montant);

}

getComptesCredit(){
  this.compteservice.getComptes().subscribe(comptes => this.listeCptCredit = comptes);

}







  ngOnInit() {
    this.getComptesDebit();
    this.getComptesCredit();

    this.formvirement = new FormGroup({
      comptedebit: new FormControl(),
      comptecredit:new FormControl(),
      montant:new FormControl()

    })
  }



}
