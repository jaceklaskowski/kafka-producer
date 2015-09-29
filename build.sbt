val kafkaVersion = "0.9.0.0-SNAPSHOT"
scalaVersion := "2.11.7"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % kafkaVersion
resolvers += Resolver.mavenLocal
