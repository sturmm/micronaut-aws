plugins {
    id("io.micronaut.build.internal.aws-module")
}

dependencies {
    compileOnly(mn.micronaut.runtime)
    implementation(mn.micronaut.jackson.databind)
    testImplementation(mn.micronaut.runtime)
}
