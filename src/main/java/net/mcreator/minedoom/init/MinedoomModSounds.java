
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minedoom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minedoom.MinedoomMod;

public class MinedoomModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MinedoomMod.MODID);
	public static final RegistryObject<SoundEvent> TRIAL_OF_MALIGOG = REGISTRY.register("trial_of_maligog", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("minedoom", "trial_of_maligog")));
	public static final RegistryObject<SoundEvent> FAUST = REGISTRY.register("faust", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("minedoom", "faust")));
}
