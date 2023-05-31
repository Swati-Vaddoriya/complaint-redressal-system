import { Component } from '@angular/core';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent {
  contactEvent(myName:any)
  {
    alert("Hello"+myName+", thanks for your valuable feedback. \n We appriciate your valuable time we shall be considering to improve according to the feedback given.\n\n\n\t\t Thanks and regards,\n\t\tTeam-CRS")
  }
}
