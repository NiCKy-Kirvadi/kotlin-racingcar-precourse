plugins {
    kotlin("jvm") version "1.9.24"
    application
}

application {
    mainClass.set("racingcar.ApplicationKt")  // This is the entry point of your program
}

group = "camp.nextstep.edu"
version = "1.0-SNAPSHOT"

kotlin {
    jvmToolchain(21)
}

repositories {
    
    mavenCentral()
    maven { setUrl("https://jitpack.io") }
}

dependencies {
    implementation("com.github.woowacourse-projects:mission-utils:1.2.0")
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.2")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
