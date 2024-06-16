package net.eitan.mccourse;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicModding implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger("basicmodding");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}