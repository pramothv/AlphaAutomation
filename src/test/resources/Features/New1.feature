@testing
Feature: ILab Assessment23

  @testing23
  Scenario Outline: Job Application to training2

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
    And I click on Subject and CreateSubject Option and capture "<firstname>""<lastname>""<site>""<subNum>""<subExtID>""<phoneCode>""<phoneNum>""<email>""<role>""<startDate>""<language>"

#     And I click on contact us
#    And I type in my personal details "<applicatName>" and "<surname>" "<emailAddress>" "<message>"
#     And I type in my details "<applicatName>" and "<surname>" "<emailAddress>" "<message>"
#    Then i should be able to submit the application and quite the browser


    Examples:
      | username     |password  | firstname	|lastname|site       |subNum|subExtID|phoneCode|phoneNum  |email                     |role    |startDate  |language|
      | grachael     |Pass@123  |   Helary  |  Maret |TestSiteOrg|123456|123456  |+91      |9214587458|pramoth.vm@jivascience.com|Subject |Nad        |English |
