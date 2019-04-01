import {ObjectType} from './object-type';

export class StatusCode {
  id: number;
  code: string;
  description: string;
  objectType: ObjectType;
  objectTypeName: string;
  issueGrouping: boolean;
  createIncidents: boolean;
  status: string;
  constructor() {
    this.id =  0;
    this.code = '';
    this.description = '';
    this.objectType = new ObjectType();
    this.objectTypeName = '';
    this.issueGrouping = false;
    this.createIncidents = false;
    this.status = '';
  }
}

