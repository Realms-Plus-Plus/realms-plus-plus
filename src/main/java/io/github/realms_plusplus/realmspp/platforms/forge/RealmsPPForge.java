//? if forge {
/*package io.github.realms_plusplus.realmspp.platforms.forge;

import io.github.realms_plusplus.realmspp.ConfigScreen;
import io.github.realms_plusplus.realmspp.RealmsPPInit;
import io.github.realms_plusplus.realmspp.ModPlatform;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod("realmspp")
public class RealmsPPForge {
	public RealmsPPForge() {
		RealmsPPInit.entrypoint(new ForgePlatform());
        MinecraftForge.registerConfigScreen(ConfigScreen::createConfigScreen);
	}
	public static class ForgePlatform implements ModPlatform {
		@Override
		public String getModloader() {
			return "LexForge";
		}

		@Override
		public boolean isModLoaded(String modId) {
			return ModList.get().isLoaded(modId);
		}
	}

}
*///?}