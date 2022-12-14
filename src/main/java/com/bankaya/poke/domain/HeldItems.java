package com.bankaya.poke.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HeldItems {

   private Item item;
   @JsonProperty("version_details")
   private List<VersionDetail> versionDetails;

}