import { Component, OnInit } from '@angular/core';
declare var jquery: any;
declare var $: any;

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  dynamic_menu: any[] = [];
  optionAdm: number;

  constructor() {
    this.dynamic_menu = [
      {
        'title': 'Creación cliente',
        'url': '/cliente',
        'icon': 'fas fa-plus-circle mr-3'
      },
      {
        'title': 'Consulta cliente',
        'url': '/consulta/cliente',
        'icon': 'fas fa-search mr-3'
      }, 
    ];
    this.optionAdm = parseInt(sessionStorage.getItem('noPage') || '0');
  }

  ngOnInit(): void {
    this.Script();
  }

  myFunc() {
    $(this).toggleClass("active");
  }
  colorOption(item: number) {
    sessionStorage.setItem('noPage', item.toString());
    this.optionAdm = parseInt(sessionStorage.getItem('noPage') || '0');
    console.log(this.optionAdm);
  }

  Script() {
    $(function () {
      // Sidebar toggle behavior
      $('#sidebarCollapse').on('click', function () {
        $('#sidebar, #content').toggleClass('active');
      });
    });
  }
}


