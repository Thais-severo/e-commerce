package com.tads.ecommerce.repostory;
import  com.tads.ecommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
