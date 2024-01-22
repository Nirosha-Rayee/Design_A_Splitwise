package com.example.splitwise.commands;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegisterUserCommand implements Command{

    @Override
    public void execute(String input) {

    }

    @Override
    public boolean matches(String input) {

        List<String> words = List.of(input.split(" "));
        return (words.size() == 4 && words.get(0).equals(CommandKeywords.RegisterUser));

    }
}
