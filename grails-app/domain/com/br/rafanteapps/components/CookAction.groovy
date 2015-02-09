package com.br.rafanteapps.components

class CookAction {

    String name
    float time

    static hasMany = [requiredItems: CookActionKitchenWare]
    //static belongsTo = [KitchenWare]

    static constraints = {
    }

    static mapping = {
        //requiredItems cascade: 'all-delete-orphan'
    }
}
