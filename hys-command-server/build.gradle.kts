plugins {
    id("dev.slne.surf.surfapi.gradle.standalone")
}

dependencies {
    api(project(":hys-command-api"))
    compileOnly(files("../libs/HytaleServer.jar"))
}