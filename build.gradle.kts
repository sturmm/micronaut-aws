plugins {
    id("io.micronaut.build.internal.docs")
    id("io.micronaut.build.internal.dependency-updates")
    id("io.micronaut.build.internal.quality-reporting")
}

repositories {
    mavenCentral()
    maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots/")
}
