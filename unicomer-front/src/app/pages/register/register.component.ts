import { Component, ViewChild } from '@angular/core';
import { InputFormComponent } from '../../components/input-form/input-form.component';
import { ApiService } from '../../services/api.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {

  @ViewChild('usuario') usuario!: InputFormComponent;
  @ViewChild('secret') secret!: InputFormComponent;
  @ViewChild('dni') dni!: InputFormComponent;
  @ViewChild('dnitype') dnitype!: InputFormComponent;

  constructor(private apiService: ApiService, public router: Router) { }
  
  register() {
    this.secret.value
    if (this.usuario && this.secret && this.dni && this.dnitype) {
      const user = { usuario: this.usuario, dni: this.dni.value, secret: this.secret.value, dnitype: this.dnitype };
      this.apiService.register(user).subscribe(
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
