package org.example.service;

import org.example.entity.OptionType;

import java.util.List;

public interface UserMenuOptions {
    List<OptionType> getUserMenuOptions(long userId);
}
