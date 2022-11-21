@testing
Feature: FullCreate Subject and Schedule1


  @testinCallSchedulecontfull1
  Scenario Outline: Full CallSchedule with different ScheduleCallsubject1

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
    And I click on Subject and CreateSubject Option and capture "<firstname>""<lastname>""<site>""<subNum>""<subExtID>""<phoneCode>""<phoneNum>""<email>""<role>""<startDate>""<language>"
    And I validate the Screening checkbox in the PrepaymentVisit section
    And I navigate to Subject List and must enter "<subNum>" and fetch the record
#    And I launch AmazonWebmail and capture "<mailusername>""<mailpassword>"
#    And I capture "<eDiaryLogin>" in searchbox and retrieve the credentials
#    And I launch the JConnect WebApp and capture "<PhoneCode>""<phoneNum>""password and login
#    Given I capture "<username>""<password>" and click Signin
#    When I click on JConnectBuild Option

    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to Schedule a Call screen and capture "<title>" click AddGuest and capture "<guestname>""<guestemail>""<ScheduleCallsubject>""<ScheduleCallsitestaff>"
#    And I navigate to Schedule a Call screen and capture "<title>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to Schedule a Call screen and must capture "<title>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
#    And I navigate to ScheduleInfo section and capture "<date1>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
    And I navigate to ScheduleInfo section and must capture "<date1>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
    And I navigate to Subject List and enter "<subNum>" and fetch the record
    And I validate the Screening checkbox and click summary and check ICF Visit Status

    And I launch AmazonWebmail and capture "<mailusername>""<mailpassword>"
    And I capture "<eDiaryLogin>" in searchbox and retrieve the credentials
    And I launch the JConnect WebApp and capture "<PhoneCode>""<phoneNum>""password and login and click Savebuton for TimeZone
    And I validate NoDiaryQuestionnarires and check for ICF in calls
    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch the ICF meeting
#    And I join the meeting and join the meeting from Webapp
#    And I join the meeting and join the meeting from Webapp and end
    And I join the meeting fromJConnect and join the meeting from Webapp and conclude the call

    And I navigate to CallSchedule and ScheduleTelevisit for Screening and must capture "<title1>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
#    And I navigate to CallSchedule and ScheduleTelevisit for Screening and capture "<title1>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit1>""<batterylink>"
#    And I navigate to ScheduleInfo section and capture "<date1>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
    And I navigate to ScheduleInfo section and must capture "<date1>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
    And I visit JConnect WebApp and click on Screening

    And I click on CHRTSR Form and capture the options
    And I click PHQ form and must capture the options
    And I click on AUDIT Form and capture "<frequencyOfAlcohol>""<nOfDrinks>""<sixOrMoreDrinks>""<stopDrinkingOnceStarted>""<failedToDo>""<heavyDrinkingSeason>""<feelingGuilt>""<unableToRemember>""<injured>""<cutDown>"
    And I click on DiaryBack button and check Screening Status

    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to Schedule a Call screen and must capture "<title2>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit2>""<batterylink>"
    And I navigate to ScheduleInfo section and must capture "<date1>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I navigate to Subject List and enter "<subNum>" and fetch the record
#    And I validate the Screening checkbox and click summary and check ICF Visit Status
    And I validate the Screening checkbox and click summary and check Summary

    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch SAFER Interview meeting
    And I join the meeting and join the meeting from Webapp

    And I navigate to Subject List and enter "<subNum>" and fetch the record
    And I click on ScreeningPass

    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to Schedule a Call screen and must capture "<title3>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit3>""<batterylink>"
    And I navigate to ScheduleInfo section and must capture "<date1>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I navigate to Subject List and enter "<subNum>" and fetch the record
    And I select WeekOneBaseline check box ans SafetyFollowUp checkbox and click SaveandNext
    And I check the status of WeekOne BaseLine and WeekOne

    And I switch to WebApp and select WeekOne Baseline option
    And I click PHQ form and must capture the options
    And I click on CHRTSR Form and capture the options
    And I click on AAA Form and capture "<antiDepressent>""<daysAWeekNeeded>""<timesADayNeeded>""<takeDrugInPast>""<daysAWeek>""<timesADayUsuallyTake>""<pillsEachTime>""<pillsMissed>"

    And I navigate to JConnect and Subject List and enter "<subNum>" and fetch the record to find WeekOneBaseline checkbox and SafetyFollowUp Checkbox

    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to Schedule a Call screen and must capture "<title4>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit4>""<batterylink>"
    And I navigate to ScheduleInfo section and must capture "<date1>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to Schedule a Call screen and must capture "<title5>" and addGuest with "<guestname>""<guestemail>""<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and select UnscheduledOption
    And I navigate to ScheduleInfo section and must capture "<date1>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I switch to WebApp and select WeekOne Baseline option
    And I switch to WebApp and select WeekOne






