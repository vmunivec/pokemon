package com.bankaya.poke.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class FlavorTextEntry {

   @JsonProperty("version_group")
   private Version versionGroup;
   private Language language;
   @JsonProperty("flavor_text")
   private String flavorText;

}