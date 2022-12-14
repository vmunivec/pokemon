package com.bankaya.poke.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class GameIndex {

   @JsonProperty("game_index")
   private Integer gameIndex;
   private Version version;

}