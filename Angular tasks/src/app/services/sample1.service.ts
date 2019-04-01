import { Injectable } from '@angular/core';
import {STATUS_CODES} from '../mocks/status-codes-mock';


@Injectable({
  providedIn: 'root'
})
export class Sample1Service {

  constructor() {
  }
  getMock() {
    return STATUS_CODES;
  }
}
