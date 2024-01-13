package io.github.jbossjaslow.horse_whistle.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class HotBarUtil {
    public static void displayActionBarText(String text, PlayerEntity player, Formatting formatting) {
        player.sendMessage(Text.translatable(text).formatted(formatting), true);
    }
}
