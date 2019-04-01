import { Pipe, PipeTransform } from '@angular/core';
import {StatusCode} from '../models/status-code';

@Pipe({
  name: 'objectTypeName'
})
export class Sample1Pipe implements PipeTransform {

  transform(value: StatusCode): string {
    value.objectTypeName = value.objectType.name;
    return value.objectTypeName;
  }
}
