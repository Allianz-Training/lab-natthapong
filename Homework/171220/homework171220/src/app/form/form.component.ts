import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css'],
})
export class FormComponent implements OnInit {
  form: FormGroup;
  constructor(private fb: FormBuilder) {
    this.form = this.fb.group({
      name: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      postalAddress: [
        '',
        [Validators.required, Validators.pattern('^[0-9][0-9]*-[0-9][0-9]*$')],
      ],
      comments: ['', []],
    });
  }

  ngOnInit(): void {}

  validate() {
    if (this.form.valid) {
      let val: any = this.form.value;
      let isConfirm: boolean = confirm(
        `Complete!
        
        Please verify your information.
        Name:               ${val.name}
        Email:              ${val.email}
        Postal Address:     ${val.postalAddress}
        Comments:           ${val.comments}`
      );
      if (isConfirm) {
        this.form.reset();
      }
    } else {
      let out: string = "Can't submit your form, please check error below.\n";
      if (this.form.get('name').errors?.required) {
        out += '- Please enter your name.\n';
      }
      if (this.form.get('email').errors?.required) {
        out += '- Please enter your email.\n';
      }
      if (this.form.get('email').errors?.email) {
        out +=
          '- Please enter a valid email address as <email name>@<domain name>.\n';
      }

      if (this.form.get('postalAddress').errors?.required) {
        out += '- Please enter your postalAddress.\n';
      }
      if (this.form.get('postalAddress').errors?.pattern) {
        out += '- Please enter a valid postal address as <number>-<number>.\n';
      }
      alert(out);
    }
  }
}
