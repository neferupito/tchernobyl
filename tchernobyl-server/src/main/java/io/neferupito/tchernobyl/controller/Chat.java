package io.neferupito.tchernobyl.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Chat {

    private int id;
    private String name;
    private String breed;
    private boolean isVomito;
    private String randomValue;

}
