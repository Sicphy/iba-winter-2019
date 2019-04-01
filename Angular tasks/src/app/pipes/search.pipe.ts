import { Pipe, PipeTransform } from '@angular/core';
import {StatusCode} from '../models/status-code';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  transform(value: StatusCode[], filter): any {
    return value.filter((statusCode) => statusCode.code.startsWith(filter));
  }

}
