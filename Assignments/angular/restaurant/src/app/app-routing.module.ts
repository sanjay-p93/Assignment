import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { RestaurantComponent } from './restaurant/restaurant.component';
import { UserComponent } from './user/user.component';
import { MenuComponent } from './menu/menu.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ResturantMenuComponent } from './resturant-menu/resturant-menu.component';
import { SuccessComponent } from './success/success.component';

const routes: Routes = [
  { path: '', redirectTo: '/user', pathMatch: 'full' },
  { path: 'user', component: UserComponent },
  { path: 'menu', component: MenuComponent },
  { path: 'restaurant', component: RestaurantComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'restaurantmenu/:id', component: ResturantMenuComponent },
  { path: 'success', component: SuccessComponent },
  { path: '**', redirectTo: '/user', pathMatch: 'full' }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
