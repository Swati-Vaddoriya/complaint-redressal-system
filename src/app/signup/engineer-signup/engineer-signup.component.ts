import { Component } from '@angular/core';

@Component({
  selector: 'app-engineer-signup',
  templateUrl: './engineer-signup.component.html',
  styleUrls: ['./engineer-signup.component.css']
})
export class EngineerSignupComponent {
  onClick(myName:any)
  {
    alert("Hello,"+myName+"! Your response has been successfully sent. \nClick on OK to continue.")

    window.location.href="http://localhost:4200/engineerLogin";
  }
}
