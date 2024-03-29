@workflow

Feature: Workflow - Creation of Subject and SchedulesFlow and validation CRIO Integration


   #JIRA:EZPRODSNR-5626 WorkFLow Scenario
  @testinCRIOIntegration
  Scenario Outline: Workflow - Creation of Subject with Scheduling Visits and CRIO Integration

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
    And I launch CRIO website and capture "<emailCRIO>""<passwordCRIO>" and click Signin
#    And I click on Subjects section and Add NewSubject and capture "<studyCRIO>""<firstname>""<gender>""<DOBCRIO>""<lastname>""<subNum>""<subExtID>"
    And I click on Subjects section and must Add NewSubject and capture "<firstname>""<gender>""<DOBCRIO>""<lastname>""<subNum>""<subExtID>"
#    And I navigate to CRIO website and Subject List and must enter "<subNum>" and fetch the record
    And I navigate to CRIO website and Subject List and must enter "<subNum>" and fetch the record and retrieve the External ID


     And I navigate toJConnect and click on Subject and CreateSubject Option and capture "<firstname>""<lastname>""<site>""<subNum>""<subExtID>""<phoneCode>""<phoneNum>""<email>""<role>""<startDate>""<language>"
     And I navigate to CRIO website and Subject List and must enter "<subNum>" and fetch the record
#    And I select ScheduleVisitWeekOneScreening and select the date and capture "<visitFromTime>""<visitToTime>"
#    And I select ScheduleVisitICF and select the date and capture "<visitFromTime>""<visitToTime>"
    And I select ScheduleVisitICF and must select the date and capture "<visitFromTime>""<visitToTime>"

    And I launch Webmail and must capture "<mailusername>""<mailpassword>"
    And I capture "<eDiaryLogin>" in searchbox and must retrieve the credentials

    And I launch the JConnect WebApp and must capture "<PhoneCode>""<phoneNum>""password and login and click Savebuton for TimeZone
#    And I launch the JConnect WebApp and capture "<PhoneCode>""<phoneNum>""password and login and click Savebuton for TimeZone
    Then I validate NoDiaryQuestionnarires and check for ICF in calls
    And I navigate to Jconnect CallSchedule and capture "<ScheduleCallsubject>" and launch the ICF meeting
#    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch the ICF meeting
    And I join the meeting fromJConnect
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and must join the meeting from WebApp and conclude

#    And I launch CRIO website and capture "<emailCRIO>""<passwordCRIO>" and click Signin
    And I launch the CRIO website
#    And I navigate to CRIO website and Subject List and must enter "<subNum>" and fetch the record
    And I must navigate to Subject List and must enter "<subNum>" and fetch the record
#    And I select ScheduleVisitICF and must select the date and capture "<visitFromTime>""<visitToTime>"
    And I select ScheduleVisitScreening and must select the date and capture "<visitFromTime>""<visitToTime>"

#    And I launch JConnect and capture "<username>""<password>" and click Signin
    And I launch JConnect and must capture "<username>""<password>" and click Signin
    And I click on JConnectBuild Option

    And I navigate to Jconnect CallSchedule must capture "<ScheduleCallsubject>" and launch Screening meeting
#    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch Screening meeting
    And I must join the meeting from JConnect
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and join the Screening meeting from WebApp and conclude

    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and select Screening in Diary section
    And I click on CHRTSR Form and capture the options
    And I click PHQ form and must capture the options
    And I click on AUDIT Form and capture "<frequencyOfAlcohol>""<nOfDrinks>""<sixOrMoreDrinks>""<stopDrinkingOnceStarted>""<failedToDo>""<heavyDrinkingSeason>""<feelingGuilt>""<unableToRemember>""<injured>""<cutDown>"
#    And I click on DiaryBack button and check Screening Status


    And I launch the CRIO website
    And I must navigate to Subject List and must enter "<subNum>" and fetch the record
