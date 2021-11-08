package com.training;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.client.RestTemplateBuilderConfigurer;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.bean.Book;

@RestController
@RequestMapping("/store")
public class BookConsumerController {
	
	@Autowired
	private RestTemplate restTemplate; 
	
	
	String producerUrl = "http://localhost:8081/store/book/isbn/{isbn}";
	
	@GetMapping("/getbookdetails/isbn/{isbn}/qty/{qty}")
	public Book getBookDetailsAmount(@PathVariable("isbn") String isbn,@PathVariable("qty") int qty)
	{
		
		Map<String,String> map = new HashMap<>();
		map.put("isbn", isbn);
		
		
		Book purchasedBook = restTemplate.getForObject(producerUrl, Book.class, map);
		
		purchasedBook.setQty(qty);
		purchasedBook.setAmount(qty * purchasedBook.getPrice());
		
		return purchasedBook;
	}
	
	
}
