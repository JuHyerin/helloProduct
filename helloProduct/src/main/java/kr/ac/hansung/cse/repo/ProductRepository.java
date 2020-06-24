package kr.ac.hansung.cse.repo;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	Iterable<Product> findByCategory(String category);
}
