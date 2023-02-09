@regression @smoke @SCB-15 @E2E
Feature: Amazon Search Functionality

	Scenario: Search for Shoes
		Given Open Amazon Homepage
		When Search for Shoes
		Then Item list should have only shoes related products