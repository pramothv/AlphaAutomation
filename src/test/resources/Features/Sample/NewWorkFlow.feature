@workflow

Feature: New Workflow Scenario - Creation of Subject and SchedulesFlow and validation check


   #JIRA:EZPRODSNR-5626 WorkFLow Scenario
  @testingWorkFLScenario2New
  Scenario Outline: New Workflow Scenario - Creation of Subject with Scheduling Visits and validation check


    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
    And I navigate to StudyList List and capture "<studyNum>" and fetch the record
    And I capture "<studyNum>" and check the same in the Page Header
    And I click on Subject and CreateSubject Option and should be able to capture "<firstname>""<lastname>""<site>""<subNum>""<subExtID>""<phoneCode>""<phoneNum>""<email>""<role>""<startDate>""<language>"
    And I validate the Screening checkbox and WeekOneBaseLine checkbox in the PrepaymentVisit section
    And I navigate to Subject List and must enter "<subNum>" and fetch the record

#    Given I capture "<username>""<password>" and click Signin
#    When I click on JConnectBuild Option

    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and must click on Schedule Visit
    And I navigate to Schedule a Call screen and must capture "<title>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
    And I must navigate to ScheduleInfo section and must be able to capture the "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I navigate to Subject List and enter "<subNum>" and fetch the record
    Then I validate the Screening checkbox and click summary and check ICF Visit Status

    And I launch Webmail and capture "<mailusername>""<mailpassword>"
    And I capture "<eDiaryLogin>" in searchbox and must retrieve the credentials

    And I launch the JConnect WebApp and capture "<PhoneCode>""<phoneNum>""password and click login
    And I must capture "<WebAppTimeZone>" and save

    Then I validate NoDiaryQuestionnarires and check for ICF in calls

    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch the ICF meeting
    And I must join the meeting from JConnect
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and must join the meeting from WebApp and conclude

    And I launch JConnect and capture "<username>""<password>" and click Signin
    And I click on JConnectBuild Option

#    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to CallSchedule and ScheduleTelevisit for Screening and should capture "<title1>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
#    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit1>""<batterylink>"
#    And I must be able to navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and must click on Schedule Visit
    And I must navigate to CallSchedule and ScheduleTelevisit for Screening and must capture "<title1>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
    And I must navigate to ScheduleInfo section and must be able to capture the "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and click on Screening
    And I click on CHRTSR Form and capture the options
    And I click PHQ form and must capture the options
    And I click on AUDIT Form and capture "<frequencyOfAlcohol>""<nOfDrinks>""<sixOrMoreDrinks>""<stopDrinkingOnceStarted>""<failedToDo>""<heavyDrinkingSeason>""<feelingGuilt>""<unableToRemember>""<injured>""<cutDown>"
    And I click on DiaryBack button and check Screening Status

#    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to CallSchedule and ScheduleTelevisit for SaferVisit and must capture "<title2>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
#    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit2>""<batterylink>"
#    And I must be able to navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and must click on Schedule Visit
    And I navigate to CallSchedule and ScheduleTelevisit for SaferVisit and must capture "<title2>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
    And I must navigate to ScheduleInfo section and must be able to capture the "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I navigate to Subject List and enter "<subNum>" and fetch the record
    And I validate the Screening checkbox and click summary and check Summary

    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch SAFER Interview meeting
    And I must join the meeting from JConnect
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and must join the Safer meeting from WebApp and conclude

    And I launch JConnect and capture "<username>""<password>" and click Signin
    And  I click on JConnectBuild Option

    And I navigate to Subject List and enter "<subNum>" and fetch the record
    And I click on ScreeningPass

