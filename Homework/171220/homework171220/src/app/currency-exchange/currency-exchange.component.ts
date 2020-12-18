import { Component, Input, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-currency-exchange',
  templateUrl: './currency-exchange.component.html',
  styleUrls: ['./currency-exchange.component.css'],
})
export class CurrencyExchangeComponent implements OnInit {
  @Input()
  sourceCurrency: string = '';
  destinationCurrency: string = '';
  amount: number;
  result: number;
  rate: number;

  constructor(private client: HttpClient) {}

  ngOnInit(): void {}
  convert(): void {
    if (
      this.sourceCurrency === '' ||
      this.destinationCurrency === '' ||
      this.amount === undefined
    ) {
      alert('PLEASE ENTER EVERY BOX');
    } else if (this.amount <= 0) {
      alert('Invalid number: positive only');
    } else {
      this.request();
    }
  }

  request() {
    this.client
      .get(
        `https://api.exchangeratesapi.io/latest?base=${this.sourceCurrency.toUpperCase()}&symbols=${this.destinationCurrency.toUpperCase()}`
      )
      .subscribe(
        (res) => {
          this.rate = res['rates'][this.destinationCurrency.toUpperCase()];
          this.result = this.amount * this.rate;
        },
        (err) => {
          alert(err.status + ' Invalid input');
        }
      );
  }
}
