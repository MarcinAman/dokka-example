import org.jetbrains.dokka.gradle.DokkaTask
import java.net.URL

plugins {
    id("java")
    id("org.jetbrains.kotlin.multiplatform") version "1.3.72"
    id("org.jetbrains.dokka") version "1.4.10.2"
}

buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.dokka:dokka-base:1.4.10.2")
    }
}

group = "org.jetbrains.dokka"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
    mavenLocal()
    jcenter()
}

dependencies {
    testImplementation(group ="junit", name = "junit", version = "4.12")
//    dokkaPlugins("org.jetbrains.dokka:mathjax-plugin:0.11.0-SNAPSHOT")
}

kotlin {
    jvm()
    js()
    linuxX64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }

        val jvmAndJsSecondCommonMain by creating {
            dependsOn(commonMain)
        }

        val jvmMain by getting {
            dependsOn(jvmAndJsSecondCommonMain)
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }

        val jsMain by getting {
            dependsOn(jvmAndJsSecondCommonMain)
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        val linuxX64Main by getting{
            dependsOn(commonMain)
        }
    }
}

tasks {
    val dokkaOutputDir = File("$buildDir/dokka")

    val clean = getByName("clean", Delete::class){
        delete(rootProject.buildDir)
        delete(dokkaOutputDir)
    }

    val dokkaHtml by getting(DokkaTask::class) {
        dependsOn(clean)

        outputDirectory.set(dokkaOutputDir)

        dokkaSourceSets {
            val jsMain by getting {
                includes.from(listOf("src/jsMain/resources/doc.md"))

                samples.from(listOf("src/jsMain/resources/Samples.kt"))

                sourceLink {localDirectory
                    localDirectory.set(File("src/jsMain/kotlin"))
                    remoteUrl.set(URL("https://github.com/kamilok1965/dokka-example/tree/master/src/jsMain/kotlin"))
                }
            }

            val jvmMain by getting {
                includes.from(listOf("src/jvmMain/resources/doc.md"))

                samples.from(listOf("src/jsMain/resources/Samples.kt"))

                sourceLink {
                    localDirectory.set(File("src/jvmMain/kotlin"))
                    remoteUrl.set(URL("https://github.com/kamilok1965/dokka-example/tree/master/src/jvmMain/kotlin"))
                }
            }

            val linuxX64Main by getting {
                sourceLink {
                    localDirectory.set(File("src/linuxX64Main/kotlin"))
                    remoteUrl.set(URL("https://github.com/kamilok1965/dokka-example/tree/master/src/linuxX64Main/kotlin"))
                }
            }
        }

        pluginConfiguration<org.jetbrains.dokka.base.DokkaBase, org.jetbrains.dokka.base.DokkaBaseConfiguration> {
            customStyleSheets = listOf(file("logo-styles.css"))
        }
    }
}
