import { Component } from '@angular/core';

@Component({
  selector: 'app-contact-us',
  templateUrl: './contact-us.component.html',
  styleUrls: ['./contact-us.component.css']
})
export class ContactUsComponent {
  contactEvent(myName:any)
  {
    alert("Hello,"+myName+"! \nYour response has been successfully sent. Click on OK to continue.");
    window.location.href="http://localhost:4200/home";
  }
}
