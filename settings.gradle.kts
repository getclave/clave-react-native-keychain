rootProject.name = "clave-rn-keychain"

include(":library")
project(":library").projectDir = File(rootProject.projectDir, "./android")

// androidx, ReactNative 0.60+
includeBuild("KeychainExample/android")
