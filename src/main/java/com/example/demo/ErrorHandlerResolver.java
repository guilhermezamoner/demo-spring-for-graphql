package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.stereotype.Component;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ErrorHandlerResolver extends DataFetcherExceptionResolverAdapter {
    //private static final Logger logger = LoggerFactory.getLogger(BookRepository.class);

    @Override
    protected List<GraphQLError> resolveToMultipleErrors(Throwable ex, DataFetchingEnvironment env){
        log.info("resolveToMultipleErrors - ex: [{}]", ex.getMessage(), ex);

        GraphQLError build = GraphqlErrorBuilder.newError(env)
                .message(ex.getMessage())
                .build();
        return Arrays.asList(build);
    }
    
}
