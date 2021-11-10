package com.training.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.training.bean.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, String> {

	//get books based on title
	// select * from book where title = 'abcd'
	public List<Book> findAllByTitle(String title);
	
	//get Books based on title pattern
	//select * from book where title like '%abcd%'
	
	public List<Book> findAllByTitleLike(String titlePattern);

	// get all books that are priced above 150 rs.
	
	public List<Book> findAllByPriceGreaterThan(double price);

	//get all books that are technical
	
	//select * from book where category='Technical'
	
	@Query("from Book b where b.category = :category")
	public List<Book> getAllByCategory(@Param("category") String category);
	
	//update stock of all the books that have less than 100 stock by 50
	
	@Transactional
	@Modifying
	@Query("update Book b set b.stock=b.stock + :newstock where b.stock < :oldstock")
	public int updateAllBooksStock(@Param("oldstock") long stock,@Param("newstock") long newStock);
	
}
