@homeScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage


  @AS-3 @Tariq @smoke
  Scenario Outline: Verify contact info is displayed in the top of the main page
    Then Verify "<Contact>" info is displayed
    Examples:
      | Contact           |
      | 10090 Main Street |
      | Fairfax, VA, USA  |
      | Quick Contact:    |
      | +1 703-831-3217   |

  @AS-6 @Nurik @smoke
  Scenario: Verify the Title of the page
    Then Verify Title of the page is "Advance Systems - Home"

  @AS-7 @Oksana @smoke
  Scenario Outline: Verify the navigation bar have following buttons
    Then Verify the buttons"<NavigationBar>" are displayed
    Examples:
      | NavigationBar |
      | Get Support   |
      | Job Career    |
      | Feedback      |

  @AS-7 @smoke
  Scenario Outline: Verify Languages on the Navigation bar
    When User click on Language section button
    Then User Verify "<Languages>" buttons are displayed
    Examples:
      | Languages |
      | English   |
      | Spanish   |
      | French    |


  @Gabriella
  @AS-4
  Scenario: Verify the Header, Description and Read More button
    When User Verify "Header" is displayed
    And User Verify "Description" text is displayed
    Then User Verify "Read More" button is displayed
    Then User click on "Read More" Btn
    And  Verify "Advance Systems - Services" button takes User to page

  @AS-14 @Tariq @smoke
  Scenario Outline: Verify Following information is displayed in footer section
    Then Verify "<FooterInfo>" is displayed
    Examples:
      | FooterInfo                          |
      | Address: 10090 Main St, Fairfax, VA |
      | Phone: +1 703-831-3217              |
      | Email: info@advancesystems.us       |
      | Mon to Sat: 9.00 am to 5:00 pm      |





