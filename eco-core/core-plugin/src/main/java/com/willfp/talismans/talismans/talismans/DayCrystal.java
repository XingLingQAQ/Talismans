package com.willfp.talismans.talismans.talismans;

import com.willfp.talismans.talismans.Talisman;
import com.willfp.talismans.talismans.TalismanLevel;
import com.willfp.talismans.talismans.Talismans;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Trident;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.jetbrains.annotations.NotNull;

public class DayCrystal extends Talisman {
    public DayCrystal() {
        super("day");
    }

    @Override
    public void onMeleeAttack(@NotNull final TalismanLevel level,
                              @NotNull final Player attacker,
                              @NotNull final LivingEntity victim,
                              @NotNull final EntityDamageByEntityEvent event) {
        if (!attacker.getWorld().getEnvironment().equals(World.Environment.NORMAL)) {
            return;
        }

        if (!(attacker.getWorld().getTime() < 12300 && attacker.getWorld().getTime() > 23850)) {
            return;
        }

        event.setDamage(event.getDamage() * (1 + (level.getConfig().getDouble(Talismans.CONFIG_LOCATION + "percent-more-damage")) / 100));
    }

    @Override
    public void onArrowDamage(@NotNull final TalismanLevel level,
                              @NotNull final Player attacker,
                              @NotNull final LivingEntity victim,
                              @NotNull final Arrow arrow,
                              @NotNull final EntityDamageByEntityEvent event) {
        if (!attacker.getWorld().getEnvironment().equals(World.Environment.NORMAL)) {
            return;
        }

        if (!(attacker.getWorld().getTime() < 12300 && attacker.getWorld().getTime() > 23850)) {
            return;
        }

        event.setDamage(event.getDamage() * (1 + (level.getConfig().getDouble(Talismans.CONFIG_LOCATION + "percent-more-damage")) / 100));
    }

    @Override
    public void onTridentDamage(@NotNull final TalismanLevel level,
                                @NotNull final Player attacker,
                                @NotNull final LivingEntity victim,
                                @NotNull final Trident trident,
                                @NotNull final EntityDamageByEntityEvent event) {
        if (!attacker.getWorld().getEnvironment().equals(World.Environment.NORMAL)) {
            return;
        }

        if (!(attacker.getWorld().getTime() < 12300 && attacker.getWorld().getTime() > 23850)) {
            return;
        }

        event.setDamage(event.getDamage() * (1 + (level.getConfig().getDouble(Talismans.CONFIG_LOCATION + "percent-more-damage")) / 100));
    }
}