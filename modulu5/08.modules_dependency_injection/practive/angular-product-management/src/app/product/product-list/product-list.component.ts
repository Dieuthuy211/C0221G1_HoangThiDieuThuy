import { Component, OnInit } from '@angular/core';
import {ProductService} from "../../service/product.service";
import { NgModule } from '@angular/core';
import {Product} from '../../model/product';




@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  keyWord: any ;
  products: Product[] = [];
  p: any ;

  constructor(private productService: ProductService) {
  }

  ngOnInit(): void {
    this.getAll();
  }
  getAll() {
    this.products = this.productService.getAll();
  }

}
