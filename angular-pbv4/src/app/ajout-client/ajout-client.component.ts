import { Component, OnInit } from '@angular/core';
import {Client} from '../client'
import { ClientService } from '../client.service';

@Component({
  selector: 'app-ajout-client',
  templateUrl: './ajout-client.component.html',
  styleUrls: ['./ajout-client.component.css']
})
export class AjoutClientComponent implements OnInit {

  constructor(private clientService: ClientService) { }

  private message:string;



  model = new Client(-1, "", "", "", "", "", "", "")

  ngOnInit(): void {
  }

  addClient(nomcli,prenomcli, Adresse, codepostal, Ville, Telephone, Email){    
    nomcli = nomcli.trim();
    prenomcli=prenomcli.trim();
    Adresse=Adresse.trim();
    codepostal=codepostal.trim();
    Ville=Ville.trim();
    Telephone=Telephone.trim();
    Email=Email.trim();
   
    this.clientService.addClient({ nomcli, prenomcli, Adresse, codepostal, Ville, Telephone, Email } as Client );
    this.message ="Le client "+nomcli+" "+prenomcli+" a été ajouté."
  }

}

