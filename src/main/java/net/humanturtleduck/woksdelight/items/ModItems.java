package net.humanturtleduck.woksdelight.items;


import net.humanturtleduck.woksdelight.WoksDelight;
import net.minecraft.client.Minecraft;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WoksDelight.MOD_ID);

    public static final FoodProperties imitation_crab_edible = new FoodProperties.Builder()
            .nutrition(0)
            .saturationMod(0)
            .meat()
            .build();



    public static final RegistryObject<Item> imitation_crab = ITEMS.register("imitation_crab",
            ()-> new Item(new Item.Properties().food(imitation_crab_edible)));
    public static final RegistryObject<Item> wok = ITEMS.register("wok",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
