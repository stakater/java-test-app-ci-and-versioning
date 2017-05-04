# WORK IN PROGRESS
FROM stakater/tomcat:8.5.11-alpine

#Tomcat location
WORKDIR /tomcat

# Output path relative to build context
ARG OUTPUT_PATH="outputs"
RUN rm -Rf webapps/*

ADD ${OUTPUT_PATH}/*.war webapps/ROOT.war

EXPOSE 8080
# Use baseimage-docker's init system.