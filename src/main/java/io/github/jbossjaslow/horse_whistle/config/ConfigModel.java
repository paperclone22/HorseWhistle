package io.github.jbossjaslow.horse_whistle.config;

import io.github.jbossjaslow.horse_whistle.HorseWhistle;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.Sync;

@Modmenu(modId = HorseWhistle.MOD_ID)
@Config(name = "horse-whistle-config", wrapperName = "HorseWhistleConfig")
public class ConfigModel {
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public int searchRadius = 500;
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public int durability = 16;
}
