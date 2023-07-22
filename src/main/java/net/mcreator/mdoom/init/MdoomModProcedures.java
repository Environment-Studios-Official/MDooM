
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mdoom.init;

import net.mcreator.mdoom.procedures.HeavyGunUsagePoslieIspolzovaniiaSnariadaProcedure;
import net.mcreator.mdoom.procedures.HeavyGunPriShchielchkiePKMProcedure;
import net.mcreator.mdoom.procedures.CruciblePriShchielchkiePKMPoBlokuProcedure;
import net.mcreator.mdoom.procedures.CruciblePriPoluchieniiPriedmietaPoRietsieptuProcedure;
import net.mcreator.mdoom.procedures.CrucibleKazhdyiTikVRukieProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class MdoomModProcedures {
	public static void load() {
		new CruciblePriPoluchieniiPriedmietaPoRietsieptuProcedure();
		new CruciblePriShchielchkiePKMPoBlokuProcedure();
		new HeavyGunPriShchielchkiePKMProcedure();
		new HeavyGunUsagePoslieIspolzovaniiaSnariadaProcedure();
		new CrucibleKazhdyiTikVRukieProcedure();
	}
}
