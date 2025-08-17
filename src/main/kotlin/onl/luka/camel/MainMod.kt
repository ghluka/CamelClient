package onl.luka.camel

import net.fabricmc.api.ModInitializer

class MainMod : ModInitializer {
    val ID: String = "@MOD_ID@"
    val NAME: String = "@MOD_NAME@"
    val VERSION: String = "@MOD_VERSION@"

    override fun onInitialize() {
        println("Test")
    }
}