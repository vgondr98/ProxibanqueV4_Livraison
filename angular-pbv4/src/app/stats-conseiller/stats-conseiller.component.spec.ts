import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StatsConseillerComponent } from './stats-conseiller.component';

describe('StatsConseillerComponent', () => {
  let component: StatsConseillerComponent;
  let fixture: ComponentFixture<StatsConseillerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StatsConseillerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StatsConseillerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
