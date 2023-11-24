#Author: RADHI Rahma
Feature: Maison connecte

  Scenario: Effectuer le tri et cliquer sur un produit
    Given Utilisateur est sur la page de maison connecte
    When utilisateur effectue le tri par " Tri par popularité" et clique sur le produit "Mi Wireless Outdoor Security Camera 1080p Set"
    Then Utilisateur est dirige vers la page du produit "Mi Wireless Outdoor Security Camera 1080p Set"
    
