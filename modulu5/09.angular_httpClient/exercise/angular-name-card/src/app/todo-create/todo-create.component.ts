import { Component, OnInit } from '@angular/core';
import {TodoService} from '../service/todo.service';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-todo-create',
  templateUrl: './todo-create.component.html',
  styleUrls: ['./todo-create.component.css']
})
export class TodoCreateComponent implements OnInit {
  createForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl()
  });
  constructor(private todoService: TodoService) { }

  ngOnInit(): void {
  }
  submit() {
    const todo = this.createForm.value;
    this.todoService.saveTodo(todo).subscribe(() => {
      this.createForm.reset();
      alert('Tạo thành công');
    }, e => {
      console.log(e);
    });
  }
}
