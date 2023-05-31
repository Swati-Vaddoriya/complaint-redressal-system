import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer_Details } from './ModelEntity/Customer_Details';

@Injectable({
  providedIn: 'root'
})
export class CustomerDetailsService {

// Fetch the data from RestAPI
  baseUrl:string="http://localhost:8080/customer";

// Connect with client module
constructor(private http: HttpClient) { }

// Crud Operations here...
getAllCustomers():Observable<Customer_Details[]>{
  console.log("before api call");
  return this.http.get<Customer_Details[]>(this.baseUrl);
}

}
