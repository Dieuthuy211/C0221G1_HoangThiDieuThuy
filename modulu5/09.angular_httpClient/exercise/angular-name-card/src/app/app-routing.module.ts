import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';

import {TodoCreateComponent} from './todo-create/todo-create.component';
import {TodoEditComponent} from './todo-edit/todo-edit.component';
import {TodoComponent} from './todo/todo.component';


const routes: Routes = [
//   {
//   path: '',
//     pathMatch: 'full',
//     redirectTo: 'list',
//     component: TodoComponent
// },
  {
    path: 'list',
    component: TodoComponent
  },
  {
    path: 'create',
    component: TodoCreateComponent
  },
  {
    path: 'edit/:id',
    component: TodoEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
