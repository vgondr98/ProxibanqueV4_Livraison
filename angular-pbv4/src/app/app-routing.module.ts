import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
 
import { ListeClientsComponent }   from './liste-clients/liste-clients.component';
import{ConnexionComponent} from './connexion/connexion.component';
import{DeconnexionComponent} from './deconnexion/deconnexion.component';
import {ModifierClientComponent} from './modifier-client/modifier-client.component';
import { AjoutClientComponent } from './ajout-client/ajout-client.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ListeConseillersComponent } from './liste-conseillers/liste-conseillers.component';
import {VirementComponent} from './virement/virement.component'
import { ErreursComponent } from './erreurs/erreurs.component';

const routes: Routes = [
  { path: 'conseiller/listeclients', component: ListeClientsComponent },
  { path: '', component: ConnexionComponent },
  { path: 'deconnexion', component: DeconnexionComponent },
  { path: 'conseiller/Modifierclient/:idClient', component: ModifierClientComponent },
  { path: 'conseiller/AjouterClient', component: AjoutClientComponent },
  { path: 'gerant/listeconseillers', component: ListeConseillersComponent },
  { path: 'conseiller/Virement', component: VirementComponent },
  { path: 'erreur', component: ErreursComponent }



];
 
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}