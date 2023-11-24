#Author: RADHI Rahma
Feature: Liste de souhaits

  Scenario: Ajouter un produit à la liste de souhaits
    Given utilisateur est sur la page du produit choisi
    When utilisateur clique sur  ajouter a la liste de souhaits
    Then utlisateur est dirige vers la page de la liste de souhaits et verifie le produit ajouter a la liste 
