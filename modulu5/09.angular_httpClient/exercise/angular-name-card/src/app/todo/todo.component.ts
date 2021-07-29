import {Component, OnInit} from '@angular/core';
import {Todo} from '../model/todo';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {TodoService} from '../service/todo.service';

// tslint:disable-next-line:variable-name
let _id = 1;

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
  private todos: Todo[];
  constructor(private todoService: TodoService) {
  }

  ngOnInit() {
    this.getToDo();
  }
  getToDo() {
    this.todoService.getAll().subscribe(todos => {
      this.todos = todos;
    });
  }
}
