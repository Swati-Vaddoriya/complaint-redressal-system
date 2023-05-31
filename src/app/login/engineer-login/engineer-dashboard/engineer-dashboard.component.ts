import { Component } from '@angular/core';

@Component({
  selector: 'app-engineer-dashboard',
  templateUrl: './engineer-dashboard.component.html',
  styleUrls: ['./engineer-dashboard.component.css']
})
export class EngineerDashboardComponent {
  viewUsers()
  {
    window.location.href="http://localhost:4200/users";
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
