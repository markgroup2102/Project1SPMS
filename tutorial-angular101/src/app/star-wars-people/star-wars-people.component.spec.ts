import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StarWarsPeopleComponent } from './star-wars-people.component';

describe('StarWarsPeopleComponent', () => {
  let component: StarWarsPeopleComponent;
  let fixture: ComponentFixture<StarWarsPeopleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StarWarsPeopleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StarWarsPeopleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
