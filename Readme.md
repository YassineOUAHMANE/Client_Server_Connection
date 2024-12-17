# 📜 Serveur de Proverbes en Java

Bienvenue dans ce projet simple où un **serveur** envoie un proverbe aléatoire à un **client** chaque fois qu'il se connecte. Le programme utilise des **Sockets TCP/IP** pour la communication entre un serveur et des clients.

---
## 📦 **Structure du projet**

```plaintext
projet/
│
├── ServeurProverbe.java   # Le serveur qui envoie des proverbes
├── ClientProverbe.java    # Le client qui reçoit les proverbes
└── README.md              # Ce fichier d'explication
```
---

## 🚀 **Fonctionnalités**

- 🖥️ **Serveur** qui envoie un proverbe aléatoire parmi une liste prédéfinie.
- 🤝 **Client** qui se connecte au serveur pour recevoir un proverbe.
- 🔄 Communication basée sur le protocole **TCP/IP**.

---

## 🛠️ **Technologies utilisées**

- 💻 **Langage** : Java
- 🌐 **Réseau** : Sockets TCP/IP
- 🎲 **Utilisation de la bibliothèque Random** pour la génération aléatoire.

---



## ⚙️Prérequis
Avant de lancer le projet, assurez-vous d'avoir :

🔹 Java Development Kit (JDK) installé (version 8+).
🔹 Un éditeur de texte (IntelliJ, Eclipse, VS Code, etc.).
🔹 Une console (Terminal ou CMD).

---

## 🚦 Instructions d'exécution
---
### 1️⃣ Compilation des fichiers
Dans le terminal, compilez les deux fichiers Java :

```bash
javac ServeurProverbe.java ClientProverbe.java 
```
---
### 2️⃣ Lancer le serveur
Exécutez le fichier ServeurProverbe pour démarrer le serveur :
```bash
java ServeurProverbe
```
---
### 3️⃣ Lancer le client
Dans une autre fenêtre de terminal, exécutez ClientProverbe pour vous connecter au serveur :
```bash
java ClientProverbe
```
---
## 📋 Exemple de sortie
### Serveur :
```plaintext
Serveur en attente de connexions...
Client connecté : /127.0.0.1
Proverbe envoyé et client déconnecté.

```
### Client :
```plaintext
Connecté au serveur.
Message reçu du serveur : Proverbe du jour : "Le bonheur est un choix."


```
## 📚 Concepts abordés
🚀 Programmation réseau avec sockets.
🔄 Communication client-serveur via TCP/IP.
🎲 Génération aléatoire de données.
🧹 Gestion des flux InputStream et OutputStream.




