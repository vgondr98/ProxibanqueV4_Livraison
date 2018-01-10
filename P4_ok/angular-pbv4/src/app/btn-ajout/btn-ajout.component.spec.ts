import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BtnAjoutComponent } from './btn-ajout.component';

describe('BtnAjoutComponent', () => {
  let component: BtnAjoutComponent;
  let fixture: ComponentFixture<BtnAjoutComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BtnAjoutComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BtnAjoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
