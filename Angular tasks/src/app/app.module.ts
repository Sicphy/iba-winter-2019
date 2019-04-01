import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { StatusCodesComponent } from './components/status-codes/status-codes.component';
import { StatusCodeComponent } from './components/status-codes/status-code/status-code.component';
import { ObjectTypeComponent } from './components/status-codes/status-code/object-type/object-type.component';
import { Sample1Pipe } from './pipes/sample1.pipe';
import { SearchPipe } from './pipes/search.pipe';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatInputModule} from '@angular/material/input';
import {MatTableModule} from '@angular/material/table';
import { ColorDirective } from './directives/color.directive';


@NgModule({
  declarations: [
    AppComponent,
    StatusCodesComponent,
    StatusCodeComponent,
    ObjectTypeComponent,
    Sample1Pipe,
    SearchPipe,
    ColorDirective
  ],
  imports: [
    BrowserModule,
    FormsModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatTableModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