#   And I select ScheduleVisitScreening and must select the date and capture "<visitFromTime>""<visitToTime>"
    And I select UnScheduleVisit and must select the date and capture "<visitFromTime>""<visitToTime>" and select the procuderes "<procedure1>""<procedure2>"


    And I launch JConnect and must capture "<username>""<password>" and click Signin
    And I click on JConnectBuild Option

#    And I navigate to Jconnect CallSchedule must capture "<ScheduleCallsubject>" and launch Screening meeting
    And I navigate to Jconnect CallSchedule must capture "<ScheduleCallsubject>" and launch UnScheduled meeting
    And I must join the meeting from JConnect
#    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and join the Screening meeting from WebApp and conclude
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and join the Unscheduled meeting from WebApp and conclude

#    And I navigate to WebApp and select the Unscheduled option
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and select the Unscheduled option under Diary section
#    And I must navigate to WebApp and select the Unscheduled option
    And I click on AUDIT Form and capture "<frequencyOfAlcohol>""<nOfDrinks>""<sixOrMoreDrinks>""<stopDrinkingOnceStarted>""<failedToDo>""<heavyDrinkingSeason>""<feelingGuilt>""<unableToRemember>""<injured>""<cutDown>"
    And I click on AAA Form and capture "<antiDepressent>""<daysAWeekNeeded>""<timesADayNeeded>""<takeDrugInPast>""<daysAWeek>""<timesADayUsuallyTake>""<pillsEachTime>""<pillsMissed>"

    And I launch the CRIO website
    And I must navigate to Subject List and must enter "<subNum>" and fetch the record
    And I select SaferVisit and must select the date and capture "<SafervisitFromTime>""<SafervisitToTime>"

#    And I launch JConnect and must capture "<username>""<password>" and click Signin
    And I launch JConnect and must capture "<username>""<password>" and should click Signin
    And I click on JConnectBuild Option

    And I navigate to Jconnect CallSchedule and must capture "<ScheduleCallsubject>" and launch SAFER Interview meeting
    And I must join the meeting from JConnect

    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and should join the Safer meeting from WebApp and conclude

    And I launch the CRIO website
    And I must navigate to Subject List and must enter "<subNum>" and fetch the record
    And I select WeekOne Baseline and must select the date and capture "<visitFromTime>""<visitToTime>"

    And I launch JConnect and must capture "<username>""<password>" and click Signin
    And I click on JConnectBuild Option

    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch WeekOneBaseline meeting
    And I must join the meeting from JConnect

    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and join the WeekOneBaseline meeting from WebApp and conclude



