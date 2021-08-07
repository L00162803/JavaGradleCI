/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.1.1/samples
 */

description = """
Example Gradle project demonstrating the Gradle build for a java app
Project name: ${project.name}
"""

plugins{
    // Apply the application plugin for java
    application
}

repositories{
    // Use Maven to get the libs
    mavenCentral()
}

dependencies{
    // Specify testNG framework
    testImplementation("org.testng:testng:7.4.0")

    // also uses google guava library
    implementation("com.google.guava:guava:30.0-jre")
}

application{
    // Define the main class for the application
    mainClass.set("GradleDemo.App")
}

tasks.test{
    // Use testng for unit tests
    useTestNG()
}