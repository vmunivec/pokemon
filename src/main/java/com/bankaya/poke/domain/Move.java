package com.bankaya.poke.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Move {

   @JsonProperty("version_group_details")
   private List<VersionGroupDetail> versionGroupDetails;
   private Item move;

}