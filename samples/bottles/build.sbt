scalaVersion := "2.10.3"

name := "bottleSample"

organization in ThisBuild := "org.squbs.bottles"

version in ThisBuild := "0.0.2-SNAPSHOT"

publishArtifact := false

checksums in ThisBuild := Nil

lazy val bottlemsgs = project

lazy val bottlecube = project dependsOn bottlemsgs

lazy val bottlesvc = project dependsOn (bottlemsgs, bottlecube)

fork in ThisBuild := true

publishArtifact := false