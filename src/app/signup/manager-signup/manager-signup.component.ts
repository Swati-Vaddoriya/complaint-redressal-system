import { Component } from '@angular/core';

@Component({
  selector: 'app-manager-signup',
  templateUrl: './manager-signup.component.html',
  styleUrls: ['./manager-signup.component.css']
})
export class ManagerSignupComponent {
  onClick(myName:any)
  {
    alert("Hello,"+myName+"! Your response has been successfully sent.\n Click on OK to continue.")

    window.location.href="http://localhost:4200/managerLogin";
  }
}
