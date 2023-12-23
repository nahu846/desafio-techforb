import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private urlApiLogin = 'http://localhost:9000/api/users/login'
  private urlApiRegister = 'http://localhost:9000/api/users/register'

  constructor(private http: HttpClient) { }

  public login(user: any): Observable<any> {
    console.log(user);
    return this.http.post(this.urlApiLogin, user);
  }

  public register(user: any): Observable<any> {
    console.log(user);
    return this.http.post(this.urlApiRegister, user);
  }
}
