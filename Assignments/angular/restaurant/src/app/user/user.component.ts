import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RestaurantService } from '../restaurant.service';
import { UserService } from '../user.service';
import { User } from '../userObj';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private restaurantService: RestaurantService,private userService :UserService, private router: Router  ) { }

  login(user:string){
    this.userService.setUser(user);
    this.router.navigate(['/dashboard'])
  }

  ngOnInit(): void {
  }

}
