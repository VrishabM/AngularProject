import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AlertPromise } from 'selenium-webdriver';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  id = String;
  pas = String;
  Login(l : NgForm){
    this.id=l.value.inputEmail;
    this.pas=l.value.inputPassword;
    alert("UserName : "+this.id+"\nPassword   : "+this.pas);
  }


}
