@workflow

Feature: SmokeTest - Principal Investigator: EZPRODSNR-4772


   #JIRA:SmokeTest EZPRODSNR-4731 EZPRODSNR-4667
  @testingSmokeTest4772
  Scenario Outline: SmokeTest - Principal Investigator: EZPRODSNR-4772


#    Given I capture "<username>""<password>" and click Signin
    Given I capture "<username1>""<password1>" and must click Signin
#    When I click on JConnectBuild Option
    When I navigate to Welcome screen and select the JConnectBuild Option
    And I check the Site and Study Information in the Page Header
    And I change the Study by capturing "<study2>" and check the same in the Page Header
    And I change the Study by capturing "<study1>"
    And I check the List of Menu Items in the LeftSide
    And I navigate to StudyList section and check the list of Studies available in the table
    And I capture "<studyNum>" and must fetch the record and click on the Study Link and check the Study and Mapped Organisations Tabs
#    And I click on Subject and CreateSubject Option and capture "<firstname>""<lastname>""<site>""<subNum>""<subExtID>""<phoneCode>""<phoneNum>""<email>""<role>""<startDate>""<language>"
    And I click on Subject and CreateSubject Option and must capture "<firstname>""<lastname>""<site>""<subNum>""<subExtID>""<phoneCode>""<phoneNum>""<email>""<role>""<startDate>""<language>"
    And I must be able to navigate between the Tabs in Create Subject
    And I navigate to SubjectList section and click on the FirstSubjectNumber HyperLink and land on Visits section by default
