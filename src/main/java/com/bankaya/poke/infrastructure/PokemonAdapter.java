package com.bankaya.poke.infrastructure;

import com.bankaya.poke.domain.IPokemonPort;
import com.bankaya.poke.domain.Pokemon;
import com.bankaya.poke.shared.PokemonNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
@Component
public class PokemonAdapter implements IPokemonPort {


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Optional<Pokemon> findById(int id) {
        Map<String, Object> vars = new HashMap<>();
        vars.put("id", id);
        Pokemon r= null;
        try {
            ResponseEntity<Pokemon> responseEntity =
                    restTemplate.getForEntity("/pokemon/{id}", Pokemon.class, vars);
            if (!responseEntity.hasBody())
                PokemonNotification.POKEMON_NOT_FOUND.exception();
            r= responseEntity.getBody();
        }catch (HttpStatusCodeException ex) {
            if (ex.getStatusCode()!=HttpStatus.NOT_FOUND)
                throw ex;
        }catch (Exception e){
            PokemonNotification.POKEMON_ERROR_UNKNOWN.exception();
        }
        return Optional.ofNullable(r);
    }

    @Override
    public Optional<Pokemon> findByName(String name) {
        Map<String, Object> vars = new HashMap<>();
        vars.put("name", name);
        Pokemon r= null;
        try {
            ResponseEntity<Pokemon> responseEntity =
                    restTemplate.getForEntity("/pokemon/{name}", Pokemon.class, vars);
            if (!responseEntity.hasBody())
                PokemonNotification.POKEMON_NOT_FOUND.exception();
            r= responseEntity.getBody();
        }catch (HttpStatusCodeException ex) {
            if (ex.getStatusCode()!=HttpStatus.NOT_FOUND)
                throw ex;
        }catch (Exception e){
            PokemonNotification.POKEMON_ERROR_UNKNOWN.exception();
        }
        return Optional.ofNullable(r);
    }
}
