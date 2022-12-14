package com.bankaya.poke.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sprite {

   @JsonProperty("back_shiny_female")
   private String backShinyFemale;
   @JsonProperty("back_female")
   private String backFemale;
   @JsonProperty("back_default")
   private String backDefault;
   @JsonProperty("front_shiny_female")
   private String frontShinyFemale;
   @JsonProperty("front_default")
   private String frontDefault;
   @JsonProperty("front_female")
   private String frontFemale;
   @JsonProperty("back_shiny")
   private String backShiny;
   @JsonProperty("front_shiny")
   private String frontShiny;

}