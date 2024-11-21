# Utiliser une image officielle de Java 17
FROM openjdk:17-jdk-slim

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier JAR généré dans le conteneur
COPY target/myartifactid-0.0-SNAPSHOT.jar app.jar

# Exposer le port (par défaut 8080 si c’est un projet Spring Boot ou similaire)
EXPOSE 8080

# Commande pour démarrer l'application
CMD ["java", "-jar", "app.jar"]
