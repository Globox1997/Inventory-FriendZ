package net.invo.config;

import io.github.prospector.modmenu.api.ModMenuApi;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.example.ExampleInitClient;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;

import java.util.Optional;
import java.util.function.Function;

import java.util.function.Supplier;

@SuppressWarnings("unused")
@Environment(EnvType.CLIENT)

public class modmenuintegration implements ModMenuApi {

    @Override
    public String getModId() {
        return "invo";
    }

    // @Override
    // public Optional<Supplier<Screen>> getConfigScreen(Screen screen) {
    // return Optional.of(AutoConfig.getConfigScreen(friendconfig.class, screen));
    // }

    @Override
    public Function<Screen, ? extends Screen> getConfigScreenFactory() {
        return screen -> AutoConfig.getConfigScreen(friendconfig.class, screen).get();
    }
}