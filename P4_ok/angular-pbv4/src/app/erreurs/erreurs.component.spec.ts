import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ErreursComponent } from './erreurs.component';

describe('ErreursComponent', () => {
  let component: ErreursComponent;
  let fixture: ComponentFixture<ErreursComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ErreursComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ErreursComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
