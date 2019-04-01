import { TestBed } from '@angular/core/testing';

import { Sample1Service } from './sample1.service';

describe('Sample1Service', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: Sample1Service = TestBed.get(Sample1Service);
    expect(service).toBeTruthy();
  });
});
