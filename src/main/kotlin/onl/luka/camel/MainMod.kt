package onl.luka.camel

import net.fabricmc.api.ModInitializer
import onl.luka.camel.module.ModuleManager

class MainMod : ModInitializer {
    val ID: String = "@MOD_ID@"
    val NAME: String = "@MOD_NAME@"
    val VERSION: String = "@MOD_VERSION@"

    lateinit var moduleManager: ModuleManager

    override fun onInitialize() {
        moduleManager = ModuleManager()
    }

    companion object {
        val NAME: String = "@MOD_NAME@"
    }
}