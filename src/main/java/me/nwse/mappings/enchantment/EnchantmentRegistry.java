package me.nwse.mappings.enchantment;

import org.bukkit.enchantments.Enchantment;

import java.util.HashMap;
import java.util.Map;

import static me.nwse.mappings.enchantment.ServerVersionUtil.*;
import static me.nwse.mappings.enchantment.ServerVersionUtil.ServerVersion.*;

public final class EnchantmentRegistry {

    private static final Map<String, Enchantment> NAMESPACE_MAPPINGS = new HashMap<String, Enchantment>() {
        {
            /* Legacy enchantments */
            if (isEqualOrNewerThan(MC_1_8)) {
                put("aqua_affinity", Enchantment.WATER_WORKER);
                put("bane_of_arthropods", Enchantment.DAMAGE_ARTHROPODS);
                put("blast_protection", Enchantment.PROTECTION_EXPLOSIONS);
                put("depth_strider", Enchantment.DEPTH_STRIDER);
                put("efficiency", Enchantment.DIG_SPEED);
                put("feather_falling", Enchantment.PROTECTION_FALL);
                put("fire_aspect", Enchantment.FIRE_ASPECT);
                put("fire_protection", Enchantment.PROTECTION_FIRE);
                put("flame", Enchantment.ARROW_FIRE);
                put("fortune", Enchantment.LOOT_BONUS_BLOCKS);
                put("knockback", Enchantment.KNOCKBACK);
                put("looting", Enchantment.LOOT_BONUS_MOBS);
                put("luck_of_the_sea", Enchantment.LUCK);
                put("lure", Enchantment.LURE);
                put("power", Enchantment.ARROW_DAMAGE);
                put("projectile_protection", Enchantment.PROTECTION_PROJECTILE);
                put("protection", Enchantment.PROTECTION_ENVIRONMENTAL);
                put("punch", Enchantment.ARROW_KNOCKBACK);
                put("respiration", Enchantment.OXYGEN);
                put("sharpness", Enchantment.DAMAGE_ALL);
                put("silk_touch", Enchantment.SILK_TOUCH);
                put("smite", Enchantment.DAMAGE_UNDEAD);
                put("thorns", Enchantment.THORNS);
                put("unbreaking", Enchantment.DURABILITY);
                put("infinity", Enchantment.ARROW_INFINITE);
            }

            /* 1.9 Enchantments */
            if (isEqualOrNewerThan(MC_1_9)) {
                put("frost_walker", Enchantment.getByName("FROST_WALKER"));
                put("mending", Enchantment.getByName("MENDING"));
            }

            /* 1.11 Enchantments */
            if (isEqualOrNewerThan(MC_1_11)) {
                put("binding_curse", Enchantment.getByName("BINDING_CURSE"));
                put("vanishing_curse", Enchantment.getByName("VANISHING_CURSE"));
            }

            /* 1.13 Enchantments */
            if (isEqualOrNewerThan(MC_1_13)) {
                put("channeling", Enchantment.getByName("CHANNELING"));
                put("impaling", Enchantment.getByName("IMPALING"));
                put("loyalty", Enchantment.getByName("LOYALTY"));
                put("riptide", Enchantment.getByName("RIPTIDE"));
            }

            /* 1.14 Enchantments */
            if (isEqualOrNewerThan(MC_1_14)) {
                put("multishot", Enchantment.getByName("MULTISHOT"));
                put("piercing", Enchantment.getByName("PIERCING"));
                put("quick_charge", Enchantment.getByName("QUICK_CHARGE"));
            }

            /* 1.16 Enchantments */
            if (isEqualOrNewerThan(MC_1_16)) {
                put("soul_speed", Enchantment.getByName("SOUL_SPEED"));
            }

            /* 1.19 Enchantments */
            if (isEqualOrNewerThan(MC_1_19)) {
                put("swift_sneak", Enchantment.getByName("SWIFT_SNEAK"));
            }
        }
    };

    public static Enchantment getByNamespace(String namespace) {
        return NAMESPACE_MAPPINGS.getOrDefault(namespace, null);
    }

}