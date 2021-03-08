import { Component, OnInit } from '@angular/core';
import { StarWarsPeopleService } from './star-wars-people.service';

@Component({
  selector: 'app-star-wars-people',
  templateUrl: './star-wars-people.component.html',
  styleUrls: ['./star-wars-people.component.css']
})
export class StarWarsPeopleComponent implements OnInit {

  people: any = [];

  constructor(private service: StarWarsPeopleService) {

  }

  ngOnInit() {
    this.service.getStarWarsPeople().subscribe((data: any) => {
        const results = data.results;
        for (const person of results) {
            this.people.push(person);
        }
    });
  }

}
