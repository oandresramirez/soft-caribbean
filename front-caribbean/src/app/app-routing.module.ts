import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NavbarComponent } from './components/pages/navbar/navbar.component';
import { ClientComponent } from './components/pages/client/client.component';
import { ConsultClientComponent } from './components/pages/consult-client/consult-client.component';

const routes: Routes = [
  {
    path: 'cliente', component: ClientComponent, 
  },
  {
    path: 'consulta/cliente', component: ConsultClientComponent, 
  },
 
  { path: '**', pathMatch: 'full', redirectTo: 'cliente' }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const components=[NavbarComponent, ClientComponent, ConsultClientComponent];
