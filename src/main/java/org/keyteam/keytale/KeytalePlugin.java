package org.keyteam.keytale;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

import javax.annotation.Nonnull;

public class KeytalePlugin extends JavaPlugin {

    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();
    private static KeytalePlugin instance;

    public KeytalePlugin(@NonNullDecl JavaPluginInit init) {
        super(init);
        LOGGER.atInfo().log("Initializing " + this.getName() + " version " + this.getManifest().getVersion().toString());
        instance = this;
    }

    @Override
    protected void setup() {
        LOGGER.atInfo().log("Setting up plugin " + this.getName());
    }

    @Nonnull
    public static KeytalePlugin get() {
        return instance;
    }

    public static HytaleLogger getHytaleLogger() {
        return LOGGER;
    }
}
