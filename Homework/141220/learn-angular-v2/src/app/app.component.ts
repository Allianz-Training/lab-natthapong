import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  status = {
    isLab3: false,
    isLab4: false,
    isHomework1: false,
    isHomework2: false,
    isHomework3: false,
    isHomework4: false,
  };
  title = 'learn-angular';

  constructor() {}

  reset() {
    for (const i in this.status) {
      this.status[i] = false;
    }
  }
  showLab3() {
    this.status.isLab3 = true;
  }
  showLab4() {
    this.status.isLab4 = true;
  }
  showHomework1() {
    this.status.isHomework1 = true;
  }
  showHomework2() {
    this.status.isHomework2 = true;
  }
  showHomework3() {
    this.status.isHomework3 = true;
  }
  showHomework4() {
    this.status.isHomework4 = true;
  }
}
