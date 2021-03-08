import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StarWarsPeopleService {

  constructor(private http: HttpClient) { }

  getStarWarsPeople() {
    return this.http.get('https://swapi.dev/api/people/?format=json');
 }
}
