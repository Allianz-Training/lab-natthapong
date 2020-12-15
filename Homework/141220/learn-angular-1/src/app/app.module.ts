import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { Lab4Component } from './lab-4/lab4/lab4.component';
import { CountingComponent } from './lab-3/counting/counting.component';
import { HomeComponent } from './homework/homework1/home/home.component';
import { ToDoListComponent } from './homework/homework2/to-do-list/to-do-list.component';
import { ToDoListComponentDeletable } from './homework/homework4/to-do-list/to-do-list.component';

@NgModule({
  declarations: [
    AppComponent,
    Lab4Component,
    CountingComponent,
    HomeComponent,
    ToDoListComponent,
    ToDoListComponentDeletable,
  ],
  imports: [BrowserModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
