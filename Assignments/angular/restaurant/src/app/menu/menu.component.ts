import { Component, OnInit } from '@angular/core';
import { MenuService } from '../menu.service';
import { Menu } from '../menuObj';
import { Restaurant } from '../restauranObj';
import { RestaurantService } from '../restaurant.service';
import { UserService } from '../user.service';
import { User } from '../userObj';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {


  constructor(private menuService: MenuService
    ,private userService :UserService
    ,private restaurantService: RestaurantService) { 

  }
  
  menus:Menu[] = [];
  user?:User;
  restaurant?:Restaurant;

  onSelect(menu: Menu){
    console.log(menu);
  }

  getMenu(): void {
    this.menus=this.menuService.getMenu();
  }

  getUser():void{
    this.user=this.userService.getUser();
  }

  getOwnerResturant():void{
    if(this.user?.role!="OWNER")
      return;
    this.restaurant=this.restaurantService.getRestaurantByid(this.user?.id);
    if(this.restaurant.id==0)
      alert("Restaurant is not enlisted please contact admin.");
  }

  add(name: string): void {
    name = name.trim();
    if(!name.length){
      return;
    }
    this.menuService.addMenu(name);
    this.getMenu();
  }

  delete(menu: Menu): void {
    this.menus = this.menus.filter(m => m !== menu);
    this.menuService.deleteMenu(menu.id);
    this.getMenu();
  }

  addToRestaurant(menu: Menu): void {
    let count:number=0;
    this.restaurant?.menuList.forEach(x=>{
      if(x.id===menu.id)
        count++;
    });
    if(count>0){
      return;
    }
    this.restaurantService.addMenu(menu,this.user?.id);
    this.getOwnerResturant();
  }


  remove(menu: Menu): void {
    this.restaurantService.removeMenuById(menu,this.user?.id);
    this.getOwnerResturant();
  }


  ngOnInit(): void {
    this.getMenu();
    this.getUser();
    this.getOwnerResturant();
  }

}
