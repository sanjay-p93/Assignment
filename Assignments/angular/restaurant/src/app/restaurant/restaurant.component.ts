import { Component, OnInit } from '@angular/core';
import { Restaurant } from '../restauranObj';
import { RestaurantService } from '../restaurant.service';
import { UserService } from '../user.service';
import { User } from '../userObj';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent implements OnInit {

  constructor(private restaurantService: RestaurantService,private userService :UserService) { }

  restaurants:Restaurant[] = [];
  user?:User;

  onSelect(restaurant: Restaurant){
    console.log(restaurant);
  }

  getRestaurants(): void {
    this.restaurants=this.restaurantService.getRestaurants();
  }
  

  getUser():void{
    this.user=this.userService.getUser();
  }

  add(name: string): void {
    name = name.trim();
    if(!name.length){
      return;
    }
    this.restaurantService.addRestaurant(name);
    this.getRestaurants();
  }

  delete(hero: Restaurant): void {
    this.restaurants = this.restaurants.filter(h => h !== hero);
    this.restaurantService.deleteRestaurants(hero.id);
    this.getRestaurants();
  }
  ngOnInit(): void {
    this.getRestaurants();
    this.getUser();
  }

}
