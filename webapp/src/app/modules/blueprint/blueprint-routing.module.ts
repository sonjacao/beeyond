import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BlueprintComponent } from './pages/blueprint/blueprint.component';
import { BlueprintTemplateComponent } from './blueprint-template/blueprint-template.component';

const routes: Routes = [
  {path: '', component: BlueprintComponent},
  {path: ':name', component: BlueprintTemplateComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BlueprintRoutingModule { }
