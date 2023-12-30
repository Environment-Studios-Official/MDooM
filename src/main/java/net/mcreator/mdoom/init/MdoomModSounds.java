
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mdoom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mdoom.MdoomMod;

public class MdoomModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MdoomMod.MODID);
	public static final RegistryObject<SoundEvent> THE_TRIAL_OF_MALIGOGG = REGISTRY.register("the_trial_of_maligogg", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mdoom", "the_trial_of_maligogg")));
	public static final RegistryObject<SoundEvent> FAUST = REGISTRY.register("faust", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mdoom", "faust")));
}
