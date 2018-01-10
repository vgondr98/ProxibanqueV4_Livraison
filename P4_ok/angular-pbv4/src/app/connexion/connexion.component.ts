import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../authentification.service';

@Component({
  selector: 'app-connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.css']
})
export class ConnexionComponent implements OnInit {
  model: any = {};
  loading = false;
  error = '';
  
  constructor(
    private router: Router, private authService: AuthService) { }

  login() {
    var result =this.authService.identifier(this.model.username,this.model.password)
           if (result === true) {
               this.router.navigate(['conseiller/listeclients']);
           } else {
               this.error = 'Username or password is incorrect';
               this.loading = false;
           }
}
  
  ngOnInit() {
  }

}