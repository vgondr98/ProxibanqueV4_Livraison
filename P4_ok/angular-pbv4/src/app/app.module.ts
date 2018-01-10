import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { AppRoutingModule } from './/app-routing.module';

import { ConnexionComponent } from './connexion/connexion.component';
import { DeconnexionComponent } from './deconnexion/deconnexion.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ListeClientsComponent } from './liste-clients/liste-clients.component';
import { ListeConseillersComponent } from './liste-conseillers/liste-conseillers.component';
import { AjoutClientComponent } from './ajout-client/ajout-client.component';
import { ComptesComponent } from './comptes/comptes.component';
import { VirementComponent } from './virement/virement.component';
import { BtnAjoutComponent } from './btn-ajout/btn-ajout.component';
import { ModifierClientComponent } from './modifier-client/modifier-client.component';
import { StatsConseillerComponent } from './stats-conseiller/stats-conseiller.component';
import { StatsGlobalesComponent } from './stats-globales/stats-globales.component';
import { ClientService} from './client.service';
import { ConseillerService } from './conseiller.service';
import { StatsService } from './stats.service';
import { CompteService } from './comptes.service';
import { HttpClientModule }    from '@angular/common/http';
import { FormsModule }   from '@angular/forms';
import { ErreursComponent } from './erreurs/erreurs.component';
import { AuthService } from './authentification.service';





@NgModule({
  declarations: [
    AppComponent,
    ConnexionComponent,
    DeconnexionComponent,
    NavbarComponent,
    ListeClientsComponent,
    ListeConseillersComponent,
    AjoutClientComponent,
    ComptesComponent,
    VirementComponent,
    BtnAjoutComponent,
    ModifierClientComponent,
    StatsConseillerComponent,
    StatsGlobalesComponent,
    ErreursComponent
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [
    ClientService,
    ConseillerService,
    StatsService,
    CompteService,
    AuthService
],
  bootstrap: [AppComponent]
})
export class AppModule { }
