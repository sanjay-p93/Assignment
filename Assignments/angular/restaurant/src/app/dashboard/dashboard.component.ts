import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { User } from '../userObj';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  user?:User;
  constructor(private userService :UserService) { }

  ngOnInit(): void {
    this.user=this.userService.getUser();
    console.log(this.user);
  }

}
