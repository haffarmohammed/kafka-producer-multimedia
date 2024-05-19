plugins {
    id("java")
}

group = "fr.mhaffar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients
    implementation("org.apache.kafka:kafka-clients:3.3.1")

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:2.0.13")

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-simple
    implementation("org.slf4j:slf4j-simple:2.0.13")

    // https://central.sonatype.com/artifact/org.opensearch.client/opensearch-rest-high-level-client/overview
    implementation("org.opensearch.client:opensearch-rest-high-level-client:2.14.0")

    // https://central.sonatype.com/artifact/com.google.code.gson/gson
    implementation("com.google.code.gson:gson:2.11.0")
}

tasks.test {
    useJUnitPlatform()
}