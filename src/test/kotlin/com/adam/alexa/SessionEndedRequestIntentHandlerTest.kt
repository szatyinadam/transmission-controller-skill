package com.adam.alexa
import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.model.RequestEnvelope
import com.amazon.ask.model.SessionEndedRequest
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class SessionEndedRequestIntentHandlerTest {
    @Inject
    lateinit var handler: SessionEndedRequestIntentHandler

    @Test
    fun testSessionEndedRequestIntentHandler() {
        val request = SessionEndedRequest.builder().build()
        val input = HandlerInput.builder()
                .withRequestEnvelope(RequestEnvelope.builder()
                        .withRequest(request)
                        .build()
                ).build()
        Assertions.assertTrue(handler.canHandle(input))
        val responseOptional = handler.handle(input)
        Assertions.assertTrue(responseOptional.isPresent)
    }
}
