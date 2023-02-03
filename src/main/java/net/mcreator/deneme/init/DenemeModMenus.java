
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deneme.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.deneme.world.inventory.AbcMenu;
import net.mcreator.deneme.DenemeMod;

public class DenemeModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DenemeMod.MODID);
	public static final RegistryObject<MenuType<AbcMenu>> ABC = REGISTRY.register("abc", () -> IForgeMenuType.create(AbcMenu::new));
}
