package com.oktenweb.java_adv.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter

public class
MovieDirectorDto {

    @JsonProperty("director_id")
    private int directorId;
    private List<MovieDto> movies;

}
