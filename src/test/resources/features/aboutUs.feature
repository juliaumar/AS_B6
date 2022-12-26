@AboutUsScenarios
Feature: ABOUT US page related scenarios

  Background: Navigate to page
    When  User opens Home Page

    When : User clicks on "About Us" link text
    And : User switches to new window


  @AS-29
  Scenario: About Us page Main content
    Given Verify Title of page is "Advance Systems - About Us"
    When Verify a main header "Welcome to Advance Systems LLC."
    Then Verify name and title are displayed

  @AS-30
  Scenario Outline: About Us page: Why Us section
    When User see a section with header "Why Choose Us"
    Then It should contain sub-sections with following headers "<Headers>"
    Examples:
      | Headers           |
      | On Time Services  |
      | Experienced Team  |
      | Good Track Record |


  @AS-32
  Scenario: About Us page: Call to action button
    When User Verify "We are Recruitment Experts" header is displayed
    Then verify button "Our Services" is clickable which take to Services page
    And Verify Title of Services page is "Advance Systems - Services"



