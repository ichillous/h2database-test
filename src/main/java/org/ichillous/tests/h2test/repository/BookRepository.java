package org.ichillous.tests.h2test.repository;

import org.ichillous.tests.h2test.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
