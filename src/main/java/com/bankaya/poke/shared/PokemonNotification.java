package com.bankaya.poke.shared;

import lombok.Getter;

public enum PokemonNotification implements Notification {

    POKEMON_ERROR_UNKNOWN("E_POK_001","An error occurred in the system"),
    POKEMON_NOT_FOUND("W_POK_001","Pokemon not found");
    @Getter
    private String code;
    @Getter
    private String message;

    PokemonNotification(String code,String message){
        this.code = code;
        this.message = message;
    }

}
