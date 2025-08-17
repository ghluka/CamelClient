plugins {
    id("dev.deftu.gradle.multiversion-root")
}

preprocess {
    "1.21.5-fabric"(1_21_05, "yarn") {
        "1.21.5-neoforge"(1_21_05, "srg")
    }
    strictExtraMappings.set(true)
}