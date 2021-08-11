import { Injectable } from '@angular/core';
import { User } from './userObj';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  user:User={id:1,role:"ADMIN"};

  constructor() { }

  getUser():User{
    return this.user;
  }

  setUser(user:string){
    this.user={id:1,role:user};;
  }
  
}
