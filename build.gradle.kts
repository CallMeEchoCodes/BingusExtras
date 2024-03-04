plugins {
    id("fabric-loom") version "1.5-SNAPSHOT"
}

repositories {
    maven("https://maven.wispforest.io") {
        name = "Wisp Forest"
    }
    maven("https://maven.ladysnake.org/releases") {
        name = "Ladysnake Libs"
    }
    maven("https://maven.terraformersmc.com/") {
        name = "TerraformersMC"
    }
    maven("https://jitpack.io")
    maven("https://maven.jamieswhiteshirt.com/libs-release")
}

java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

base.archivesName.set(project.property("archivesBaseName") as String)
version = project.property("modVersion") as String
group = project.property("mavenGroup") as String

sourceSets {
    main {
        resources {
            srcDir(file("src/main/generated"))
        }
    }
}

dependencies {
    minecraft("com.mojang:minecraft:${project.property("minecraftVersion")}")
    mappings("net.fabricmc:yarn:${project.property("yarnMappings")}:v2")
    modImplementation("net.fabricmc:fabric-loader:${project.property("loaderVersion")}")

    modImplementation("net.fabricmc.fabric-api:fabric-api:${project.property("fabricApiVersion")}")
    modImplementation("io.wispforest:owo-lib:${project.property("owoVersion")}")
    modImplementation("dev.emi:trinkets:${project.property("trinketsVersion")}")
    modImplementation("dev.onyxstudios.cardinal-components-api:cardinal-components-base:${project.property("ccaVersion")}")
    modImplementation("dev.onyxstudios.cardinal-components-api:cardinal-components-entity:${project.property("ccaVersion")}")
    include(modImplementation("com.jamieswhiteshirt:reach-entity-attributes:${project.property("reaVersion")}") as Any)
//    modCompileOnly("dev.emi:emi-fabric:${project.property("emiVersion")}+${project.property("minecraftVersion")}:api")
//    modLocalRuntime("dev.emi:emi-fabric:${project.property("emiVersion")}+${project.property("minecraftVersion")}")
}

loom {
    runs {
        create("datagen") {
            client()
            name("Minecraft Data")
            vmArg("-Dfabric-api.datagen")
            vmArg("-Dfabric-api.datagen.output-dir=${file("src/main/generated")}")
            vmArg("-Dfabric-api.datagen.modid=bingusextras")

            runDir("build/datagen")
        }
    }
}

tasks {
    processResources {
        inputs.property("version", project.version)

        filesMatching("fabric.mod.json") {
            expand("version" to project.version)
        }
    }

    withType<JavaCompile> {
        options.release.set(java.targetCompatibility.majorVersion.toInt())
    }

    java {
        withSourcesJar()
    }

    jar {
        from("LICENSE") {
            rename { "${it}_${base.archivesName.get()}" }
        }
    }
}

java {
    withSourcesJar()
}