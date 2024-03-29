FROM maven:3.6.3-jdk-8

COPY . /usr/src/app
WORKDIR /usr/src/app

RUN useradd -m -u 1000 builder
RUN chown -R builder /usr/src/app
USER builder

RUN mvn clean compile

