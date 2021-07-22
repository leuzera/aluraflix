package com.leuzera.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.MediaType

@Controller('/videos')
class VideosController {

    @Get(uri='/', produces=MediaType.APPLICATION_JSON)
    String index() {
        'Example Response'
    }
}
