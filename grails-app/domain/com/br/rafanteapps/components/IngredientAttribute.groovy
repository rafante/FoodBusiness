package com.br.rafanteapps.components

class IngredientAttribute {

    int value

    /*Ingredient ingredient
    Attribute attribute*/

    static belongsTo = [ingredient: Ingredient, attribute: Attribute]

    static constraints = {

        value range: 1..10
    }

    static IngredientAttribute create(Ingredient ingr, Attribute attr, int val, flush = true){
        new IngredientAttribute(ingredient: ingr, attribute: attr, value: val).save(flush: flush, insert: true)
    }

    static IngredientAttribute get(Ingredient ingr, Attribute attr){

    }
}
