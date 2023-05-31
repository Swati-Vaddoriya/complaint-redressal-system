import { Component } from '@angular/core';

@Component({
  selector: 'app-customer-signup',
  templateUrl: './customer-signup.component.html',
  styleUrls: ['./customer-signup.component.css']
})
export class CustomerSignupComponent {
  onClick(myName:any)
  {
    alert("Hello,"+myName+"! Your response has been successfully sent.\n Click on OK to continue.")
    window.location.href="http://localhost:4200/customerLogin";
  }
}
