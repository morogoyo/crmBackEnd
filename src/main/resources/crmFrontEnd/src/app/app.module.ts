import { CompanyService } from './../services/company/company.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ClientService } from '../services/client/client.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [ClientService,CompanyService],
  bootstrap: [AppComponent]
})
export class AppModule { }
