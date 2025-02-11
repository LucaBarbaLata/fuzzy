
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fuzzy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.fuzzy.item.StrawberrysItem;
import net.mcreator.fuzzy.item.StarryArmorItem;
import net.mcreator.fuzzy.item.PencilItem;
import net.mcreator.fuzzy.item.OreoItem;
import net.mcreator.fuzzy.item.Oreo6xBiscuitsItem;
import net.mcreator.fuzzy.item.OiOiOiItem;
import net.mcreator.fuzzy.item.MossySteakItem;
import net.mcreator.fuzzy.item.MossyBeefItem;
import net.mcreator.fuzzy.item.MintItem;
import net.mcreator.fuzzy.item.LycheeItem;
import net.mcreator.fuzzy.item.LagsChipsItem;
import net.mcreator.fuzzy.item.CutiItem;
import net.mcreator.fuzzy.item.CuteCreaturesItem;
import net.mcreator.fuzzy.item.CirozaItem;
import net.mcreator.fuzzy.item.ChocoBarItem;
import net.mcreator.fuzzy.item.ChipItem;
import net.mcreator.fuzzy.item.BlueArmorItem;
import net.mcreator.fuzzy.item.BlueAppleItem;
import net.mcreator.fuzzy.item.BlockersCandyBarItem;
import net.mcreator.fuzzy.item.BlackBreadItem;
import net.mcreator.fuzzy.item.AppleArmorItem;
import net.mcreator.fuzzy.FuzzyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FuzzyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FuzzyMod.MODID);
	public static final RegistryObject<Item> CUTI_BUCKET = REGISTRY.register("cuti_bucket", () -> new CutiItem());
	public static final RegistryObject<Item> CIROZA = REGISTRY.register("ciroza", () -> new CirozaItem());
	public static final RegistryObject<Item> CUTE_CREATURES = REGISTRY.register("cute_creatures", () -> new CuteCreaturesItem());
	public static final RegistryObject<Item> STRAWBERRYS = REGISTRY.register("strawberrys", () -> new StrawberrysItem());
	public static final RegistryObject<Item> STARRY_ARMOR_HELMET = REGISTRY.register("starry_armor_helmet", () -> new StarryArmorItem.Helmet());
	public static final RegistryObject<Item> STARRY_ARMOR_CHESTPLATE = REGISTRY.register("starry_armor_chestplate", () -> new StarryArmorItem.Chestplate());
	public static final RegistryObject<Item> STARRY_ARMOR_LEGGINGS = REGISTRY.register("starry_armor_leggings", () -> new StarryArmorItem.Leggings());
	public static final RegistryObject<Item> STARRY_ARMOR_BOOTS = REGISTRY.register("starry_armor_boots", () -> new StarryArmorItem.Boots());
	public static final RegistryObject<Item> LYCHEE = REGISTRY.register("lychee", () -> new LycheeItem());
	public static final RegistryObject<Item> BIANAL_SPAWN_EGG = REGISTRY.register("bianal_spawn_egg", () -> new ForgeSpawnEggItem(FuzzyModEntities.BIANAL, -13108, -52276, new Item.Properties()));
	public static final RegistryObject<Item> LABUSHA_SPAWN_EGG = REGISTRY.register("labusha_spawn_egg", () -> new ForgeSpawnEggItem(FuzzyModEntities.LABUSHA, -16777216, -65383, new Item.Properties()));
	public static final RegistryObject<Item> MOSSHEEP_SPAWN_EGG = REGISTRY.register("mossheep_spawn_egg", () -> new ForgeSpawnEggItem(FuzzyModEntities.MOSSHEEP, -16751104, -16711936, new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_BEEF = REGISTRY.register("mossy_beef", () -> new MossyBeefItem());
	public static final RegistryObject<Item> BLUE_APPLE = REGISTRY.register("blue_apple", () -> new BlueAppleItem());
	public static final RegistryObject<Item> MINT = REGISTRY.register("mint", () -> new MintItem());
	public static final RegistryObject<Item> BLOCKERS_CANDY_BAR = REGISTRY.register("blockers_candy_bar", () -> new BlockersCandyBarItem());
	public static final RegistryObject<Item> OREO_6X_BISCUITS = REGISTRY.register("oreo_6x_biscuits", () -> new Oreo6xBiscuitsItem());
	public static final RegistryObject<Item> LAGS_CHIPS = REGISTRY.register("lags_chips", () -> new LagsChipsItem());
	public static final RegistryObject<Item> CHIP = REGISTRY.register("chip", () -> new ChipItem());
	public static final RegistryObject<Item> BLACK_BREAD = REGISTRY.register("black_bread", () -> new BlackBreadItem());
	public static final RegistryObject<Item> OREO = REGISTRY.register("oreo", () -> new OreoItem());
	public static final RegistryObject<Item> CHOCO_BAR = REGISTRY.register("choco_bar", () -> new ChocoBarItem());
	public static final RegistryObject<Item> MOSSY_STEAK = REGISTRY.register("mossy_steak", () -> new MossySteakItem());
	public static final RegistryObject<Item> PENCIL = REGISTRY.register("pencil", () -> new PencilItem());
	public static final RegistryObject<Item> OI_OI_OI = REGISTRY.register("oi_oi_oi", () -> new OiOiOiItem());
	public static final RegistryObject<Item> APPLE_ARMOR_HELMET = REGISTRY.register("apple_armor_helmet", () -> new AppleArmorItem.Helmet());
	public static final RegistryObject<Item> APPLE_ARMOR_CHESTPLATE = REGISTRY.register("apple_armor_chestplate", () -> new AppleArmorItem.Chestplate());
	public static final RegistryObject<Item> APPLE_ARMOR_LEGGINGS = REGISTRY.register("apple_armor_leggings", () -> new AppleArmorItem.Leggings());
	public static final RegistryObject<Item> APPLE_ARMOR_BOOTS = REGISTRY.register("apple_armor_boots", () -> new AppleArmorItem.Boots());
	public static final RegistryObject<Item> BLUE_ARMOR_HELMET = REGISTRY.register("blue_armor_helmet", () -> new BlueArmorItem.Helmet());
	public static final RegistryObject<Item> BLUE_ARMOR_CHESTPLATE = REGISTRY.register("blue_armor_chestplate", () -> new BlueArmorItem.Chestplate());
	public static final RegistryObject<Item> BLUE_ARMOR_LEGGINGS = REGISTRY.register("blue_armor_leggings", () -> new BlueArmorItem.Leggings());
	public static final RegistryObject<Item> BLUE_ARMOR_BOOTS = REGISTRY.register("blue_armor_boots", () -> new BlueArmorItem.Boots());
	public static final RegistryObject<Item> AQUATIC_SHEEP_SPAWN_EGG = REGISTRY.register("aquatic_sheep_spawn_egg", () -> new ForgeSpawnEggItem(FuzzyModEntities.AQUATIC_SHEEP, -16737895, -16737793, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(CIROZA.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
