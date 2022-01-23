import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { RunEnumService } from 'src/app/enum/run-enum.service';
import { RunServeService } from "src/app/services/services/run-serve.service";
// ES6 Modules or TypeScript
import Swal from 'sweetalert2';

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.scss']
})
export class ClientComponent implements OnInit {
  public formGroupClient = new FormGroup(
    {
      nmid: new FormControl(''),
      cus_nmcliente: new FormControl(''),
      cus_dsnombres: new FormControl(''),
      cus_dsapellidos: new FormControl(''),
      cus_dsdireccion: new FormControl(''),
      cus_dscorreo: new FormControl(''),
      cus_cdtelefono: new FormControl(''),
      cus_cdtelefonoalter: new FormControl(''),
      cus_cdcelular: new FormControl(''),
      cus_nmcargo: new FormControl(''),
      cus_dscargo: new FormControl(''),
      cus_nmciudad: new FormControl(''),
      cus_dsciudad: new FormControl(''),
      cus_fenacimiento: new FormControl(''),
      cus_genero: new FormControl(''),
      cus_nmcomunidad: new FormControl(''),
      cus_dscomunidad: new FormControl(''),
      cus_dsempresalabora: new FormControl(''),
      cus_nmdivision: new FormControl(''),
      cus_dsdivision: new FormControl(''),
      cus_nmpais: new FormControl(''),
      cus_dspais: new FormControl(''),
      cus_hobbies: new FormControl(''),
      cus_febaja: new FormControl(''),
      cus_feregistro: new FormControl('')
    }
  );

  listClient: any[] = [];

  constructor(private apiService: RunServeService) {
  }

  ngOnInit(): void {
    this.showClient();
  }

  //Creacion de cliente 
  async insertClient() {
    await this.apiService.postData(
      RunEnumService.post_client, this.formGroupClient.value).subscribe(data => {
        Swal.fire({
          position: 'top-end',
          icon: 'success',
          title: 'Creación exitosa.',
          showConfirmButton: false,
          timer: 1500
        });
        console.log(data);
        this.resetValue();
        this.showClient();
      }, error => {
        console.log("Error: ", error)
      });
  }

  async showClient() {
    await this.apiService.getData(
      RunEnumService.get_client).subscribe(data => {
        this.listClient = data.list; 
      }, error => {
        console.log("Error: ", error)
      });
  }

  resetValue() {
    this.formGroupClient.reset();
  }

  selectClient(obj: any) {
    console.log(this.formGroupClient.value)
    this.formGroupClient.setValue(obj);
  }

  async updateClient() {
    await this.apiService.putData(
      RunEnumService.put_client + `${this.formGroupClient.value.nmid}`, this.formGroupClient.value).subscribe(data => {
        Swal.fire({
          position: 'top-end',
          icon: 'success',
          title: 'Actualización exitosa.',
          showConfirmButton: false,
          timer: 1500
        });
        console.log(data);
        this.resetValue();
        this.showClient();
      }, error => {
        console.log("Error: ", error)
      });
  }

  async deleteClient(id: string) {
    await Swal.fire({
      title: 'Esta seguro que desea eliminar?',
      text: "No hay reversa al eliminar.",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Eliminar'
    }).then((result) => {
      if (result.isConfirmed) {
        this.apiService.deleteData(RunEnumService.delete_client + id).subscribe(deleteM => {
          setTimeout(() => {
            this.showClient();
          }, 600);
        }, error => console.log("Error: ", error));
        Swal.fire({
          position: 'top-end',
          icon: 'success',
          title: 'Eliminación exitosa.',
          showConfirmButton: false,
          timer: 1500
        });
      }
    });
  }
}
