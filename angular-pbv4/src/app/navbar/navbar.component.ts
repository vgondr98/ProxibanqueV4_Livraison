import { Component, OnInit } from '@angular/core';
import {Conseiller} from '../conseiller';
import { ConseillerService } from '../conseiller.service';
@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {


  
  private conseiller:Conseiller;
  

  getConseiller(){
    //this.conseiller = this.conseillerService.getConseiller(1).subscribe(conseiller => this.conseiller = conseiller);
    this.conseiller={"logincons":"pdupond","password"  :"toto","prenomcons"  :"Paul","nomcons"  :"Dupond","loginger"  :"jchirac"}
  }

  ngOnInit() {
    this.getConseiller();
  }
  constructor(private conseillerService:ConseillerService) { }

}
