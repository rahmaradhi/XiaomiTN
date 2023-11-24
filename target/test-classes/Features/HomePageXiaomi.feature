#Author: RADHI Rahma
Feature: Home page xiaomi

  Scenario: Selectionner le menu Maison Connecte
    Given  Utilisateur est sur la page d acceuil
    When Utilisateur survole la souris sur le menu "Smart Home" et clique sur le submenu "Maison connectée" 
    Then Utilisateur est dirige vers la page "Maison Connectée"

