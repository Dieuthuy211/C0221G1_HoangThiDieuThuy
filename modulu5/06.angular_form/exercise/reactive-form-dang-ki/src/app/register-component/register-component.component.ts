import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";

function comparePassword(check: AbstractControl) {
  const value = check.value;
  return (value.password === value.confirmPassword) ? null : {
    passwordNotMatch: true
  };
}

@Component({
  selector: 'app-register-component',
  templateUrl: './register-component.component.html',
  styleUrls: ['./register-component.component.css']
})
export class RegisterComponentComponent implements OnInit {
  countryList: string[] = ['hà nội', 'huế', 'đà nẵng', 'tp hồ chí minh'];
  rw: FormGroup;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.rw = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      pwGroup: this.fb.group({
        password: ['', [Validators.required, Validators.minLength(6)]],
        confirmPassword: ['', [Validators.required, Validators.minLength(6)]]
      }, {validators: comparePassword}),
      country: ['', Validators.required],
      age: ['', [Validators.required, Validators.min(18)]],
      gender: ['', Validators.required],
      phone: ['', [Validators.required, Validators.pattern('^\\+84\\d{9,10}$')]]
    })
  }

  onSubmit() {
    console.log(this.rw)
  }

}
