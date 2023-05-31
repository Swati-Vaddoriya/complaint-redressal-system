import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CodeMindComponent } from './code-mind.component';

describe('CodeMindComponent', () => {
  let component: CodeMindComponent;
  let fixture: ComponentFixture<CodeMindComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CodeMindComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CodeMindComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
