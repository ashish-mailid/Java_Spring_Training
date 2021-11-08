package com.training.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.training.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>{

	
	/* find all Books based on title */
	List<Book> findByTitle(String title);
	
	//select * from book where title='C'
	
	List<Book> findByStock(long stock);
	List<Book> findByStockGreaterThan(long stock);
	List<Book> findByTitleLike(String pattern);
	
	List<Book> findByTitleAndStock(String title,long stock);
	
	@Query("from Book b where b.stock > :stock")
	List<Book> findByStockGt(@Param("stock") long stock);
	
	@Transactional
	@Modifying
	@Query("update Book b set b.stock=b.stock+:newstock where b.stock > :oldstock")
	public int updateStockGt(@Param("newstock") long newStock,@Param("oldstock") long oldStock);
	
}




