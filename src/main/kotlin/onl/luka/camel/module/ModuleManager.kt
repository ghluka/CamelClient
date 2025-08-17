package onl.luka.camel.module

import onl.luka.camel.module.modules.*
import org.polyfrost.oneconfig.api.config.v1.Config
import java.util.Collections

class ModuleManager {
    val modules = ArrayList<Module>()
    //lateinit var modulesList: ModulesList
    //lateinit var targetHud: TargetHud

    init {
        Collections.addAll(modules,
            /* Dev */
            Template()
        )
    }

    fun getModuleByName(name: String): Module? {
        modules.forEach() { mod ->
            if (mod.title == name)
                return mod
        }
        return null
    }

    fun save() {
        modules.forEach() { mod ->
            mod.save()
        }
        //modulesList.save()
    }
}