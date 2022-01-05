import { Component } from '@angular/core';

@Component({
  selector: 'app-directiva',
  templateUrl: './directiva.component.html'
})
export class DirectivaComponent {

  listaCurso: string [] = ['JavaScript','Jaca','CSS','PHP','Python','C#','Java SE']
  habilitar: boolean = true
  constructor() { }
  setHabilitar(): void{
    this.habilitar = (this.habilitar == true)? false: true
  }

}
