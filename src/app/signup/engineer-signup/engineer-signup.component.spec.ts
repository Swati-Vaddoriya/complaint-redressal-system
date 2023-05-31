import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EngineerSignupComponent } from './engineer-signup.component';

describe('EngineerSignupComponent', () => {
  let component: EngineerSignupComponent;
  let fixture: ComponentFixture<EngineerSignupComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EngineerSignupComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EngineerSignupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
