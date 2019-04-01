import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {StatusCode} from '../../../models/status-code';
import { Input} from '@angular/core';

@Component({
  selector: 'app-status-code',
  templateUrl: './status-code.component.html',
  styleUrls: ['./status-code.component.scss']
})
export class StatusCodeComponent implements OnInit {
  @Input() statusCode = new StatusCode();
  @Output() onChanged = new EventEmitter<string>();
  color = 'blue';
  onDescription(descr: string) {
    console.log(descr);
    this.onChanged.emit(descr);
  }
  constructor() { }

  ngOnInit() {
  }

}
