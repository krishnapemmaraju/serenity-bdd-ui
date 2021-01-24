Feature: VisaEligibityCheckCriteria

  Background: 
    Given the UK-Visa Home page

  Scenario Outline: Visa Eligibity Check for Australian Nationality for Tourism in UK
    When user checks eligibility for "<nationality>" nationality with reason to visit UK as "<reasonToVisit>"
    Then should see the message "<outcome>"

    Examples: 
      | nationality | reasonToVisit | outcome                                    |
      | Australia   | Tourism       | You will not need a visa to come to the UK |

  Scenario Outline: Visa Eligibity Check for Chilian Nationality To Work in UK
    When user checks eligibility for "<nationality>" nationality with reason to visit UK as "<reasonToVisit>"
    And select planning to work in UK as "<planningToWork>"
    Then should see the message "<outcome>"

    Examples: 
      | nationality | reasonToVisit                    | planningToWork       | outcome                                                                  |
      | Chile       | Work, academic visit or business | longer than 6 months | You’ll need a visa to work or do business or academic research in the UK |

  Scenario Outline: Visa Eligibity Check for Columbian Nationality to join a partner for long stay in UK
    When user checks eligibility for "<nationality>" nationality with reason to visit UK as "<reasonToVisit>"
    And select family member immigration status "<immigrationsStatus>"
    Then should see the message "<outcome>"

    Examples: 
      | nationality | reasonToVisit                          | immigrationsStatus | outcome                                                     |
      | Colombia    | Join partner or family for a long stay | Yes                | You’ll need a visa to join your family or partner in the UK |
