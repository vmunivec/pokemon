package com.bankaya.poke.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pokemon {

   @JsonProperty("location_area_encounters")
   private String locationAreaEncounters;
   private List<Type> types;
   @JsonProperty("base_experience")
   private Integer baseExperience;
   @JsonProperty("held_items")
   private List<HeldItems> heldItems;
   private Integer weight;
   @JsonProperty("is_default")
   private Boolean isDefault;
   private Sprite sprites;
   private List<Ability> abilities;
   @JsonProperty("game_indices")
   private List<GameIndex> gameIndices;
   private Item species;
   private List<Stat> stats;
   private List<Move> moves;
   private String name;
   private Integer id;
   private List<Item> forms;
   private Integer height;
   private Integer order;

}