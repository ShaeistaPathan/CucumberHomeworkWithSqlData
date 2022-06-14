@DbBankAndCashFeature   @Regression
Feature: Techfios Billing Login Functionalty validation

   @Smoke
Scenario: 1 User should be able to fill bank and cash form with valid credentials from database
   Given User is on techfios login page
   When User enters "username" from techfios database
   When User enters "password" from techfios database
   When User clicks signin button
   Then User should land on dashboard page 
   And User clicks on bankCash
   And User clicks on newAccount
   And User enters accountTitle as "<accountTitle>" 
   And User enters description as "<description>"
   And User enters initialBalance as "<initialBalance>"
   And User enters accountNumber as "<accountNumber>"
   And User enters contactPerson as "<contactPerson>"
   And User enters phone as "<phone>"
   And User enters internetBankingUrl as "<internetBankingUrl>"
   And User clicks on submit button
   Then User should be able to validate account created successfully
 
