package com.br.rafanteapps.components

class Attribute {

    String name

    static constraints = {
    }

    static mapping = {
        name unique: true
        //ingredient  cascade: 'all-delete-orphan'
    }
}
