package com.bankaya.poke.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class VersionGroupDetail {
   @JsonProperty("level_learned_at")
   private Integer levelLearnedAt;
   @JsonProperty("version_group")
   private Version versionGroup;
   @JsonProperty("move_learn_method")
   private Item moveLearnMethod;

}