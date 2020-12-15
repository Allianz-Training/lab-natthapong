import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-to-do-list-deleteable',
  templateUrl: './to-do-list.component.html',
  styleUrls: ['./to-do-list.component.css'],
})
export class ToDoListComponentDeletable implements OnInit {
  toDoList = ['Coffee', 'Breakfast'];
  item: string = '';
  constructor() {}

  ngOnInit(): void {}

  add(item: string) {
    console.log(this.item);

    if (this.item !== '') {
      this.toDoList.push(item);
      this.item = '';
    }
  }
  delete(item: string) {
    this.toDoList.splice(this.toDoList.indexOf(item), 1);
  }
}
