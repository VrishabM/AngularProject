import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-mul',
  templateUrl: './mul.component.html',
  styleUrls: ['./mul.component.css']
})
export class MulComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  num1 : number;
  num2 : number;

  Mul(m : NgForm){
    this.num1 = m.value.n1;
    this.num2 = m.value.n2;
    alert(this.num1 * this.num2)
  }
}
