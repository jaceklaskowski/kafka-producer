val kafkaVersion = "0.8.3-SNAPSHOT"

scalaVersion := "2.11.7"

resolvers += Resolver.mavenLocal

libraryDependencies += "org.apache.kafka" % "kafka-clients" % kafkaVersion
