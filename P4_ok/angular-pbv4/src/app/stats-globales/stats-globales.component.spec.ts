import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StatsGlobalesComponent } from './stats-globales.component';

describe('StatsGlobalesComponent', () => {
  let component: StatsGlobalesComponent;
  let fixture: ComponentFixture<StatsGlobalesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StatsGlobalesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StatsGlobalesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
