package onl.luka.camel.module.modules

import onl.luka.camel.module.Module
import org.polyfrost.oneconfig.api.config.v1.annotations.Info
import org.polyfrost.oneconfig.api.config.v1.annotations.Keybind
import org.polyfrost.oneconfig.api.config.v1.annotations.Switch
import org.polyfrost.oneconfig.api.ui.v1.keybind.KeybindManager
import org.polyfrost.oneconfig.api.ui.v1.keybind.KeybindManager.registerKeybind
import org.polyfrost.polyui.input.KeyBinder
import org.polyfrost.polyui.input.KeybindHelper
import org.polyfrost.polyui.input.Keys

class Template : Module(NAME) {
    companion object {
        const val NAME = "Template"
        const val DESCRIPTION = "Test module"
        const val CATEGORY = "Dev"
    }

    @Info(title = DESCRIPTION, icon = "", description = "", category = CATEGORY, subcategory = NAME)
    val info = null

    @Switch(title = "", description = "Enable $NAME", icon = "", category = CATEGORY, subcategory = NAME)
    var enabled: Boolean = false
    //@Keybind(title = "Toggle keybind", description = "", icon = "", category = CATEGORY, subcategory = NAME)
    //var keybind: KeyBinder.Bind = KeybindHelper.builder().keys(Keys.F7).does {
    //    enabled = !enabled
    //}.build()

    init {
        //registerKeybind(keybind);
    }
}