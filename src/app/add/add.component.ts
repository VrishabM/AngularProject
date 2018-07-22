import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private ro : Router) { }

  ngOnInit() {
  }
  num1 : number;
  num2 : number;

  Add(a : NgForm){
    this.num1 = a.value.n1;
    this.num2 = a.value.n2;
    alert(this.num1*1 + this.num2*1)
    this.ro.navigate(['']);
  }
}
