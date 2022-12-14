package com.bankaya.poke.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class EffectEntry {

   @JsonProperty("short_effect")
   private String shortEffect;
   private String effect;
   private Language language;

}