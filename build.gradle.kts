

val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    application
    kotlin("jvm") version "1.7.20"
    id("io.ktor.plugin") version "2.1.2"
}

group = "com.example"
version = "0.0.1"
application {
    mainClass.set("com.example.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-netty-jvm:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")

//    implementation ("org.jetbrains.exposed:exposed-core")
//    implementation ("org.jetbrains.exposed:exposed-dao")
//    implementation ("org.jetbrains.exposed:exposed-jdbc")
//    implementation ("org.postgresql:postgresql")
//    implementation ("com.zaxxer:HikariCP")

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
    implementation("org.postgresql:postgresql:42.3.1")
    implementation ("com.zaxxer:HikariCP:5.0.0")
    implementation(kotlin("stdlib-js"))
    implementation("io.ktor:ktor-server-html-builder:$ktor_version")


}
