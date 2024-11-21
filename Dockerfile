# Étape 1 : Utiliser une image Maven pour construire le projet
FROM maven:3.8.6-openjdk-17 AS build

# Copier les fichiers du projet dans l'image
WORKDIR /app
COPY . .

# Construire le fichier JAR
RUN mvn clean package -DskipTests

# Étape 2 : Utiliser une image Java légère pour exécuter l'application
FROM openjdk:17-jdk-slim

# Définir le répertoire de travail
WORKDIR /app

# Copier le fichier JAR généré depuis l'étape précédente
COPY --from=build /app/target/myartifactid-0.0-SNAPSHOT.jar app.jar

# Exposer le port utilisé par l'application
EXPOSE 8080

# Démarrer l'application
CMD ["java", "-jar", "app.jar"]
