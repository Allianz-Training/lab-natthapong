import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { FormComponent } from '../form/form.component';
import { CurrencyExchangeComponent } from '../currency-exchange/currency-exchange.component';

const routes: Routes = [
  {
    path: 'form',
    component: FormComponent,
  },
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'form',
  },
  {
    path: 'currency',
    component: CurrencyExchangeComponent,
  },
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRouteModule {}
