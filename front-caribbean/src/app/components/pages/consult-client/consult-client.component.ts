import { Component, OnInit } from '@angular/core';
import { RunEnumService } from 'src/app/enum/run-enum.service';
import { RunServeService } from 'src/app/services/services/run-serve.service';

@Component({
  selector: 'app-consult-client',
  templateUrl: './consult-client.component.html',
  styleUrls: ['./consult-client.component.scss']
})
export class ConsultClientComponent implements OnInit {
  listClient: any[] = [];
  seach: string = '';

  constructor(private apiService: RunServeService) { }

  ngOnInit(): void { 
  }

  async showClient() {
    await this.apiService.getData(
      RunEnumService.get_client_find+`${this.seach}`).subscribe(data => {
        this.listClient = data.list;
        console.log(data.list);
      }, error => {
        console.log("Error: ", error)
      });
  }
}
