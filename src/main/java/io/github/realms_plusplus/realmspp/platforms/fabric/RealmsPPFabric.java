//? if fabric {
/*package io.github.realms_plusplus.realmspp.platforms.fabric;

import io.github.realms_plusplus.realmspp.ModPlatform;
import net.fabricmc.api.ModInitializer;
import io.github.realms_plusplus.realmspp.RealmsPPInit;
import net.fabricmc.loader.api.FabricLoader;

public class RealmsPPFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		RealmsPPInit.entrypoint(new FabricPlatform());
	}
	public static class FabricPlatform implements ModPlatform{

		@Override
		public String getModloader() {
			return "Fabric";
		}

		@Override
		public boolean isModLoaded(String modloader) {
			return FabricLoader.getInstance().isModLoaded(modloader);
		}
	}
}
*///?}