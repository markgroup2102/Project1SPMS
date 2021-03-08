import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { StarWarsPeopleComponent } from './star-wars-people/star-wars-people.component';
import { StarWarsPeopleService } from './star-wars-people/star-wars-people.service';

@NgModule({
  declarations: [
    AppComponent,
    StarWarsPeopleComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [
    StarWarsPeopleService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
