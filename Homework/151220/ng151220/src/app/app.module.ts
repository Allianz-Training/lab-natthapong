import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ToDoListComponent } from './homework1and2/to-do-list/to-do-list.component';
import { TaskComponent } from './homework1and2/task/task.component';
import { DescriptionComponent } from './homework1and2/description/description.component';
import { PanelComponent } from './panel/panel.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ToDoListComponent,
    TaskComponent,
    DescriptionComponent,
    PanelComponent,
  ],
  imports: [BrowserModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
