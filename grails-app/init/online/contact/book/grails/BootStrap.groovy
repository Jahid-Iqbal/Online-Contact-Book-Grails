package online.contact.book.grails

import com.ocb.AppInitializationService

class BootStrap {

    def init = { servletContext ->
        AppInitializationService.initialize()

    }
    def destroy = {
    }
}
