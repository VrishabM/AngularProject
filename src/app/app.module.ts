import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'; 
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { AddComponent } from './add/add.component';
import { MulComponent } from './mul/mul.component';
import { LoginComponent } from './login/login.component';
import { CategoryComponent } from './category/category.component';
import { SignupComponent } from './signup/signup.component';

@NgModule({
  declarations: [
    AppComponent,
    AddComponent,
    MulComponent,
    LoginComponent,
    CategoryComponent,
    SignupComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      {path:'add',component:AddComponent},
      {path:'mul',component:MulComponent},
      {path:'login',component:LoginComponent},
      {path:'cat/:id',component:CategoryComponent},
      {path:'sign',component:SignupComponent}
    ])    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
