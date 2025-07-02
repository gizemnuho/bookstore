package com.bookStore;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookStoreApplicationTests {


	@Autowired
	private BookRepository bRepo;
	@Test
	public void save(Book b) {
		bRepo.save(b);
	}



	//@Test
	//void contextLoads() {
	//}

}
