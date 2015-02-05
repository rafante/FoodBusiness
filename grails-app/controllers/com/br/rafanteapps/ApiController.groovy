package com.br.rafanteapps

import grails.converters.JSON

class ApiController {

    def index() {}

    def getStateLoader() {
        def map = [mainAnswer: 'Deus']
        render map as JSON
    }
}
