import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ComplaintsComponent } from './complaints/complaints.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { CustomersComponent } from './customers/customers.component';
import { EngineersComponent } from './engineers/engineers.component';
import { HomeComponent } from './home/home.component';
import { ComplaintComponent } from './login/customer-login/complaint/complaint.component';
import { FeedbackComponent } from './login/customer-login/complaint/feedback/feedback.component';
import { RaiseComponent } from './login/customer-login/complaint/raise/raise.component';
import { TrackComponent } from './login/customer-login/complaint/track/track.component';
import { ViewComponent } from './login/customer-login/complaint/view/view.component';
import { CustomerLoginComponent } from './login/customer-login/customer-login.component';
import { EngineerDashboardComponent } from './login/engineer-login/engineer-dashboard/engineer-dashboard.component';
import { EngineerLoginComponent } from './login/engineer-login/engineer-login.component';
import { LoginComponent } from './login/login.component';
import { ManagerDashboardComponent } from './login/manager-login/manager-dashboard/manager-dashboard.component';
import { ManagerLoginComponent } from './login/manager-login/manager-login.component';
import { ManagersComponent } from './managers/managers.component';
import { CustomerSignupComponent } from './signup/customer-signup/customer-signup.component';
import { EngineerSignupComponent } from './signup/engineer-signup/engineer-signup.component';
import { ManagerSignupComponent } from './signup/manager-signup/manager-signup.component';
import { SignupComponent } from './signup/signup.component';
import { UsersComponent } from './users/users.component';
import { CodeMindComponent } from './codemind/code-mind.component';

const routes: Routes = [
{
  path:'home',
  component:HomeComponent
},
{
  path:'login',
  component:LoginComponent
},
{
  path:'customerLogin',
  component:CustomerLoginComponent
},
{
  path:'contactUs',
  component:ContactUsComponent
},
{
  path:'managerLogin',
  component:ManagerLoginComponent
},
{
  path:'manager-dashboard',
  component:ManagerDashboardComponent
},
{
  path:'engineerLogin',
  component:EngineerLoginComponent
},
{
  path:'engineer-dashboard',
  component:EngineerDashboardComponent
},
{
  path:'complaint',
  component:ComplaintComponent
},
{
  path:'raise',
  component:RaiseComponent
},
{
  path:'view',
  component:ViewComponent
},
{
  path:'track',
  component:TrackComponent
},
{
  path:'feedback',
  component:FeedbackComponent
},
{
  path:'signup',
  component:SignupComponent
},
{
  path:'customerSignup',
  component:CustomerSignupComponent
},
{
  path:'managerSignup',
  component:ManagerSignupComponent
},
{
  path:'engineerSignup',
  component:EngineerSignupComponent
},
{
  path:'complaints',
  component:ComplaintsComponent
},
{
  path:'users',
  component:UsersComponent
},
{
  path:'engineers',
  component:EngineersComponent
},
{
  path:'managers',
  component:ManagersComponent
},
{
  path:'codemind',
  component:CodeMindComponent
},
{
  path:'customers',
  component:CustomersComponent
},
{
  path:'**', //For any website it will redirect to Homepage.
  component:HomeComponent
},
{
  path:'',
  component:HomeComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
