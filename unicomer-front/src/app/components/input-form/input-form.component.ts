import { Component, Input, OnInit } from '@angular/core';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-input-form',
  templateUrl: './input-form.component.html',
  styleUrl: './input-form.component.scss'
})
export class InputFormComponent{

  @Input() title: string = "";
  @Input() placeholder: string = "";
  @Input() type: string = "text";

  public value: string = '';

  constructor(private apiService: ApiService) { }


}
