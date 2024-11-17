# HelloToast_ViewModel
# Projet de Comparaison : Applications Increment, Decrement, Reset avec ViewModel et sans ViewModel

Ce projet compare deux implémentations Android pour une application qui utilise des boutons **Increment**, **Decrement** et **Reset**. L'objectif est de démontrer les avantages et les inconvénients d'utiliser **ViewModel** en combinaison avec **LiveData** et **SavedStateHandle**, par rapport à une implémentation sans ViewModel.

## Fonctionnalités
- **Boutons :**
  - **Increment** : Augmente le compteur.
  - **Decrement** : Diminue le compteur.
  - **Reset** : Réinitialise le compteur à zéro.
- **Persistance des données :**
  - Avec ViewModel et LiveData pour une gestion réactive.
  - Utilisation de SavedStateHandle pour conserver l'état après la destruction de l'activité.
  - Comparaison avec une approche sans ViewModel.

---

## Structure du Projet

### 1. Application Sans ViewModel
- **Données gérées directement dans l'activité**.
- Problèmes potentiels : 
  - Perte de données lors des changements de configuration (rotation de l'écran).
  - Difficulté à maintenir et tester.

### 2. Application Avec ViewModel
- **Données gérées dans un ViewModel**.
- **LiveData** utilisé pour observer et réagir aux changements d'état.
- **SavedStateHandle** utilisé pour restaurer l'état après la destruction du viewmodel.
- Avantages :
  - Gestion efficace du cycle de vie.
  - Meilleure séparation des responsabilités (Architecture MVVM).
  - Persistance automatique des données.

---

## Technologies et Outils Utilisés
- **Langage** : Java.
- **Framework** : Android SDK.
- **Composants Jetpack** :
  - ViewModel
  - LiveData
  - SavedStateHandle
- **IDE** : Android Studio.

---


https://github.com/user-attachments/assets/1d43fcb3-b93a-434e-93cf-dad540327c8c



https://github.com/user-attachments/assets/05d6e48b-23b9-4de5-b85a-4126b29c3064




