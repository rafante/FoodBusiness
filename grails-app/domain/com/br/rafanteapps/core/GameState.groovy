package com.br.rafanteapps.core

class GameState {

    State state = State.SIGNIN

    static constraints = {
    }
}

public enum State{
    SIGNUP,
    SIGNIN,
    MENU
}
