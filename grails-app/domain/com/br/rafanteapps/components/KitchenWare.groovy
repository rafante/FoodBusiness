package com.br.rafanteapps.components

class KitchenWare extends Item{

    String name
    //Material material

    static hasMany = [possibleCookActions: CookActionKitchenWare]

    static constraints = {
    }

    static mapping = {
        //possibleCookActions cascade: 'all-delete-orphan'
    }
}
