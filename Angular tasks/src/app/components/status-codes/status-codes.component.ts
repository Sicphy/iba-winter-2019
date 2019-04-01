import { Component, OnInit } from '@angular/core';
import {Sample1Service} from '../../services/sample1.service';
import {StatusCode} from '../../models/status-code';

@Component({
  selector: 'app-status-codes',
  templateUrl: './status-codes.component.html',
  styleUrls: ['./status-codes.component.scss']
})
export class StatusCodesComponent implements OnInit {
  statusCodes: StatusCode[];
  childStatusCode = new StatusCode();

  constructor(private sampleService: Sample1Service) { }
  filter = '';
  description = '';

  onChanged(descr: string) {
    this.description = descr;
  }

  ngOnInit() {
    this.statusCodes = this.sampleService.getMock();
    console.log(this.statusCodes);
  }
  sampleClick(sc: StatusCode) {
    this.childStatusCode = sc;
  }
}
