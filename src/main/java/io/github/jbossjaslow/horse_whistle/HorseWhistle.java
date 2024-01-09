package io.github.jbossjaslow.horse_whistle;

import io.github.jbossjaslow.horse_whistle.config.HorseWhistleConfig;
import io.github.jbossjaslow.horse_whistle.items.HorseWhistleItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HorseWhistle implements ModInitializer {
	public static final String MOD_ID = "horse_whistle";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final HorseWhistleConfig CONFIG = HorseWhistleConfig.createAndLoad();

	public static final Item HORSE_WHISTLE_ITEM = new HorseWhistleItem(new FabricItemSettings());

	@Override
	public void onInitialize() {
		LOGGER.info("Horse Whistle initialized!");

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "horse_whistle_item"), HORSE_WHISTLE_ITEM);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.add(HORSE_WHISTLE_ITEM);
		});
	}
}