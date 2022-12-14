package com.bankaya.poke.application;

import com.bankaya.poke.domain.IPokemonPort;
import com.bankaya.poke.domain.Pokemon;
import com.bankaya.poke.model.*;
import com.bankaya.poke.shared.PokemonNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Optional;

@Endpoint
public class PokemonEndpoint {

    private static final String NAMESPACE_URI = "http://bankaya/soap/pokemon";

    @Autowired
    private IPokemonPort pokemonPort;
    @Autowired
    private PokemonMapper pokemonMapper;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonIdRequest")
    @ResponsePayload
    public GetPokemonResponse getPokemonById(@RequestPayload GetPokemonIdRequest request) {

        Optional<Pokemon> pokemon = pokemonPort.findById(request.getId());

        if (!pokemon.isPresent())
            PokemonNotification.POKEMON_NOT_FOUND.exception();

        GetPokemonResponse response = pokemonMapper.pokemonToGetPokemonResponse(pokemon.get());

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonNameRequest")
    @ResponsePayload
    public GetPokemonResponse getPokemonByName(@RequestPayload GetPokemonNameRequest request) {

        Optional<Pokemon> pokemon = pokemonPort.findByName(request.getName());

        if (!pokemon.isPresent())
            PokemonNotification.POKEMON_NOT_FOUND.exception();

        GetPokemonResponse response = pokemonMapper.pokemonToGetPokemonResponse(pokemon.get());

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonAbilityNameRequest")
    @ResponsePayload
    public GetPokemonAbilityResponse getAbilityPokemonByName(@RequestPayload GetPokemonAbilityNameRequest request) {

        Optional<Pokemon> pokemon = pokemonPort.findByName(request.getName());

        if (!pokemon.isPresent())
            throw new RuntimeException();

        GetPokemonAbilityResponse  response = pokemonMapper.pokemonToGetPokemonAbilityResponse(pokemon.get());

        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBaseExperienceNameRequest")
    @ResponsePayload
    public GetBaseExperienceResponse getBaseExperiencePokemonByName(@RequestPayload GetBaseExperienceNameRequest request) {

        Optional<Pokemon> pokemon = pokemonPort.findByName(request.getName());

        if (!pokemon.isPresent())
            PokemonNotification.POKEMON_NOT_FOUND.exception();

        GetBaseExperienceResponse  response = pokemonMapper.pokemonToGetBaseExperienceResponse(pokemon.get());

        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHeldItemsNameRequest")
    @ResponsePayload
    public GetHeldItemsResponse getGetHeldItemsByName(@RequestPayload GetHeldItemsNameRequest request) {

        Optional<Pokemon> pokemon = pokemonPort.findByName(request.getName());

        if (!pokemon.isPresent())
            PokemonNotification.POKEMON_NOT_FOUND.exception();

        GetHeldItemsResponse  response = pokemonMapper.pokemonToGetHeldItemsResponse(pokemon.get());

        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLocationNameRequest")
    @ResponsePayload
    public GetLocationResponse getLocationPokemonByName(@RequestPayload GetLocationNameRequest request) {

        Optional<Pokemon> pokemon = pokemonPort.findByName(request.getName());

        if (!pokemon.isPresent())
            PokemonNotification.POKEMON_NOT_FOUND.exception();

        GetLocationResponse  response = pokemonMapper.pokemonToGetLocationResponse(pokemon.get());

        return response;
    }




}