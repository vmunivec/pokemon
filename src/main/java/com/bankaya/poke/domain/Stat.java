package com.bankaya.poke.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Stat {

   private Item stat;
   @JsonProperty("base_stat")
   private Integer baseStat;
   private Integer effort;

}