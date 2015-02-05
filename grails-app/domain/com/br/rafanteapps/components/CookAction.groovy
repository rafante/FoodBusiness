package com.br.rafanteapps.components

class CookAction {

    String name
    float time

    static hasMany = [requiredItems: KitchenWare]

    static constraints = {
    }
}
