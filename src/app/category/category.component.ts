import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AlertPromise } from 'selenium-webdriver';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {
  n : String;
  constructor(private router : ActivatedRoute,private rou : Router) {
    this.n = router.snapshot.params['id'];
   }

  ngOnInit() {
    alert(this.n);
    this.rou.navigate(['']);
  }

}
