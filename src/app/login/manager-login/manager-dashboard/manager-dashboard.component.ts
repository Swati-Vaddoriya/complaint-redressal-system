import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-manager-dashboard',
  templateUrl: './manager-dashboard.component.html',
  styleUrls: ['./manager-dashboard.component.css']
})
export class ManagerDashboardComponent {
  constructor(private http: HttpClient) {}
  viewUsers()
  {
    window.location.href="http://localhost:4200/customers";
  }

  viewComplaints()
  {
    window.location.href="http://localhost:4200/complaints";
  }

  viewEngineers()
  {
    window.location.href="http://localhost:4200/engineers";
  }

  viewManagers()
  {
    window.location.href="http://localhost:4200/managers";
  }

}
