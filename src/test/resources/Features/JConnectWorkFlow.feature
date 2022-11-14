@workflow

Feature: Workflow - Creation of Subject and Schedules


   #JIRA:EZPRODSNR-5626 WorkFLow Scenario
  @testingWorkFLow
  Scenario Outline: Workflow - Creation of Subject with Scheduling Visits and validation


    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
    And I navigate to StudyList List and capture "<studyNum>" and fetch the record
    And I click on Subject and CreateSubject Option and capture "<firstname>""<lastname>""<site>""<subNum>""<subExtID>""<phoneCode>""<phoneNum>""<email>""<role>""<startDate>""<language>"
    And I validate the Screening checkbox and WeekOneBaseLine checkbox in the PrepaymentVisit section
    And I navigate to Subject List and must enter "<subNum>" and fetch the record
    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to Schedule a Call screen and must capture "<title>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
    And I must navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
    And I navigate to Subject List and enter "<subNum>" and fetch the record
    Then I validate the Screening checkbox and click summary and check ICF Visit Status
    And I launch AmazonWebmail and capture "<mailusername>""<mailpassword>"
    And I capture "<eDiaryLogin>" in searchbox and retrieve the credentials
    And I launch the JConnect WebApp and capture "<PhoneCode>""<phoneNum>""password and login and click Savebuton for TimeZone
    Then I validate NoDiaryQuestionnarires and check for ICF in calls
    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch the ICF meeting
    And I join the meeting fromJConnect
    And I launch the JConnect WebApp with "<PhoneCode>""<phoneNum>" password and join the meeting from WebApp and conclude
    And I launch JConnect and capture "<username>""<password>" and click Signin
    And I click on JConnectBuild Option
    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to CallSchedule and ScheduleTelevisit for Screening and should capture "<title1>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit1>""<batterylink>"
    And I must be able to navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and click on Screening
    And I click on CHRTSR Form and capture the options
    And I click PHQ form and must capture the options
    And I click on AUDIT Form and capture "<frequencyOfAlcohol>""<nOfDrinks>""<sixOrMoreDrinks>""<stopDrinkingOnceStarted>""<failedToDo>""<heavyDrinkingSeason>""<feelingGuilt>""<unableToRemember>""<injured>""<cutDown>"
    And I click on DiaryBack button and check Screening Status
    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to CallSchedule and ScheduleTelevisit for SaferVisit and should capture "<title2>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit2>""<batterylink>"
    And I must be able to navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
    And I navigate to Subject List and enter "<subNum>" and fetch the record
    And I validate the Screening checkbox and click summary and check Summary
    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch SAFER Interview meeting
    And I join the meeting fromJConnect
    And I launch the JConnect WebApp with "<PhoneCode>""<phoneNum>" password and join the Safer meeting from WebApp and conclude
    And I launch JConnect and capture "<username>""<password>" and click Signin
    And  I click on JConnectBuild Option
    And I navigate to Subject List and enter "<subNum>" and fetch the record
    And I click on ScreeningPass
    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to CallSchedule and ScheduleTelevisit for WeekOneBaseLine and should capture "<title3>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit3>""<batterylink>"
    And I must navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
    And I navigate to Subject List and enter "<subNum>" and fetch the record
    And I select WeekOneBaseline check box ans SafetyFollowUp checkbox and click SaveandNext
    Then I check the status of WeekOne BaseLine and WeekOne
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and select WeekOne Baseline option
    And I should click PHQ form and must capture the options
    And I click on CHRTSR Form and capture the options
    And I click on AAA Form and capture "<antiDepressent>""<daysAWeekNeeded>""<timesADayNeeded>""<takeDrugInPast>""<daysAWeek>""<timesADayUsuallyTake>""<pillsEachTime>""<pillsMissed>"
    And I navigate to JConnect and Subject List and enter "<subNum>" and fetch the record to find WeekOneBaseline checkbox and SafetyFollowUp Checkbox and ArmAssignment segment
    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to CallSchedule and ScheduleTelevisit for WeekOne and should capture "<title4>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit4>""<batterylink>"
    And I must navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to Schedule a Call screen and capture "<title5>" click AddGuest and must capture "<guestname>""<guestemail>""<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and click on UnscheduledVisit option
    And I should be able to navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
    And I launch AmazonWebmail capturing "<mailusername>""<mailpassword>" "<videoCallScheduled>" and check for GuestParticipant email Notification Call
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and select WeekOne option
    And I should click PHQ form and must capture the options
    And I click on CHRTSR Form and capture the options
    And I lick on QLEFQSEF Form and capture the options
    And I lick on SHAPS Form and capture "<enjoyTelevision>""<enjoyBeingWithFamily>""<pleasureInHobbies>""<enjoyFavouriteMeal>""<enjoyShower>""<pleasureInBread>""<enjoySeingZPeopleSmile>""<enjoyLookingSmart>""<enjoyReadingBook>""<enjoyTea>""<pleasureInSmallThings>""<enjoyView>""<pleasureFromHelpingOthers>""<pleasureFromPraise>"
    And I lick on GADSeven Form and capture "<GADname>" problems options and "<difficultToWork>"
    And I lick on CPFQ Form and capture "<motivationCPFQ>""<wakefullnessCPFQ>""<energyCPFQ>""<focusCPFQ>""<abilityToRememberCPFQ>""<abilityToFindWords>""<sharpnessCPFQ>"
    And I click on InsomniaSeverityIndex Form and capture the options
    And I click on QIDSSR Form and capture "<fallingAsleepQIDS>""<sleepDuringNightQIDS>""<wakingUpTooEarlyQIDS>""<sleepingTooMuchQIDS>""<feelingSadQIDS>""<decreasedAppetiteQIDS>""<increasedAppetiteQIDS>""<decreasedWeightQIDS>""<increasedWeightQIDS>""<concentrationQIDS>""<viewOfMyselfQIDS>""<thoughtsOfDeathQIDS>""<generalInterest>""<energyLevelQIDS>""<slowedDown>""<feelingRestless>"
    And I click on AAA Form and capture "<antiDepressent>""<daysAWeekNeeded>""<timesADayNeeded>""<takeDrugInPast>""<daysAWeek>""<timesADayUsuallyTake>""<pillsEachTime>""<pillsMissed>"
    And I navigate to JConnect Subject List enter "<subNum>" and fetch the record and under TreatmentVisits I should be able to change "<diaryWindowStartDateWeek3>" and "<diaryWindowEndDateWeek3>" for WeekThree
    And I click on SaveandNext and capture "<SelectAuthorVisitStatementTestementType>" and save
    And I navigate to WebApp be able to find the StartDate and EndDate for WeekThree
    And I check the Submitbutton Visibility for the already SubmittedForms in WebApp
    Then I navigate to JConnect and retrieve the DiaryWindow and Status of the Visits



    Examples:
      | username     |password  |studyNum    |GADname|difficultToWork     |field1options|textfield|textfield2  |Field2option|Field1       |Singleselectopt|field21|field22|field |field4|TestField1|TestField2|TestField3|OptionstobeSlected|Field123|visit |visit1    |visit2            |visit3          |visit4|batterylink|time      |study     	     |site                                                  |title|title1     |title2 |title3        |title4|title5     |guestname|guestemail                |ScheduleCallsitestaff |sitestaff     |host|alert                    |calldurationMins    |calldurationHrs           |timeZone                                        |time1  |date        |diaryWindowStartDateWeek3|diaryWindowEndDateWeek3            |date1      |timehours|timemins|timetype|email                     |role    |startDate          |language|       username     |password  |PhoneCode|eDiaryLogin               	    |videoCallScheduled  |site                                                    |mailusername|mailpassword    |subject         |ScheduleCallsubject  | phoneNum |subNum  | subExtID      |firstname    |lastname |phoneCode      |email                      |role    |startDate      |language|frequencyOfAlcohol       |nOfDrinks|sixOrMoreDrinks  |stopDrinkingOnceStarted|failedToDo       |heavyDrinkingSeason|feelingGuilt     |unableToRemember |injured|cutDown|antiDepressent|daysAWeekNeeded|timesADayNeeded|takeDrugInPast|daysAWeek|timesADayUsuallyTake|pillsEachTime|pillsMissed|enjoyTelevision|enjoyBeingWithFamily|pleasureInHobbies|enjoyFavouriteMeal|enjoyShower|pleasureInBread|enjoySeingZPeopleSmile|enjoyLookingSmart|enjoyReadingBook|enjoyTea|pleasureInSmallThings|enjoyView|pleasureFromHelpingOthers|pleasureFromPraise|motivationCPFQ|wakefullnessCPFQ|energyCPFQ|focusCPFQ|abilityToRememberCPFQ|abilityToFindWords|sharpnessCPFQ|fallingAsleepQIDS                                 |sleepDuringNightQIDS      |wakingUpTooEarlyQIDS                                                     |sleepingTooMuchQIDS                                                     |feelingSadQIDS    |decreasedAppetiteQIDS             |increasedAppetiteQIDS               |decreasedWeightQIDS           |increasedWeightQIDS         |concentrationQIDS                                                       |viewOfMyselfQIDS                                                |thoughtsOfDeathQIDS               |generalInterest                                           |energyLevelQIDS                   |slowedDown                                         |feelingRestless|SelectAuthorVisitStatementTestementType|
      | JASC2        |Pass@123  |ALTO-100-005|GAD    |Not Difficult at All|opt1         |test2    |test2       |Yes         |Test3       |opt1            |3      |Test4  | Test5|yes   |Test1     |Test2     |Test3     |Options 1 &3      |opt1    |ICF    |Screening|SAFER Interview   |Week -1 Baseline|Week 1|Link       |day       |ALTO-100-005       |160 - The Bishop Center for Translational Neuroscience|ICF  |Screening  |  Safer|Week1BaseLine |Week 1|Unscheduled|pram     |pramoth.vm@jivascience.com|JA SC                 |JA SC         |JA SC|5 minutes before call   |0 minutes           |1 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:02 pm|07-Nov-2022 |14-Nov-2022              |30-Nov-2022                        |13-Nov-2022|09       |40      |pm      |pramoth.vm@jivascience.com|Subject |12-Nov-2022        |English |       JASC2        |Pass@123  |91       |  eDiary Login Information        |Video Call Scheduled|160 - The Bishop Center for Translational Neuroscience  |  pramoth   |Start@123       |AA129           |AA129                |9876698784|AA129   |9AAA12951       |AA129        |A4       |    +91        | pramoth.vm@jivascience.com|Subject |02-Nov-2022    |English |Monthly or less          |3 or 4   |Less than monthly|Less than monthly      |Less than monthly|Less than monthly  |Less than monthly|Less than monthly|No     |No     |Yes           |As needed      |0 times a day  | Yes          |0 days    |1 time a day        |0 pills      |1 time    |Disagree      |Disagree             |Disagree        |Disagree          |Disagree   |Disagree       |Disagree              |Disagree         |Disagree        |Disagree|Disagree             |Disagree |Disagree                 |Disagree          |Normal        |Normal          |Normal    |Normal   |Normal               |Normal            |Normal       |I never take longer than 30 minutes to fall asleep|I do not wake up at night|Most of the time, I awaken no more than 30 minutes before I need to get up|I sleep no longer than 7-8 hours/night, without napping during the day  |I do not feel sad|My usual appetite has not decreased|My usual appetite has not increased  |My weight has not decreased  |My weight has not increased|There is no change in my usual capacity to concentrate or make decisions |I see myself as equally worthwhile and deserving as other people|I do not think of suicide or death|I notice that I am less interested in people or activities|I get tired more easily than usual|I think, speak, and move at my usual rate of speed|I do not feel restless|I approve.                     |
