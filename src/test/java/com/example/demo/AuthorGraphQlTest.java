package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@SpringBootTest
@AutoConfigureGraphQlTester
public class AuthorGraphQlTest {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    @Disabled
    public void shouldCreateAuthor() {
        this.graphQlTester
                .documentName("createAuthor-mutation")
                .execute()
                .path("createAuthor.firstName")
                .entity(String.class)
                .isEqualTo("John");
    }
}
