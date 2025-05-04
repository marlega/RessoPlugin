plugins {
    java
    alias(libs.plugins.lavalink)
}

group = "com.marlega"
version = "1.1.1"

lavalinkPlugin {
    name = "resso-plugin"
    apiVersion = libs.versions.lavalink.api
    serverVersion = libs.versions.lavalink.server
}
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
}

dependencies {
    // add your dependencies here
}
