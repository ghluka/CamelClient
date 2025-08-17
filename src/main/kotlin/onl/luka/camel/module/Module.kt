package onl.luka.camel.module

import onl.luka.camel.MainMod
import org.polyfrost.oneconfig.api.config.v1.Config


open class Module(name:String) : Config("camel.${name.replace(" ", "").lowercase()}.json", MainMod.NAME, Category.HYPIXEL) {

}