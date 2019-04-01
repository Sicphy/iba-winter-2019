import {Component, Input, OnInit} from '@angular/core';
import {StatusCode} from '../../../../models/status-code';
import {ObjectType} from '../../../../models/object-type';

@Component({
  selector: 'app-object-type',
  templateUrl: './object-type.component.html',
  styleUrls: ['./object-type.component.scss']
})
export class ObjectTypeComponent implements OnInit {
  @Input() objectType = new ObjectType();

  constructor() { }

  ngOnInit() {
  }

}
