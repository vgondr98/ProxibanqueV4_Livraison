import { Component, OnInit } from '@angular/core';
import {ConseillerService} from '../conseiller.service';
import {Conseiller} from '../conseiller'
import{StatsService} from '../stats.service'
import { StatsVir } from '../statsvir';

@Component({
  selector: 'app-liste-conseillers',
  templateUrl: './liste-conseillers.component.html',
  styleUrls: ['./liste-conseillers.component.css']
})
export class ListeConseillersComponent implements OnInit {

  private conseillers:Conseiller[];
  private selectedConseiller:Conseiller;
  private statsConseillerVir:StatsVir;

  constructor(private clientService:ConseillerService,
    private statsService:StatsService) { }

  ngOnInit() {
    this.getConseillers()
  }

  getConseillers(){
    this.clientService.getConseillers().subscribe(conseillers => this.conseillers = conseillers);
  }

  afficherStats(conseiller){
    this.selectedConseiller = conseiller;
    this.getStats(conseiller.idConseiller);   
  }

  getStats(idConseiller){
    this.statsService.getStatsVir(idConseiller).subscribe(statsvir => this.statsConseillerVir = statsvir)
    ;
    
  }

}
