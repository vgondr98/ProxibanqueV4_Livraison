import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-erreurs',
  templateUrl: './erreurs.component.html',
  styleUrls: ['./erreurs.component.css']
})
export class ErreursComponent implements OnInit {

  constructor() { }
  private message:string
  ngOnInit() {
    this.message="Une erreur est survenue, vous allez être redirigé"
  }


  erreurConnexion(){
    this.message="Les informations fournies n'ont pas permis de vous authentifier"
  }
}
