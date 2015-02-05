package com.br.rafanteapps.components

class Recipe {

    String name
    String description

    static belongsTo = [prepareMode: PrepareMode]

    static hasMany = [portions: IngredientsPortion]

    static constraints = {
    }
}
