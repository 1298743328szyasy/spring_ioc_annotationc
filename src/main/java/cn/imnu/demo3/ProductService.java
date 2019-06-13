package cn.imnu.demo3;

import sun.reflect.generics.scope.Scope;

import javax.annotation.Resource;

public class ProductService {
    @Resource(name = "categoryDao")
    public CategoryDao categoryDao;

//    public CategoryDao getCategoryDao() {
//        return categoryDao;
//    }
//
//    public void setCategoryDao(CategoryDao categoryDao) {
//        this.categoryDao = categoryDao;
//    }
//
//    public ProductDao getProductDao() {
//        return productDao;
//    }
//
//    public void setProductDao(ProductDao productDao) {
//        this.productDao = productDao;
//    }
    @Resource(name = "productDao")
    public ProductDao productDao;
    public void save(){
        System.out.println("ProductService的save方法执行了...");
        categoryDao.save();
        productDao.save();
    }
}
