@testing
Feature: Create Subject and Schedule

  @testinsample2
  Scenario Outline: Create Subject1

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
    And I click on Subject and CreateSubject Option and capture "<firstname>""<lastname>""<site>""<subNum>""<subExtID>""<phoneCode>""<phoneNum>""<email>""<role>""<startDate>""<language>"
    And I launch AmazonWebmail and capture "<mailusername>""<mailpassword>"
    And I capture "<eDiaryLogin>" in searchbox and retrieve the credentials
    And I launch the JConnect WebApp and capture "<PhoneCode>""<phoneNum>""password and login
#    And I must launch the JConnect WebApp and capture "<PhoneCode>""<phoneNum>""password and login

#    And I click on Subject and CreateSubject Option and capture "<firstname>""<lastname>""<site>""<subNum>""<subExtID>""<phoneCode>""<phoneNum>""<email>""<role>""<startDate>""<language>"

#     And I click on contact us
#    And I type in my personal details "<applicatName>" and "<surname>" "<emailAddress>" "<message>"
#     And I type in my details "<applicatName>" and "<surname>" "<emailAddress>" "<message>"
#    Then i should be able to submit the application and quite the browser


    Examples:
      | username     |password  | PhoneCode|eDiaryLogin             	 |firstname|lastname|site        |mailusername|mailpassword       |subNum|subExtID|phoneCode|phoneNum  |email                     |role    |startDate      |language|
      | grachael     |Pass@123  | 91       |  eDiary Login Information   |Pramo    |Vm      |CrioTestSite|  pramoth    |Start@123        |NJI976 |16O456  |+91      |9210987458|pramoth.vm@jivascience.com|Subject |02-Nov-2022    |English |



  @testinCallSchedule
  Scenario Outline: CallSchedule with different ScheduleCallsubject

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to Schedule a Call screen and capture "<title>" click AddGuest and capture "<guestname>""<guestemail>""<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
    And I navigate to ScheduleInfo section and capture "<date>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>""<host>"


    Examples:
      | username     |password  | visit |batterylink|time      |study     	       |site                                                  |title|guestname|guestemail                |ScheduleCallsubject        |ScheduleCallsitestaff|subject                     |sitestaff     |host|alert               |calldurationMins    |calldurationHrs           |timeZone                                       |time1  |date        |email                     |role    |startDate  |language|
      | JASC2        |Pass@123  | ICF    | Link     |day       |ALTO-100-004       |160 - The Bishop Center for Translational Neuroscience|Helo |pram     |pramoth.vm@jivascience.com|a(A A)                     |Jack T                |456(Robin)                |JA SC         |JA SC|10                 | 10                 |4 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|2:18 pm|02-Nov-2022|pramoth.vm@jivascience.com|Subject |Nad        |English |



  @testinCallSchedulesame
  Scenario Outline: CallSchedule  with Same ScheduleCallsubject

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to Schedule a Call screen and capture "<title>" click AddGuest and capture "<guestname>""<guestemail>""<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to Schedule a Call screen and must capture "<title>" click AddGuest and capture "<guestname>""<guestemail>""<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
    And I navigate to ScheduleInfo section and capture "<date>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>""<host>"




    Examples:
      | username     |password  | visit        |batterylink|time      |study     	       |site                                                  |title|guestname|guestemail                |ScheduleCallsubject         |ScheduleCallsitestaff|subject                     |sitestaff     |host|alert               |calldurationMins    |calldurationHrs           |timeZone                                       |time1  |date        |email                     |role    |startDate  |language|
      | JASC2        |Pass@123  | Screening    | Link     |week       |ALTO-100-004       |160 - The Bishop Center for Translational Neuroscience|Helo |pram     |pramoth.vm@jivascience.com|456(Robin)                  |JA SC                |456(Robin)                 |JA SC         |JA SC|10                 | 10                 |4 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:18 pm|06-Nov-2022|pramoth.vm@jivascience.com|Subject |Nad        |English |