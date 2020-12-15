import { Component, Input, OnInit, EventEmitter, Output } from '@angular/core';
import { Task } from '../task';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css'],
})
export class TaskComponent implements OnInit {
  @Input()
  taskItem: Task;
  @Input()
  enabledID: number;

  @Output()
  OnDelete: EventEmitter<Task> = new EventEmitter();

  @Output()
  OnToggle: EventEmitter<Task> = new EventEmitter();

  constructor() {}

  ngOnInit(): void {}

  delete() {
    this.OnDelete.emit(this.taskItem);
  }
  toggle() {
    this.OnToggle.emit(this.taskItem);
    console.log('toggle');
  }
}
