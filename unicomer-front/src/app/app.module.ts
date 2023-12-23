import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './pages/login/login.component';
import { HomeComponent } from './pages/home/home.component';
import { InputFormComponent } from './components/input-form/input-form.component';
import { ButtonFormComponent } from './components/button-form/button-form.component';
import { InAmountGraphComponent } from './components/in-amount-graph/in-amount-graph.component';
import { RegisterFormComponent } from './components/register-form/register-form.component';
import { RegisterComponent } from './pages/register/register.component';
import { FormsModule } from '@angular/forms';
import { SidenavComponent } from './components/sidenav/sidenav.component';
import { NgxEchartsModule } from 'ngx-echarts';
import { EchartsxModule } from 'echarts-for-angular';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    InputFormComponent,
    ButtonFormComponent,
    InAmountGraphComponent,
    RegisterFormComponent,
    RegisterComponent,
    SidenavComponent  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgxEchartsModule.forRoot({
      echarts: () => import('echarts')
    }),
    EchartsxModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
