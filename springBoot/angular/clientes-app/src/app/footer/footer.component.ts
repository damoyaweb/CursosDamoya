import { style } from "@angular/animations";
import { Component } from "@angular/core";

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['footer.component.css']
})
export class FooterComponent {
  public autor: any = {nombre: 'Diego', apellido: 'Moya'}
}