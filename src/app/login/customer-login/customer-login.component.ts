import { Component } from '@angular/core';

@Component({
  selector: 'app-customer-login',
  templateUrl: './customer-login.component.html',
  styleUrls: ['./customer-login.component.css']
})
export class CustomerLoginComponent {
  onClick()
  {
    window.location.href="http://localhost:4200/complaint";
  }
  signUp()
  {
    window.location.href="http://localhost:4200/customerSignup";
  }
}
