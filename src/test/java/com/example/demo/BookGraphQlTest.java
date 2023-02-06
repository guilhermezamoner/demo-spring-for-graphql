package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@SpringBootTest
@AutoConfigureGraphQlTester
public class BookGraphQlTest {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    public void shouldFindAllBooks() {
        this.graphQlTester
                .documentName("allBooks-query")
                .execute()
                .path("allBooks[0].title")
                .entity(String.class)
                .isEqualTo("Reactive Spring");
    }
}