#    And I click on Subject and CreateSubject Option and capture "<firstname>""<lastname>""<site>""<subNum>""<subExtID>""<phoneCode>""<phoneNum>""<email>""<role>""<startDate>""<language>"
#    And I validate the Screening checkbox and WeekOneBaseLine checkbox in the PrepaymentVisit section
#    And I navigate to Subject List and must enter "<subNum>" and fetch the record
#    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to Schedule a Call screen and must capture "<title>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
#    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
#    And I must navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
#    And I navigate to Subject List and enter "<subNum>" and fetch the record
#    Then I validate the Screening checkbox and click summary and check ICF Visit Status
##    And I launch AmazonWebmail and capture "<mailusername>""<mailpassword>"
##    And I capture "<eDiaryLogin>" in searchbox and retrieve the credentials
#
#    And I launch Webmail and capture "<mailusername>""<mailpassword>"
#    And I capture "<eDiaryLogin>" in searchbox and must retrieve the credentials
#
#    And I launch the JConnect WebApp and capture "<PhoneCode>""<phoneNum>""password and login and click Savebuton for TimeZone
#    Then I validate NoDiaryQuestionnarires and check for ICF in calls
#    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch the ICF meeting
##    And I join the meeting fromJConnect
#    And I must join the meeting from JConnect
##    And I launch the JConnect WebApp with "<PhoneCode>""<phoneNum>" password and join the meeting from WebApp and conclude
#
##    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and join the meeting from WebApp and conclude
#    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and must join the meeting from WebApp and conclude
#
#    And I launch JConnect and capture "<username>""<password>" and click Signin
#    And I click on JConnectBuild Option
#    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to CallSchedule and ScheduleTelevisit for Screening and should capture "<title1>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
#    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit1>""<batterylink>"
#    And I must be able to navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
#    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and click on Screening
#    And I click on CHRTSR Form and capture the options
#    And I click PHQ form and must capture the options
#    And I click on AUDIT Form and capture "<frequencyOfAlcohol>""<nOfDrinks>""<sixOrMoreDrinks>""<stopDrinkingOnceStarted>""<failedToDo>""<heavyDrinkingSeason>""<feelingGuilt>""<unableToRemember>""<injured>""<cutDown>"
#    And I click on DiaryBack button and check Screening Status
#    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to CallSchedule and ScheduleTelevisit for SaferVisit and should capture "<title2>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
#    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit2>""<batterylink>"
#    And I must be able to navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
#    And I navigate to Subject List and enter "<subNum>" and fetch the record
#    And I validate the Screening checkbox and click summary and check Summary
#    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch SAFER Interview meeting
##    And I join the meeting fromJConnect
#    And I must join the meeting from JConnect
##    And I launch the JConnect WebApp with "<PhoneCode>""<phoneNum>" password and join the Safer meeting from WebApp and conclude
#
##    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and join the Safer meeting from WebApp and conclude
#    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and must join the Safer meeting from WebApp and conclude
#
#    And I launch JConnect and capture "<username>""<password>" and click Signin
#    And  I click on JConnectBuild Option
#    And I navigate to Subject List and enter "<subNum>" and fetch the record
#    And I click on ScreeningPass
#    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to CallSchedule and ScheduleTelevisit for WeekOneBaseLine and should capture "<title3>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
#    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit3>""<batterylink>"
#    And I must navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
#    And I navigate to Subject List and enter "<subNum>" and fetch the record
#    And I select WeekOneBaseline check box ans SafetyFollowUp checkbox and click SaveandNext




    Examples:
      | username                                |password   |studyNum    |studyCRIO                                   |emailCRIO                                         |passwordCRIO |gender|DOBCRIO        |visitFromTime |visitToTime|SafervisitFromTime|SafervisitToTime       |procedure1               |procedure2            |GADname|difficultToWork     |questionnaire1|questionnaire2|questionnaire3|questionnaire4|users   |message|message1|field1options|textfield|textfield2  |Field2option|Field1       |Singleselectopt|field21|field22|field |field4|TestField1|TestField2|TestField3|OptionstobeSlected|Field123|visit |visit1    |visit2            |visit3          |visit4|batterylink|time      |study     	     |site                                                  |title|title1     |title2 |title3        |title4|title5     |title6     |guestname|guestemail                          |ScheduleCallsitestaff |sitestaff     |host|alert                    |calldurationMins    |calldurationHrs           |timeZone                                        |time1  |date        |diaryWindowStartDateWeek3|diaryWindowEndDateWeek3            |date1      |timehours|timemins|timetype|timehours1|timemins1   |timehoursNew|timeminsNew|timetypeNew|email                                   |role    |startDate          |language|       username     |password  |PhoneCode|eDiaryLogin               	     |videoCallScheduled  |site                                                    |reasonForChange|reasonForChange1|withdrawnComments|mailusername                            |mailpassword    |subject         |ScheduleCallsubject  | phoneNum |subNum   | subExtID        |firstname    |lastname |phoneCode      |email                              |role    |startDate      |language|frequencyOfAlcohol       |nOfDrinks|sixOrMoreDrinks  |stopDrinkingOnceStarted|failedToDo       |heavyDrinkingSeason|feelingGuilt     |unableToRemember |injured|cutDown|antiDepressent|daysAWeekNeeded|timesADayNeeded|takeDrugInPast|daysAWeek|timesADayUsuallyTake|pillsEachTime|pillsMissed|enjoyTelevision|enjoyBeingWithFamily|pleasureInHobbies|enjoyFavouriteMeal|enjoyShower|pleasureInBread|enjoySeingZPeopleSmile|enjoyLookingSmart|enjoyReadingBook|enjoyTea|pleasureInSmallThings|enjoyView|pleasureFromHelpingOthers|pleasureFromPraise|motivationCPFQ|wakefullnessCPFQ|energyCPFQ|focusCPFQ|abilityToRememberCPFQ|abilityToFindWords|sharpnessCPFQ|fallingAsleepQIDS                                 |sleepDuringNightQIDS      |wakingUpTooEarlyQIDS                                                     |sleepingTooMuchQIDS                                                     |feelingSadQIDS    |decreasedAppetiteQIDS             |increasedAppetiteQIDS               |decreasedWeightQIDS           |increasedWeightQIDS         |concentrationQIDS                                                       |viewOfMyselfQIDS                                                |thoughtsOfDeathQIDS               |thoughtsOfDeathQIDS1                                             |generalInterest                                           |energyLevelQIDS                   |slowedDown                                         |feelingRestless|SelectAuthorVisitStatementTestementType|
      | joshna@alphaclinicalsystems.com         |Pass@123   |ALTO-100-005| Alto Neuroscience, Inc. - ALTO-100-003     |joshna@alphaclinicalsystems.com                   |Pass@123    |Male   |29-NOV-1990    |11:00AM       |2:00AM     |2:00PM            |4:00PM                 |Unscheduled Visit: AUDIT |Unscheduled Visit: AAA|GAD    |Not Difficult at All|CHRT-SR12     |QIDS-SR       |PHQ-9         |GAD-7         |Dan nick|Hi     |Hello  |opt1         |test2    |test2       |Yes         |Test3       |opt1            |3      |Test4  | Test5|yes   |Test1     |Test2     |Test3     |Options 1 &3      |opt1    |ICF    |Screening|SAFER Interview   |Week -1 Baseline|Week 1|Link       |day       |ALTO-100-005       |CrioTestSite                                         |ICF  |Screening  |  Safer|Week1BaseLine |Week 1|Unscheduled|UN_SC_Call1|pram     |pramoth.vm@alphaclinicalsystems.com|JA SC                 |JA SC         |JA SC|5 minutes before call   |0 minutes           |1 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:02 pm|07-Nov-2022 |16-Dec-2022              |30-Dec-2022                        |28-Nov-2022|01       |01      |pm      |03        |20          |05          |10         |pm         |pramoth.vm@alphaclinicalsystems.com     |Subject |5-Dec-2022        |English |       JASC2        |Pass@123  |91       |eDiary Login Information          |Video Call Scheduled|160 - The Bishop Center for Translational Neuroscience  |inactive       |Active          |Withdrawn        |pramoth.vm@alphaclinicalsystems.com     |Start@123       |AA342           |AA582                |3334208877|AA582   |BAA5821          |AA582        |A4       |+91           | pramoth.vm@alphaclinicalsystems.com |Subject |3-Dec-2022    |English |Monthly or less          |3 or 4   |Less than monthly|Less than monthly      |Less than monthly|Less than monthly  |Less than monthly|Less than monthly|No     |No     |Yes           |As needed      |0 times a day  | Yes          |0 days    |1 time a day        |0 pills      |1 time    |Disagree      |Disagree             |Disagree        |Disagree          |Disagree   |Disagree       |Disagree              |Disagree         |Disagree        |Disagree|Disagree             |Disagree |Disagree                 |Disagree          |Normal        |Normal          |Normal    |Normal   |Normal               |Normal            |Normal       |I never take longer than 30 minutes to fall asleep|I do not wake up at night|Most of the time, I awaken no more than 30 minutes before I need to get up|I sleep no longer than 7-8 hours/night, without napping during the day  |I do not feel sad|My usual appetite has not decreased|My usual appetite has not increased  |My weight has not decreased  |My weight has not increased|There is no change in my usual capacity to concentrate or make decisions |I see myself as equally worthwhile and deserving as other people|I do not think of suicide or death|I think of suicide or death several times a week for several minutes|I notice that I am less interested in people or activities|I get tired more easily than usual|I think, speak, and move at my usual rate of speed|I do not feel restless|I approve.                     |
