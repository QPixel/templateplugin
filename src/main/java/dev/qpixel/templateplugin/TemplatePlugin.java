package dev.qpixel.templateplugin;

import dev.qpixel.helios.api.HeliosPlugin;

public final class TemplatePlugin extends HeliosPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        heliosAPI.init(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
