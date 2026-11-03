package io.github.realms_plusplus.realmspp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealmsPPInit
{
	public static final String MODID = "realmspp";
	public static final Logger LOGGER = LoggerFactory.getLogger("Realms++");
	public static ModPlatform PLATFORM = null;

	public static void entrypoint(ModPlatform platform) {
		RealmsPPInit.PLATFORM = platform;
		LOGGER.info("Started mod in %s loader".formatted(RealmsPPInit.PLATFORM.getModloader()));
	}
}