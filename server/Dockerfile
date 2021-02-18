FROM maven:3.6.3-jdk-11-slim

WORKDIR /server
COPY . /server

COPY entrypoint.sh /usr/local/bin/entrypoint.sh
RUN apt-get update && apt-get install dos2unix && dos2unix /usr/local/bin/entrypoint.sh && chmod +x /usr/local/bin/entrypoint.sh

RUN ["mvn","package","-DskipTests=true"]
#Start application
# WORKDIR /usr/src/mymaven
ENTRYPOINT ["/usr/local/bin/entrypoint.sh"]
CMD ["bash"]
