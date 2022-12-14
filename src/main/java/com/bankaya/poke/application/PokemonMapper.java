package com.bankaya.poke.application;

import com.bankaya.poke.domain.*;
import com.bankaya.poke.model.*;
import org.mapstruct.Mapper;

@Mapper(
    componentModel = "spring"
)

public interface PokemonMapper {

    GetPokemonResponse pokemonToGetPokemonResponse(Pokemon pokemon);

    GetPokemonAbilityResponse pokemonToGetPokemonAbilityResponse(Pokemon pokemon);

    GetBaseExperienceResponse pokemonToGetBaseExperienceResponse(Pokemon pokemon);
    GetHeldItemsResponse pokemonToGetHeldItemsResponse(Pokemon pokemon);
    GetLocationResponse pokemonToGetLocationResponse(Pokemon pokemon);
    AbilityDTO abilityToAbilityDTO(Ability ability);

    NameDTO generationToNameDTO(Generation generation);

    DataTypeDTO nameToDataTypeDTO(Name name);

    EffectEntryDTO effectEntryToEffectEntryDTO(EffectEntry effectEntry);

    EffectChangeDTO effectChangeToEffectChangeDTO(EffectChange effectChange);

    FlavorTextEntryDTO flavorTextEntryToFlavorTextEntryDTO(FlavorTextEntry flavorTextEntry);

    String map(Name value);

    default String map(Item value){
        return null!=value?value.getName():null;
    }

    default String map(Version value){
        return null!=value?value.getName():null;
    }
    default String map(Language value){
        return null!=value?value.getName():null;
    }

    MovesDTO moveToMoveDTO(MovesDTO value);
    StatDTO statTostatDTO(Stat value);


}