#    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to CallSchedule and ScheduleTelevisit for WeekOneBaseLine and must capture "<title3>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
#    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit3>""<batterylink>"
#    And I must navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and must click on Schedule Visit
    And I navigate to CallSchedule and ScheduleTelevisit for WeekOneBaseLine and must capture "<title3>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
    And I must navigate to ScheduleInfo section and must be able to capture the "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"


    And I navigate to Subject List and enter "<subNum>" and fetch the record
    And I select WeekOneBaseline check box ans SafetyFollowUp checkbox and click SaveandNext
    Then I check the status of WeekOne BaseLine and WeekOne
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and select WeekOne Baseline option
    And I should click PHQ form and must capture the options
    And I click on CHRTSR Form and capture the options
    And I click on AAA Form and capture "<antiDepressent>""<daysAWeekNeeded>""<timesADayNeeded>""<takeDrugInPast>""<daysAWeek>""<timesADayUsuallyTake>""<pillsEachTime>""<pillsMissed>"
    And I navigate to JConnect and Subject List and enter "<subNum>" and fetch the record to find WeekOneBaseline checkbox and SafetyFollowUp Checkbox and ArmAssignment segment

#    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to CallSchedule and ScheduleTelevisit for WeekOne and must capture "<title4>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
#    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit4>""<batterylink>"
#    And I must navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and must click on Schedule Visit
    And I navigate to CallSchedule and ScheduleTelevisit for WeekOne and must capture "<title4>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
    And I must navigate to ScheduleInfo section and must be able to capture the "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

