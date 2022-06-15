
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chaoscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.chaoscraft.item.EnderiteStickItem;
import net.mcreator.chaoscraft.item.EnderiteItem;
import net.mcreator.chaoscraft.item.EnderStarPickaxeItem;
import net.mcreator.chaoscraft.item.EnderStaffItem;
import net.mcreator.chaoscraft.item.EnderLightSwordItem;
import net.mcreator.chaoscraft.item.DirtTotemItem;
import net.mcreator.chaoscraft.item.CobaltiumItem;
import net.mcreator.chaoscraft.ChaoscraftMod;

public class ChaoscraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChaoscraftMod.MODID);
	public static final RegistryObject<Item> COBALTIUM = REGISTRY.register("cobaltium", () -> new CobaltiumItem());
	public static final RegistryObject<Item> ENDER_STAFF = REGISTRY.register("ender_staff", () -> new EnderStaffItem());
	public static final RegistryObject<Item> ENDERITE = REGISTRY.register("enderite", () -> new EnderiteItem());
	public static final RegistryObject<Item> ENDER_STAR_PICKAXE = REGISTRY.register("ender_star_pickaxe", () -> new EnderStarPickaxeItem());
	public static final RegistryObject<Item> ENDERITE_STICK = REGISTRY.register("enderite_stick", () -> new EnderiteStickItem());
	public static final RegistryObject<Item> ENDER_LIGHT_SWORD = REGISTRY.register("ender_light_sword", () -> new EnderLightSwordItem());
	public static final RegistryObject<Item> EARTH_GUARDIAN = REGISTRY.register("earth_guardian_spawn_egg",
			() -> new ForgeSpawnEggItem(ChaoscraftModEntities.EARTH_GUARDIAN, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DIRT_TOTEM = REGISTRY.register("dirt_totem", () -> new DirtTotemItem());
}
