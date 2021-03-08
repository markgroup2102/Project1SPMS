import { TestBed } from '@angular/core/testing';

import { StarWarsPeopleService } from './star-wars-people.service';

describe('StarWarsPeopleService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StarWarsPeopleService = TestBed.get(StarWarsPeopleService);
    expect(service).toBeTruthy();
  });
});
