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
      | username     |password  | PhoneCode|eDiaryLogin             	 |firstname|lastname |site                                                    |mailusername|mailpassword       |subNum|subExtID |phoneCode |phoneNum   |email                     |role    |startDate      |language|
      | JASC2        |Pass@123  | 91       |  eDiary Login Information   |Pramod   |Vma      |160 - The Bishop Center for Translational Neuroscience  |  pramoth    |Start@123        |NJI97633 |16O43563  |+91      |9290987558|pramoth.vm@jivascience.com|Subject |02-Nov-2022    |English |



  @testinCallSchedule
  Scenario Outline: CallSchedule with different ScheduleCallsubject

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to Schedule a Call screen and capture "<title>" click AddGuest and capture "<guestname>""<guestemail>""<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
    And I navigate to ScheduleInfo section and capture "<date>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>""<host>"


    Examples:
      | username     |password  | visit |batterylink|time      |study     	       |site                                                  |title|guestname|guestemail                |ScheduleCallsubject        |ScheduleCallsitestaff|subject                     |sitestaff     |host|alert                   |calldurationMins           |calldurationHrs           |timeZone                                       |time1  |date        |email                     |role    |startDate  |language|
      | JASC2        |Pass@123  | ICF    | Link     |day       |ALTO-100-004       |160 - The Bishop Center for Translational Neuroscience|Helo |pram     |pramoth.vm@jivascience.com|a(A A)                     |Jack T                |456(Robin)                |JA SC         |JA SC|15 minutes before call  |10 minutes                 |4 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|2:18 pm|02-Nov-2022|pramoth.vm@jivascience.com|Subject |Nad        |English |



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


  @testinsample22
  Scenario Outline: Create Subject34

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
    And I click on Subject and CreateSubject Option and capture "<firstname>""<lastname>""<site>""<subNum>""<subExtID>""<phoneCode>""<phoneNum>""<email>""<role>""<startDate>""<language>"
#    And I launch AmazonWebmail and capture "<mailusername>""<mailpassword>"
#    And I capture "<eDiaryLogin>" in searchbox and retrieve the credentials
#    And I launch the JConnect WebApp and capture "<PhoneCode>""<phoneNum>""password and login
    And I launch the JConnect WebApp and capture "<PhoneCode>""<phoneNum>""password and login and click save
    And I navigate to Subject List and enter "<firstname>" and fetch the record
    And I validate the Screening checkbox and click summary and check ICF Visit Status


    Examples:
      | username     |password  | PhoneCode|eDiaryLogin             	 |firstname|lastname |site                                                    |mailusername|mailpassword       |subNum    |subExtID   |phoneCode |phoneNum   |email                     |role    |startDate      |language|
      | JASC2        |Pass@123  | 91       |  eDiary Login Information   |Prasan   |Vma      |160 - The Bishop Center for Translational Neuroscience  |  pramoth    |Start@123        |NAMAT9     |16O4D3563  |+91      |9290977538|pramoth.vm@jivascience.com|Subject |07-Nov-2022    |English |


  @testinCallSchedulecont2
  Scenario Outline: CallSchedule with different ScheduleCallsubject12

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
#    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I click on CallSchedule and capture the "<time>""<study>""<site>""<subject1>""<sitestaff>" and click on Schedule Visit

    #    And I navigate to Schedule a Call screen and capture "<title>" click AddGuest and capture "<guestname>""<guestemail>""<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to Schedule a Call screen and capture "<title>" "<ScheduleCallsubject1>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
#    And I navigate to ScheduleInfo section and capture "<date1>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
    And I must navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"


    Examples:
      | username     |password  | visit |batterylink|time      |study     	       |timehours|timemins|timetype|site                                                  |title|guestname|guestemail                |ScheduleCallsubject        |ScheduleCallsubject1|ScheduleCallsitestaff|subject1|subject                              |sitestaff     |host|alert                  |calldurationMins    |calldurationHrs           |timeZone                                       |time1  |date        |date1          |email                     |role    |startDate  |language|
      | JASC2        |Pass@123  | ICF    | Link     |day       |ALTO-100-005       |02       |02      |pm       |160 - The Bishop Center for Translational Neuroscience|ICF  |pram     |pramoth.vm@jivascience.com|AA60(AA60 Ad)              |AA60                |JA SC                 |AA60   |AA60(AA60 Ad)                        |JA SC         |JA SC|5 minutes before call   |0 minutes         |1 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:02 pm|07-Nov-2022|11-Nov-2022     |pramoth.vm@jivascience.com|Subject |Nad        |English |