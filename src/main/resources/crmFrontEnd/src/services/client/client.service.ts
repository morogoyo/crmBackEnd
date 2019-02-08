import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable({  providedIn: 'root'})
export class ClientService {

  // constructor for bringing in httpclient for communication
  constructor(private http: HttpClient) { }

  // gets all clients
getAllClients():Observable<any>{
  return this.http.get('localhost:8080/customer/')
}




}
