import { Component } from '@angular/core';

@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrl: './sidenav.component.scss'
})
export class SidenavComponent {
  items: string[] = [ 
    'TARJETAS',
    'PRESTAMOS',
    'OPERACIONES',
    'TE_OFRECEMOS',
    'SEGUROS',
    'PUNTOS',
    'AYUDA',
    'CERRAR_SESION' ];
}
