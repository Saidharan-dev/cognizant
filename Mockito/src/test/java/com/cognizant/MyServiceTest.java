package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testFetchData() {

        // Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Define what the mock should return
        when(mockApi.fetchData()).thenReturn("Mock Data");

        // Inject the mock into MyService
        MyService service = new MyService(mockApi);

        // Call the method
        String result = service.fetchData();

        // Verify the result
        assertEquals("Mock Data", result);
    }

    @Test
    public void testVerifyInteraction() {

        // Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Inject the mock into MyService
        MyService service = new MyService(mockApi);

        // Call the method
        service.fetchData();

        // Verify that fetchData() on the mock was called
        verify(mockApi).fetchData();
    }
}