plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
    `maven-publish`
}

group = "bsky4j-stream"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(uri("https://jitpack.io"))
}

dependencies {

    // Bsky4jCore
    implementation(project(":core"))

    // Library
    implementation("com.github.uakihir0:JLogger:1.4")
    implementation("com.google.code.gson:gson:2.8.2")
    implementation("com.github.ipld:java-cid:1.3.1")
    implementation("co.nstant.in:cbor:0.9")

    // Test
    testImplementation("junit:junit:4.13.2")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}