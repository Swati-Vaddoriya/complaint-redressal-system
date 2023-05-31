import { Component } from '@angular/core';
import { CustomerDetailsService } from '../customer-details.service';
import { Customer_Details } from '../ModelEntity/Customer_Details';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent{

  details ?: Customer_Details[];

  constructor(private service: CustomerDetailsService){}
   ngOnInit()
  {
    this.service.getAllCustomers().subscribe(x=>this.details=x)
  }
}
