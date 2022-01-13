#Autor: Alexander Echeverry Torres
@Stories
Feature: SignUp in Utest.com
  As a user,
  I want to signup in utest.com
  So I can share with a testers community

  @scenario1
  Scenario: SignUp in utest platform
    Given than Alexander was in the utest page
    When he fill the complete subscribe form
      | firstName         | Alexander         |
      | lastName          | Echeverry         |
      | email             | test12@test12.com |
      | birthMonth        | May               |
      | birthDay          | 15                |
      | birthYear         | 1991              |
      | city              | medellin          |
      | zipCode           | 050001            |
      | country           | colombia          |
      | computerOS        | Windows           |
      | computerVersion   | Vista             |
      | computerLanguage  | Spanish           |
      | mobileDevice      | Apple             |
      | mobileDeviceModel | iPhone 4          |
      | mobileDeviceOS    | iOS 11.2          |
      | password          | Colombia15234/**  |
    Then he can see the welcome message "The last step"