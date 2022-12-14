package com.bankaya.poke.domain;

import java.util.Optional;

public interface IPokemonPort {

    Optional<Pokemon> findById(int id);
    Optional<Pokemon> findByName(String name);
}
