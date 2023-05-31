import { Component } from '@angular/core';

@Component({
  selector: 'app-complaint',
  templateUrl: './complaint.component.html',
  styleUrls: ['./complaint.component.css']
})
export class ComplaintComponent {

  onRaise()
  {
    window.location.href="http://localhost:4200/raise";
  }

  viewComplaint()
  {
    window.location.href="http://localhost:4200/view";
  }

  trackComplaint()
  {
    window.location.href="http://localhost:4200/track";
  }

  yourFeedaback()
  {
    window.location.href="http://localhost:4200/feedback";
  }
}
