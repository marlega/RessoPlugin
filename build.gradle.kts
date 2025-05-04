
plugins {
    java
    id("dev.arbjerg.lavalink.gradle-plugin") version "1.0.15"
}

lavalinkPlugin {
    name.set("resso-plugin")
    version.set("0.1.0")
    serverVersion.set("4.0.6")
}

group = "com.marlega.plugin"
version = "0.1.0"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://maven.pkg.jetbrains.space/public/p/ktor/eap")
}

dependencies {
    compileOnly("dev.arbjerg.lavalink:plugin-api:4.0.6")
    implementation("org.slf4j:slf4j-api:2.0.7")
    implementation("ch.qos.logback:logback-classic:1.4.7")
    implementation("org.springframework:spring-context:6.0.11")
    implementation("org.jetbrains:annotations:24.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
    test {
        useJUnitPlatform()
    }
    jar {
        exclude("module-info.class")
    }
}