#    And I click on DepressionForm and select "<OptionstobeSlected>""<Field123>"and select Field Options
#    And I click on NewForm and capture "<TestField1>""<TestField2>""<TestField3>"
#    And I click on FormForGrid and capture "<Field2option>""<Singleselectopt>""<Field1>""<field21>""<field22>""<field>""<field4>"
#    And I click on SixOption form and capture the options
#    And I click PHQ form and capture the options
#    And I click Gridform and the options "<field1options>""<textfield>""<textfield2>"



    Examples:
      | username     |password  |field1options|textfield|textfield2  |Field2option|Field1       |Singleselectopt|field21|field22|field |field4|TestField1|TestField2|TestField3|OptionstobeSlected|Field123|visit |visit1    |visit2            |visit3          |visit4|batterylink|time      |study     	       |site                                                  |title|title1    |title2|title3        |title4|title5     |guestname|guestemail                |ScheduleCallsitestaff |sitestaff     |host|alert                    |calldurationMins    |calldurationHrs           |timeZone                                        |time1  |date        |date1           |email                     |role    |startDate          |language|       username     |password  | PhoneCode|eDiaryLogin               	 |site                                                    |mailusername|mailpassword   |subject       |ScheduleCallsubject| phoneNum |subNum | subExtID       |firstname |lastname |phoneCode      |email                      |role    |startDate      |language|frequencyOfAlcohol       |nOfDrinks|sixOrMoreDrinks  |stopDrinkingOnceStarted|failedToDo       |heavyDrinkingSeason|feelingGuilt     |unableToRemember |injured|cutDown|antiDepressent|daysAWeekNeeded|timesADayNeeded|takeDrugInPast|daysAWeek|timesADayUsuallyTake|pillsEachTime|pillsMissed|
      | JASC2        |Pass@123  |opt1         |test2    |test2       |Yes         |Test3       |opt1            |3      |Test4  | Test5|yes   |Test1     |Test2     |Test3     |Options 1 &3      |opt1    |ICF    |Screening|SAFER Interview   |Week -1 Baseline|Week 1|Link       |day     |ALTO-100-005       |160 - The Bishop Center for Translational Neuroscience|ICF  |Screening  |  Safer|Week1BaseLine |Week 1|Unscheduled|pram     |pramoth.vm@jivascience.com|JA SC                 |JA SC         |JA SC|5 minutes before call   |0 minutes           |1 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:02 pm|07-Nov-2022 |07-Nov-2022     |pramoth.vm@jivascience.com|Subject |07-Nov-2022        |English |       JASC2        |Pass@123  | 91       |  eDiary Login Information     |160 - The Bishop Center for Translational Neuroscience  |  pramoth   |Start@123      |AA45(AA45 Ad) |AA45(AA45 Ad)      |9099898867|AA45   |9AAAA454         |AA45        |A4       |    +91        | pramoth.vm@jivascience.com|Subject |02-Nov-2022    |English |Monthly or less          |3 or 4   |Less than monthly|Less than monthly      |Less than monthly|Less than monthly  |Less than monthly|Less than monthly|No     |No     |Yes           |As needed      |0 times a day  | Yes          |1 da  y  |1 time a day        |0 pills      |1 time    |