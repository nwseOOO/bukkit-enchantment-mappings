package me.nwse.mappings.enchantment;

import org.bukkit.Bukkit;

import java.util.Arrays;
import java.util.List;

final class ServerVersionUtil {

    private static final String SERVER_VERSION = Bukkit.getBukkitVersion().split("-")[0];
    private static final ServerVersion SERVER_VERSION_ENUM = Arrays.stream(ServerVersion.values())
            .filter(version -> version.versions.contains(SERVER_VERSION))
            .findAny().orElseThrow(() -> {throw new RuntimeException("No compatible server version found!");} );

    public static boolean isEqualOrNewerThan(ServerVersion serverVersion) {
        return (SERVER_VERSION_ENUM.index >= serverVersion.index);
    }

    public enum ServerVersion {
        MC_1_8(0, "1.8.3", "1.8.4", "1.8.5", "1.8.6", "1.8.7", "1.8.8"),
        MC_1_9(1, "1.9", "1.9.2", "1.9.4"),
        MC_1_11(2, "1.11", "1.11.1"),
        MC_1_13(3, "1.13", "1.13.1", "1.13.2"),
        MC_1_14(4, "1.14", "1.14.1", "1.14.2", "1.14.3", "1.14.4"),
        MC_1_16(5, "1.16.1", "1.16.2", "1.16.3", "1.16.4"),
        MC_1_19(6, "1.19", "1.19.1", "1.19.2", "1.19.3");

        private final int index;
        private final List<String> versions;

        ServerVersion(int index, String... versions) {
            this.index = index;
            this.versions = Arrays.asList(versions);
        }
    }

}