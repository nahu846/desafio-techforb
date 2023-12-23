import { Component, OnInit, TemplateRef, ViewChild } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { FormBuilder } from '@angular/forms';
import { Router } from "@angular/router";
import { ApiService } from '../../services/api.service';
import { InputFormComponent } from '../../components/input-form/input-form.component';




@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {

  private urlApi = 'localhost:9000/api/users/login'

  @ViewChild('secret') secret!: InputFormComponent;
  @ViewChild('dni') dni!: InputFormComponent;
  @ViewChild('dnitype') dnitype!: InputFormComponent;

  constructor(private apiService: ApiService, public router: Router) { }
  
  login() {
    this.secret.value
    if (this.secret && this.dni && this.dnitype) {
      const user = { dni: this.dni.value, secret: this.secret.value };
      this.apiService.login(user).subscribe(
        response => {
          console.log('API response:', response);
          this.goToHome(response)
        },
        error => {
          console.log(error);
        }
      );
    }
  }

  goToHome(response: boolean) {
    if (response) {
      this.router.navigate(['home']);
    }
  }
  



}


