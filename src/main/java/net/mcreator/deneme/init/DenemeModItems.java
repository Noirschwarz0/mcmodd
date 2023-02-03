
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deneme.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.deneme.item.SteamItem;
import net.mcreator.deneme.DenemeMod;

public class DenemeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DenemeMod.MODID);
	public static final RegistryObject<Item> STEAM_BUCKET = REGISTRY.register("steam_bucket", () -> new SteamItem());
}
