import { Component } from '@angular/core';

@Component({
  selector: 'app-raise',
  templateUrl: './raise.component.html',
  styleUrls: ['./raise.component.css']
})
export class RaiseComponent {
  raiseEvent(myName:any)
  {
    alert("Hello,"+myName+"!You Raised The Complaint\n Your response has been successfully sent. Click on OK to continue.")
  }
}
