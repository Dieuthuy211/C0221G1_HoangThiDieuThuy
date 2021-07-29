import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TodoComponent} from './todo/todo.component';


const routes: Routes = [
  {path: '',
    pathMatch: 'full',
    redirectTo: 'list',
    component: TodoComponent
  },
  {path: 'list',
    component: TodoComponent
  },
  {path: 'create',
    // component: CategoryCreateComponent
  },
  {path: 'edit/:id',
    // component: CategoryEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
