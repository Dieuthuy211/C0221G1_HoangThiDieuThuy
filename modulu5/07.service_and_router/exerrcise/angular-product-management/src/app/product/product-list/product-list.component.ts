import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  keyWord: string;
  products: Product[] = [];
  p: number;
  constructor(private productService: ProductService) {
  }

  ngOnInit(): void {
    this.getAll();
  }
  getAll() {
    this.products = this.productService.getAll();
  }

  deleteCategory(id: any) {
    this.productService.deleteProduct(id)
    confirm('bạn có muốn xóa không'+ id)
  }
}
