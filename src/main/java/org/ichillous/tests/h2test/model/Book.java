package org.ichillous.tests.h2test.model;

import org.springframework.data.annotation.Id;

public record Book(@Id Integer id, String title, int pages, String author) {
}
