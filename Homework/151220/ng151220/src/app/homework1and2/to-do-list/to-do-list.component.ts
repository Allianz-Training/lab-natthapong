import { Component, OnInit, Input } from '@angular/core';
import { Task } from '../task';

@Component({
  selector: 'app-to-do-list',
  templateUrl: './to-do-list.component.html',
  styleUrls: ['./to-do-list.component.css'],
})
export class ToDoListComponent implements OnInit {
  @Input()
  name: string = '';
  description: string = '';
  taskList: Task[];
  nextId: number = 3;
  constructor() {
    this.taskList = [
      {
        id: 1,
        name: 'task1',
        description: 'task1 description',
      },
      {
        id: 2,
        name: 'task2',
        description: 'task2 long description lorem ipsum dolor si amet',
      },
    ];
  }

  ngOnInit(): void {}

  add() {
    if (this.name !== '' && this.description !== '') {
      this.taskList.push({
        id: this.nextId,
        name: this.name,
        description: this.description,
      });
      this.nextId++;
      this.name = '';
      this.description = '';
    }
    console.log(this.taskList);
  }

  deleteTask(taskItem: Task) {
    this.taskList.splice(this.taskList.indexOf(taskItem), 1);
  }
}
