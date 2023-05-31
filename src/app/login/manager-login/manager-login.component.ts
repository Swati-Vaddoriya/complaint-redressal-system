import { Component } from '@angular/core';

@Component({
  selector: 'app-manager-login',
  templateUrl: './manager-login.component.html',
  styleUrls: ['./manager-login.component.css']
})
export class ManagerLoginComponent {
  onClick(myName:any)
  {
    alert("Hello "+myName+" !\n You have successfully logged in to your account. \nPress OK to continue!");
    window.location.href="http://localhost:4200/manager-dashboard"
  }
  signUp()
  {
    window.location.href="http://localhost:4200/managerSignup";
  }
}
