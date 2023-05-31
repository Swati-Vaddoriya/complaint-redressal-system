import { Component } from '@angular/core';

@Component({
  selector: 'app-engineer-login',
  templateUrl: './engineer-login.component.html',
  styleUrls: ['./engineer-login.component.css']
})
export class EngineerLoginComponent {
  onClick(myName:any)
  {
    alert("Hello "+myName+" ! \nYou have successfully Logged in. \n Click OK to proceed.")
    window.location.href="http://localhost:4200/engineer-dashboard";
  }
  signUp()
  {
    window.location.href="http://localhost:4200/engineerSignup";
  }
}
