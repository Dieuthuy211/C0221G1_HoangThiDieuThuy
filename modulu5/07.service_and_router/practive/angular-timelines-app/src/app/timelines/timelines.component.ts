import {Component, OnInit} from '@angular/core';
import {DateUtiService} from "../service/date-uti.service";



@Component({
  selector: 'app-timelines',
  templateUrl: './timelines.component.html',
  styleUrls: ['./timelines.component.css']
})
export class TimelinesComponent implements OnInit {

  output = '';

  constructor(private dateUtilService: DateUtiService) {
  }

  ngOnInit() {
  }

  onChange(value) {
    this.output = this.dateUtilService.getDiffToNow(value);
  }


}
