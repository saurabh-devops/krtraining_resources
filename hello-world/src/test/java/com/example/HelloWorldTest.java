package com.example;

import com.sun.net.httpserver.HttpExchange;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.io.OutputStream;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)  // Add this annotation for JUnit 5 and Mockito integration
public class HelloWorldTest {

    @Mock
    private HttpExchange exchange;  // Mocking HttpExchange

    @Mock
    private OutputStream responseBody;  // Mocking OutputStream

    @InjectMocks
    private HelloWorld.HelloHandler helloHandler;  // Inject mocks into HelloHandler

    @Test
    public void testHandle() throws IOException {
        // Arrange: Set up mock behavior
        String expectedResponse = "Hello, World!";
        when(exchange.getResponseBody()).thenReturn(responseBody);

        // Act: Call the method being tested
        helloHandler.handle(exchange);

        // Assert: Verify the behavior
        verify(exchange).sendResponseHeaders(200, expectedResponse.getBytes().length);
        verify(responseBody).write(expectedResponse.getBytes());
        verify(responseBody).close();
    }
}

