import { Component, OnInit, Input} from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { ClientService} from '../client.service';
import { Client} from '../client';
import { ListeClientsComponent } from '../liste-clients/liste-clients.component';

@Component({
  selector: 'app-modifier-client',
  templateUrl: './modifier-client.component.html',
  styleUrls: ['./modifier-client.component.css']
})
export class ModifierClientComponent implements OnInit {
  
  
  client:Client;
  message:string;
  
  constructor(private route: ActivatedRoute,
    private location: Location,
    private clientService:ClientService) {    
   }

  ngOnInit(): void {
    this.getClient();
   
  }
  
  getClient(): void {
    const idClient = +this.route.snapshot.paramMap.get('idClient');
    this.clientService.getClient(idClient)
    .subscribe(client => this.client = client);
  }

  modifierClient():void{
    //this.clientService.updateClient(this.client);
    this.message ="Le client "+this.client.nomcli+" "+this.client.prenomcli+" a été modifié."
  }
}