#    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to Schedule a Call screen and capture "<title5>" click AddGuest and should capture "<guestname>""<guestemail>""<ScheduleCallsubject>""<ScheduleCallsitestaff>"
#    And I navigate to VisitDetails section and click on UnscheduledVisit option
#    And I must be able to navigate to ScheduleInfo section and should capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and must click on Schedule Visit
    And I navigate to Schedule a Call screen and capture "<title5>" click AddGuest and should capture "<guestname>""<guestemail>""<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and click on UnscheduledVisit option
    And I must navigate to ScheduleInfo section and must be able to capture the "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    And I launch Webmail capturing "<mailusername>""<mailpassword>" "<videoCallScheduled>" and check for GuestParticipant email Notification Call

    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and select WeekOne option
    And I click on CHRTSR Form and capture the options
    And I lick on QLEFQSEF Form and capture the options
    And I lick on SHAPS Form and capture "<enjoyTelevision>""<enjoyBeingWithFamily>""<pleasureInHobbies>""<enjoyFavouriteMeal>""<enjoyShower>""<pleasureInBread>""<enjoySeingZPeopleSmile>""<enjoyLookingSmart>""<enjoyReadingBook>""<enjoyTea>""<pleasureInSmallThings>""<enjoyView>""<pleasureFromHelpingOthers>""<pleasureFromPraise>"
    And I lick on GADSeven Form and capture "<GADname>" problems options and "<difficultToWork>"
    And I lick on CPFQ Form and capture "<motivationCPFQ>""<wakefullnessCPFQ>""<energyCPFQ>""<focusCPFQ>""<abilityToRememberCPFQ>""<abilityToFindWords>""<sharpnessCPFQ>"
    And I click on InsomniaSeverityIndex Form and capture the options
    And I click on QIDSSR Form and capture "<fallingAsleepQIDS>""<sleepDuringNightQIDS>""<wakingUpTooEarlyQIDS>""<sleepingTooMuchQIDS>""<feelingSadQIDS>""<decreasedAppetiteQIDS>""<increasedAppetiteQIDS>""<decreasedWeightQIDS>""<increasedWeightQIDS>""<concentrationQIDS>""<viewOfMyselfQIDS>""<thoughtsOfDeathQIDS>""<generalInterest>""<energyLevelQIDS>""<slowedDown>""<feelingRestless>"
    And I click on AAA Form and capture "<antiDepressent>""<daysAWeekNeeded>""<timesADayNeeded>""<takeDrugInPast>""<daysAWeek>""<timesADayUsuallyTake>""<pillsEachTime>""<pillsMissed>"
    And I should click PHQ form and and fill it Partially without submitting and click back button

    And I should navigate to WebApp and select WeekOne option and complete the full PHQ form

    And I navigate to JConnect Subject List enter "<subNum>" and fetch the record and under TreatmentVisits I should be able to change "<diaryWindowStartDateWeek3>" and "<diaryWindowEndDateWeek3>" for WeekThree

    And I click on SaveandNext and click Validate Credentials with "<username>""<password>" and click Signin
    And I capture "<SelectAuthorVisitStatementTestementType>" and save



    And I navigate to WebApp be able to find the StartDate and EndDate for WeekThree
    And I check the Submitbutton Visibility for the already SubmittedForms in WebApp
    Then I navigate to JConnect and retrieve the DiaryWindow and Status of the Visits



    And I navigate to JConnect Chat section click NewChat and capture "<users>""<subject>""<message>"

    And I should navigate to WebApp and navigate to Chat Option and capture "<message1>"
    And I navigate to JConnect Chat section and validate the chat


    And I navigate to Subject List and enter "<subject>" and should fetch the record
    And I click on SubjectDetails section and must click View Encrypted Data and retrieve the PhoneNum and Email
    And I navigate to Subject List and enter "<subject>" and must fetch the record and capture "<visit1>" check the forms for AUDIT CHRTSR PHQ
    And I navigate to Subject List and enter "<subject>" and fetch the record and capture "<visit1>" and must click AUDIT form and click AuditFormTrial and click on Export

    And I navigate to Subject List and enter "<subject>" and must fetch the record and click on send notification and capture "<message>" and send

    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and check the Notification Alert Message

    And I navigate to Subject List and enter "<subject>" and must fetch the record and visit SubjectDetails and change the status by capturing "<reasonForChange>"and save

    And I navigate to Subject List and enter "<subject>" and should fetch the record and check the Status
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and check access is inactivated message

    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch Screening meeting and should amend "<timehoursNew>""<timeminsNew>""<timetypeNew>" and reschedule call
    And I navigate to Subject List and enter "<subject>" and fetch the record and visit SubjectDetails and change the status to active by capturing "<reasonForChange1>"and save

    And I navigate to Subject List and enter "<subject>" and must fetch the record and must check the Status
    And I navigate to Subject List and enter "<subject>" and fetch the record and navigate to Visits section and click Withdrawn and capture "<withdrawnComments>" and save
    And I navigate to Subject List and enter "<subject>" and fetch the record and should check the Status






    Examples:
      | username     |password  |studyNum    |GADname|difficultToWork     |questionnaire1|questionnaire2|questionnaire3|questionnaire4|users   |message|message1|field1options|textfield|textfield2  |Field2option|Field1       |Singleselectopt|field21|field22|field |field4|TestField1|TestField2|TestField3|OptionstobeSlected|Field123|visit |visit1    |visit2            |visit3          |visit4|batterylink|time      |study     	     |site                                                  |title|title1     |title2 |title3        |title4|title5     |title6     |guestname|guestemail                         |ScheduleCallsitestaff   |sitestaff      |host|alert                    |calldurationMins    |calldurationHrs           |calldurationMins3|timeZone                                        |time1  |date        |diaryWindowStartDateWeek3|diaryWindowEndDateWeek3            |date1      |timehours|timemins|timetype|timehours1|timemins1   |timehoursNew|timeminsNew|timetypeNew|email                                  |role    |startDate          |language|       username     |password  |WebAppTimeZone                                   |PhoneCode|eDiaryLogin               	    |videoCallScheduled  |site                                                    |reasonForChange|reasonForChange1|withdrawnComments|mailusername                            |mailpassword    |subject         |ScheduleCallsubject  | phoneNum |subNum   | subExtID        |firstname    |lastname |phoneCode      |email                      |role    |startDate      |language|frequencyOfAlcohol       |nOfDrinks|sixOrMoreDrinks  |stopDrinkingOnceStarted|failedToDo       |heavyDrinkingSeason|feelingGuilt     |unableToRemember |injured|cutDown|antiDepressent|daysAWeekNeeded|timesADayNeeded|takeDrugInPast|daysAWeek|timesADayUsuallyTake|pillsEachTime|pillsMissed|enjoyTelevision|enjoyBeingWithFamily|pleasureInHobbies|enjoyFavouriteMeal|enjoyShower|pleasureInBread|enjoySeingZPeopleSmile|enjoyLookingSmart|enjoyReadingBook|enjoyTea|pleasureInSmallThings|enjoyView|pleasureFromHelpingOthers|pleasureFromPraise|motivationCPFQ|wakefullnessCPFQ|energyCPFQ|focusCPFQ|abilityToRememberCPFQ|abilityToFindWords|sharpnessCPFQ|fallingAsleepQIDS                                 |sleepDuringNightQIDS      |wakingUpTooEarlyQIDS                                                     |sleepingTooMuchQIDS                                                     |feelingSadQIDS    |decreasedAppetiteQIDS             |increasedAppetiteQIDS               |decreasedWeightQIDS           |increasedWeightQIDS         |concentrationQIDS                                                       |viewOfMyselfQIDS                                                |thoughtsOfDeathQIDS               |thoughtsOfDeathQIDS1                                             |generalInterest                                           |energyLevelQIDS                   |slowedDown                                         |feelingRestless|SelectAuthorVisitStatementTestementType|
      | JASC2        |Pass@123  |ALTO-100-005|GAD    |Not Difficult at All|CHRT-SR12     |QIDS-SR       |PHQ-9         |GAD-7         |Dan nick|Hi     |Hello  |opt1         |test2    |test2       |Yes         |Test3       |opt1            |3      |Test4  | Test5|yes   |Test1     |Test2     |Test3     |Options 1 &3      |opt1    |ICF    |Screening|SAFER Interview   |Week -1 Baseline|Week 1|Link       |day       |ALTO-100-005       |160 - The Bishop Center for Translational Neuroscience|ICF  |Screening  |  Safer|Week1BaseLine |Week 1|Unscheduled|UN_SC_Call1|pram     |pramoth.vm@alphaclinicalsystems.com|JSA SC                 |JSA SC         |JA SC|5 minutes before call   |10 minutes           |2 hours                   |0               |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:02 pm|07-Nov-2022 |16-Dec-2022              |30-Dec-2022                        |7-Dec-2022|07      |10      |pm        |03          |10          |11         |10         |pm         |pramoth.vm@alphaclinicalsystems.com     |Subject |7-Dec-2022        |English |       JASC2        |Pass@123  |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|91       |eDiary Login Information          |Video Call Scheduled|160 - The Bishop Center for Translational Neuroscience  |inactive       |Active          |Withdrawn        |pramoth.vm@alphaclinicalsystems.com      |Start@123       |AA703           |AA703                |6995523346|AA703   |AAA70302           |AA703        |A4       |+91           | pramoth.vm@jivascience.com|Subject |02-Nov-2022    |English |Monthly or less          |3 or 4   |Less than monthly|Less than monthly      |Less than monthly|Less than monthly  |Less than monthly|Less than monthly|No     |No     |Yes           |As needed      |0 times a day  | Yes          |0 days    |1 time a day        |0 pills      |1 time    |Disagree      |Disagree             |Disagree        |Disagree          |Disagree   |Disagree       |Disagree              |Disagree         |Disagree        |Disagree|Disagree             |Disagree |Disagree                 |Disagree          |Normal        |Normal          |Normal    |Normal   |Normal               |Normal            |Normal       |I never take longer than 30 minutes to fall asleep|I do not wake up at night|Most of the time, I awaken no more than 30 minutes before I need to get up|I sleep no longer than 7-8 hours/night, without napping during the day  |I do not feel sad|My usual appetite has not decreased|My usual appetite has not increased  |My weight has not decreased  |My weight has not increased|There is no change in my usual capacity to concentrate or make decisions |I see myself as equally worthwhile and deserving as other people|I do not think of suicide or death|I think of suicide or death several times a week for several minutes|I notice that I am less interested in people or activities|I get tired more easily than usual|I think, speak, and move at my usual rate of speed|I do not feel restless|I approve.                     |
