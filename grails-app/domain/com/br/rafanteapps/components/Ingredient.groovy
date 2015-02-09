package com.br.rafanteapps.components

class Ingredient {

    String name

    //Quão doce é o ingrediente
    /*int sweet
    int salty
    int bitter
    int sour
    int spicy
    int consistency
    int sophisticated
    int attractive
    int juicy*/
    static hasMany = [attrs: IngredientAttribute]

    static constraints = {
        attrs unique: true
        /*sweet(range: 0..10)
        salty(range: 0..10)
        bitter(range: 0..10)
        sour(range: 0..10)
        spicy(range: 0..10)
        consistency(range: 0..10)
        sophisticated(range: 0..10)
        attractive(range: 0..10)
        juicy(range: 0..10)*/
    }

    /*static mapping = {
        //attrs cascade: 'all-delete-orphan'
    }*/

}
