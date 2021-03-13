package com.adam.alexa
import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.model.SessionEndedRequest
import com.amazon.ask.request.Predicates
import java.util.Optional
import javax.inject.Singleton

@Singleton
class SessionEndedRequestIntentHandler : RequestHandler {
    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.requestType(SessionEndedRequest::class.java))
    }

    override fun handle(input: HandlerInput): Optional<Response> {
        // any cleanup logic goes here
        return input.responseBuilder.build()
    }
}