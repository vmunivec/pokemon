package com.bankaya.poke.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Ability {

    private Item ability;
    private Integer slot;
    @JsonProperty("is_hidden")
    private Boolean isHidden;
   }