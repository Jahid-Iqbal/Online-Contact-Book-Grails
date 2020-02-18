package online.contact.book.grails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "dashboard", action:  "index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