#    And I navigate to StudyList section and click on the FirstSubjectNumber HyperLink and land on Visits section by default
    And I click on previous button in Visits Tab and land on SubjectDetails Section and go back to Visits section and then directly click on SubjectDetails Tab
    And I click on SubjectDetails section and click View Encrypted Data and retrieve the PhoneNum and Email
    And I navigate to SummarySection and retrieve the SubjectNumber
    And I should be able to switch between tabs by clicking on Next and Previuos buttons


    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
    And I navigate to Schedule a Call screen and must capture "<title>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
    And I must navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"


    And I logout of current Jconnect and login again by capturing "<username>""<password>" and must click Signin
    And I click on JConnectBuild Option
  #    And I navigate to Subject List and enter "<subNum1>" and fetch the record
    And I navigate to Subject List and enter "<subNum1>" and fetch the record and capture "<visit1>" check the forms for AUDIT CHRTSR PHQ
    And I navigate to Subject List and enter "<subNum1>" and fetch the record and capture "<visit1>" and click AUDIT form and click AuditFormTrial and click on Export and click Backbutton and Action and RecordAuditTrial and again backbutton
    And I logout of current Jconnect and login again by capturing "<username1>""<password1>" and must click Signin
    And I click on JConnectBuild Option
    And I should be able to navigate to Migration section under Subject Tab
    And I should be able to navigate to Download section under Subject Tab
   And I navigate to UserManagement List Tab and capture "<name>" and click Next and Next and Previous buttons
    And I navigate to MyAccount section and check the Title and Email
    And I navigate to CallSchedule Section and click on ScheduleTelevisit button and check the Schedule a Call PopUp screen
    And I navigate to CallSchedule Section and capture "<time>" and check the meetingcall and click on the meetingcall and check the Schedule a Call PopUp screen
    And I navigate to JConnect Chat section and click NewChat and capture "<users>""<subject3>""<message>"
    And I navigate to Audit Reports section and click Call History and capture "<study>""<site>" and search






    Examples:
      | username     |username1|password  |password1|studyNum    |subNum1|name |time|GADname|difficultToWork     |questionnaire1|questionnaire2|questionnaire3|questionnaire4|users   |message|message1|field1options|textfield|textfield2  |Field2option|Field1       |Singleselectopt|field21|field22|field |field4|TestField1|TestField2|TestField3|OptionstobeSlected|Field123|visit |visit1    |visit2            |visit3          |visit4|batterylink|time      |study     	     |study1        |study2      |site                                                  |title|title1     |title2 |title3        |title4|title5     |title6     |guestname|guestemail                          |ScheduleCallsitestaff |sitestaff     |host|alert                    |calldurationMins    |calldurationHrs           |timeZone                                        |time1  |date        |diaryWindowStartDateWeek3|diaryWindowEndDateWeek3            |date1      |timehours|timemins|timetype|timehours1|timemins1   |timehoursNew|timeminsNew|timetypeNew|email                                   |WebAppTimeZone                                 |role    |startDate          |language|       username     |password  |PhoneCode|eDiaryLogin               	     |videoCallScheduled  |site                                                    |reasonForChange|reasonForChange1|withdrawnComments|mailusername                            |subject3|mailpassword    |subject         |ScheduleCallsubject  | phoneNum |subNum   | subExtID        |firstname    |lastname |phoneCode      |email                             |role    |startDate      |language|frequencyOfAlcohol       |nOfDrinks|sixOrMoreDrinks  |stopDrinkingOnceStarted|failedToDo       |heavyDrinkingSeason|feelingGuilt     |unableToRemember |injured|cutDown|antiDepressent|daysAWeekNeeded|timesADayNeeded|takeDrugInPast|daysAWeek|timesADayUsuallyTake|pillsEachTime|pillsMissed|enjoyTelevision|enjoyBeingWithFamily|pleasureInHobbies|enjoyFavouriteMeal|enjoyShower|pleasureInBread|enjoySeingZPeopleSmile|enjoyLookingSmart|enjoyReadingBook|enjoyTea|pleasureInSmallThings|enjoyView|pleasureFromHelpingOthers|pleasureFromPraise|motivationCPFQ|wakefullnessCPFQ|energyCPFQ|focusCPFQ|abilityToRememberCPFQ|abilityToFindWords|sharpnessCPFQ|fallingAsleepQIDS                                 |sleepDuringNightQIDS      |wakingUpTooEarlyQIDS                                                     |sleepingTooMuchQIDS                                                     |feelingSadQIDS    |decreasedAppetiteQIDS             |increasedAppetiteQIDS               |decreasedWeightQIDS           |increasedWeightQIDS         |concentrationQIDS                                                       |viewOfMyselfQIDS                                                |thoughtsOfDeathQIDS               |thoughtsOfDeathQIDS1                                             |generalInterest                                           |energyLevelQIDS                   |slowedDown                                         |feelingRestless|SelectAuthorVisitStatementTestementType|
      | garish        |JAPI2   |Pass@123  |Pass@123 |ALTO-100-005|AA502  |JA PI|week|GAD    |Not Difficult at All|CHRT-SR12     |QIDS-SR       |PHQ-9         |GAD-7         |Dan nick|Hi     |Hello  |opt1         |test2    |test2       |Yes         |Test3       |opt1            |3      |Test4  | Test5|yes   |Test1     |Test2     |Test3     |Options 1 &3      |opt1    |ICF    |Screening|SAFER Interview   |Week -1 Baseline|Week 1|Link       |day       |ALTO-100-005       |ALTO-100-005|ALTO-100-004|160 - The Bishop Center for Translational Neuroscience|ICF  |Screening  |  Safer|Week1BaseLine |Week 1|Unscheduled|UN_SC_Call1|pram     |pramoth.vm@alphaclinicalsystems.com|JA SC                 |JA SC         |JA SC|5 minutes before call   |0 minutes           |1 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:02 pm|07-Nov-2022 |16-Dec-2022              |30-Dec-2022                        |30-Nov-2022|12       |01      |pm      |03        |20          |05          |10         |pm         |pramoth.vm@alphaclinicalsystems.com     |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|Subject |30-Nov-2022        |English |       JASC2        |Pass@123  |91       |eDiary Login Information          |Video Call Scheduled|160 - The Bishop Center for Translational Neuroscience  |inactive       |Active          |Withdrawn        |pramoth.vm@alphaclinicalsystems.com     |A6(A6 A4)  |Start@123       |AA442           |AA442                |5111223303|AA4576   |AAAAA45761          |AA4576        |A4       |+91           | pramoth.vm@alphaclinicalsystems.com|Subject |01-Dec-2022    |English |Monthly or less          |3 or 4   |Less than monthly|Less than monthly      |Less than monthly|Less than monthly  |Less than monthly|Less than monthly|No     |No     |Yes           |As needed      |0 times a day  | Yes          |0 days    |1 time a day        |0 pills      |1 time    |Disagree      |Disagree             |Disagree        |Disagree          |Disagree   |Disagree       |Disagree              |Disagree         |Disagree        |Disagree|Disagree             |Disagree |Disagree                 |Disagree          |Normal        |Normal          |Normal    |Normal   |Normal               |Normal            |Normal       |I never take longer than 30 minutes to fall asleep|I do not wake up at night|Most of the time, I awaken no more than 30 minutes before I need to get up|I sleep no longer than 7-8 hours/night, without napping during the day  |I do not feel sad|My usual appetite has not decreased|My usual appetite has not increased  |My weight has not decreased  |My weight has not increased|There is no change in my usual capacity to concentrate or make decisions |I see myself as equally worthwhile and deserving as other people|I do not think of suicide or death|I think of suicide or death several times a week for several minutes|I notice that I am less interested in people or activities|I get tired more easily than usual|I think, speak, and move at my usual rate of speed|I do not feel restless|I approve.                     |
