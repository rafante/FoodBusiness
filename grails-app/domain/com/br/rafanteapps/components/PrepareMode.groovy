package com.br.rafanteapps.components

class PrepareMode {

    String description

    static hasMany = [cookActions: CookAction]

    static constraints = {
    }

    static mapping = {
        cookActions cascade: 'all-delete-orphan'
    }
}
