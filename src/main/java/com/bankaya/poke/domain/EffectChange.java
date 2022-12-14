package com.bankaya.poke.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EffectChange {

   @JsonProperty("effect_entries")
   private List<EffectEntry> effectEntries;

   @JsonProperty("version_group")
   private Version versionGroup;

}