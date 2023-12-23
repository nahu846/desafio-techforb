package org.example.service;

import org.example.entity.OptionType;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserMenuOptionsImpl implements UserMenuOptions {
    @Override
    public List<OptionType> getUserMenuOptions(long userId) {
        return Arrays.asList(
                OptionType.TARJETAS,
                OptionType.PRESTAMOS,
                OptionType.CERRAR_SESION
        );
    }
}
