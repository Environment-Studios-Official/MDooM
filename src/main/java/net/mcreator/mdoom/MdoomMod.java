/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.mdoom;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.mdoom.init.MdoomModProcedures;
import net.mcreator.mdoom.init.MdoomModItems;
import net.mcreator.mdoom.init.MdoomModEntities;

import net.fabricmc.api.ModInitializer;

public class MdoomMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "mdoom";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing MdoomMod");

		MdoomModEntities.load();

		MdoomModItems.load();

		MdoomModProcedures.load();

	}
}
