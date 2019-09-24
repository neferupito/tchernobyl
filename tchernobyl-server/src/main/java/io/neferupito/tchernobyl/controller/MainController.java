package io.neferupito.tchernobyl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class MainController {

    @RequestMapping("/chats/all")
    public List<Chat> getAllChats() {
        System.err.println("APPEL DE CHATS " + new Date());
        return Arrays.asList(
                Chat.builder()
                        .id(1)
                        .name("Ping Ping")
                        .breed("European")
                        .isVomito(false)
                        .randomValue(UUID.randomUUID().toString())
                        .build(),
                Chat.builder()
                        .id(2)
                        .name("Ciri")
                        .breed("European")
                        .isVomito(true)
                        .randomValue(UUID.randomUUID().toString())
                        .build(),
                Chat.builder()
                        .id(3)
                        .name("Zelda")
                        .breed("Siamese")
                        .isVomito(true)
                        .randomValue(UUID.randomUUID().toString())
                        .build(),
                Chat.builder()
                        .id(4)
                        .name("Chaos")
                        .breed("European")
                        .isVomito(false)
                        .randomValue(UUID.randomUUID().toString())
                        .build(),
                Chat.builder()
                        .id(5)
                        .name("Chocolat")
                        .breed("European")
                        .isVomito(true)
                        .randomValue(UUID.randomUUID().toString())
                        .build());
    }

}