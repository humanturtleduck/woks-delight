package net.humanturtleduck.woksdelight.items;

import net.humanturtleduck.woksdelight.WoksDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WoksDelight.MOD_ID);
    public static final RegistryObject<CreativeModeTab> WOKSDELIGHT_TAB = CREATIVE_MODE_TABS.register("woksdelight_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.wok.get()))
                    .title(Component.translatable("creativetab.woksdelight_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //load items into custom creative mod tab
                        pOutput.accept(ModItems.wok.get());
                        pOutput.accept(ModItems.imitation_crab.get());

                    })
                    .build());
    public static void register (IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
