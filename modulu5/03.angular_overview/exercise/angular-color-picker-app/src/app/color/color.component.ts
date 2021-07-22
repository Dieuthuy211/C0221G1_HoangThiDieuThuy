import {Component, OnInit} from '@angular/core';
@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.css']
})
export class ColorComponent implements OnInit {
  color = 'black'

  constructor() {
  }

  ngOnInit(): void {
  }

  colorP(action: string): void {
    switch (action) {
      case 'red' :
        this.color = 'red';
        break;
      case 'green' :
        this.color = 'green';
        break;
      case 'yellow' :
        this.color = 'yellow';
        break;
      case 'magenta' :
        this.color = 'magenta';
        break;
      case 'blue' :
        this.color = 'blue';
        break;
      case 'brown' :
        this.color = 'brown';
        break;
      case 'tan' :
        this.color = 'tan';
        break;

    }
  }
}
