import { NgModule } from '@angular/core';

import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'; //for backend connectivity

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { CustomerLoginComponent } from './login/customer-login/customer-login.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { ManagerLoginComponent } from './login/manager-login/manager-login.component';
import { EngineerLoginComponent } from './login/engineer-login/engineer-login.component';
import { ComplaintComponent } from './login/customer-login/complaint/complaint.component';
import { ViewComponent } from './login/customer-login/complaint/view/view.component';
import { RaiseComponent } from './login/customer-login/complaint/raise/raise.component';
import { TrackComponent } from './login/customer-login/complaint/track/track.component';
import { FeedbackComponent } from './login/customer-login/complaint/feedback/feedback.component';
import { SignupComponent } from './signup/signup.component';
import { CustomerSignupComponent } from './signup/customer-signup/customer-signup.component';
import { EngineerSignupComponent } from './signup/engineer-signup/engineer-signup.component';
import { ManagerSignupComponent } from './signup/manager-signup/manager-signup.component';
import { EngineerDashboardComponent } from './login/engineer-login/engineer-dashboard/engineer-dashboard.component';
import { ManagerDashboardComponent } from './login/manager-login/manager-dashboard/manager-dashboard.component';
import { UsersComponent } from './users/users.component';
import { EngineersComponent } from './engineers/engineers.component';
import { ManagersComponent } from './managers/managers.component';
import { ComplaintsComponent } from './complaints/complaints.component';
import { CodeMindComponent } from './codemind/code-mind.component';
import { CustomersComponent } from './customers/customers.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    CustomerLoginComponent,
    ContactUsComponent,
    ManagerLoginComponent,
    EngineerLoginComponent,
    ComplaintComponent,
    ViewComponent,
    RaiseComponent,
    TrackComponent,
    FeedbackComponent,
    SignupComponent,
    CustomerSignupComponent,
    EngineerSignupComponent,
    ManagerSignupComponent,
    EngineerDashboardComponent,
    ManagerDashboardComponent,
    UsersComponent,
    EngineersComponent,
    ManagersComponent,
    ComplaintsComponent,
    CodeMindComponent,
    CustomersComponent
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule //for backend connectivity
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
