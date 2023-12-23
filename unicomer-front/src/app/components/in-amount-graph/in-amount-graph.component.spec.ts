import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InAmountGraphComponent } from './in-amount-graph.component';

describe('InAmountGraphComponent', () => {
  let component: InAmountGraphComponent;
  let fixture: ComponentFixture<InAmountGraphComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [InAmountGraphComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(InAmountGraphComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
