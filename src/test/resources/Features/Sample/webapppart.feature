@workflow

Feature: sample SmokeTest Scenario - WebApp: EZPRODSNR-4667


   #JIRA:SmokeTest EZPRODSNR-4731 EZPRODSNR-4667
  @1testingSmokeTest473133
  Scenario Outline: sample SmokeTest Scenario- WebApp: EZPRODSNR-4667



    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and must click on Screening
    And I must check the available forms
    And I navigate to Calls Section and check the Upcoming and Past Calls
    And I check the Chat Section
    And I click on AddParticipants Icon
    And I click on More section and check the options
    And I check the Notifications section
#    And I click on TimeZone section and check the option
    And I click on TimeZone section and check the option and capture "<WebAppTimeZone>" and save
    And I click on Contact section and check the site
    And I click on MyProfile section and check the details
    And I click on LogOut and check the pop up alert message
    And I should be able to switch between Menu screens and try to submit form without capturing all the details
    And I logout of the WebApp application


    Examples:
      | username           |password  |studyNum    |GADname|difficultToWork     |questionnaire1|questionnaire2|questionnaire3|questionnaire4|users   |message|message1|field1options|textfield|textfield2  |Field2option|Field1       |Singleselectopt |field21|field22|field |field4|TestField1|TestField2|TestField3|OptionstobeSlected|Field123|visit |visit1    |visit2            |visit3          |visit4|batterylink|time      |study     	       |site                                                  |title|title1     |title2 |title3        |title4|title5     |title6     |guestname|guestemail                          |ScheduleCallsitestaff |sitestaff      |host|alert                    |calldurationMins    |calldurationHrs           |timeZone                                        |time1  |date        |diaryWindowStartDateWeek3|diaryWindowEndDateWeek3            |date1      |timehours|timemins|timetype|timehours1|timemins1   |timehoursNew|timeminsNew|timetypeNew|email                                   |WebAppTimeZone                                 |role    |startDate          |language|       username     |password  |PhoneCode|eDiaryLogin               	       |videoCallScheduled  |site                                                    |reasonForChange|reasonForChange1|withdrawnComments|mailusername                            |mailpassword    |subject   |ScheduleCallsubject | phoneNum |subNum   | subExtID |firstname    |lastname |phoneCode      |email                               |role    |startDate      |language|frequencyOfAlcohol       |nOfDrinks|sixOrMoreDrinks  |stopDrinkingOnceStarted|failedToDo       |heavyDrinkingSeason|feelingGuilt     |unableToRemember |injured|cutDown|antiDepressent|daysAWeekNeeded|timesADayNeeded|takeDrugInPast|daysAWeek|timesADayUsuallyTake|pillsEachTime|pillsMissed|enjoyTelevision|enjoyBeingWithFamily|pleasureInHobbies|enjoyFavouriteMeal|enjoyShower|pleasureInBread|enjoySeingZPeopleSmile|enjoyLookingSmart|enjoyReadingBook|enjoyTea|pleasureInSmallThings|enjoyView|pleasureFromHelpingOthers|pleasureFromPraise|motivationCPFQ|wakefullnessCPFQ|energyCPFQ|focusCPFQ|abilityToRememberCPFQ|abilityToFindWords|sharpnessCPFQ|fallingAsleepQIDS                                 |sleepDuringNightQIDS      |wakingUpTooEarlyQIDS                                                     |sleepingTooMuchQIDS                                                     |feelingSadQIDS    |decreasedAppetiteQIDS             |increasedAppetiteQIDS               |decreasedWeightQIDS           |increasedWeightQIDS         |concentrationQIDS                                                       |viewOfMyselfQIDS                                                |thoughtsOfDeathQIDS               |thoughtsOfDeathQIDS1                                             |generalInterest                                           |energyLevelQIDS                   |slowedDown                                         |feelingRestless|SelectAuthorVisitStatementTestementType|
      | JASC2              |Pass@123  |ALTO-100-005|GAD    |Not Difficult at All|CHRT-SR12     |QIDS-SR       |PHQ-9         |GAD-7         |Dan nick|Hi     |Hello   |opt1         |test2    |test2       |Yes         |Test3        |opt1            |3      |Test4  | Test5|yes   |Test1     |Test2     |Test3     |Options 1 &3      |opt1    |ICF    |Screening|SAFER Interview   |Week -1 Baseline|Week 1|Link       |day       |ALTO-100-005       |160 - The Bishop Center for Translational Neuroscience|ICF  |Screening  |  Safer|Week1BaseLine |Week 1|Unscheduled|UN_SC_Call1|pram     |pramoth.vm@alphaclinicalsystems.com |JSA SC                 |JSA SC         |JA SC|5 minutes before call   |0 minutes           |1 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:02 pm|07-Nov-2022 |16-Dec-2022              |30-Dec-2022                        |6-Dec-2022 |01       |01      |pm      |03        |20          |05          |10         |pm         |pramoth.vm@alphaclinicalsystems.com     |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|Subject |6-Dec-2022         |English |       JASC2        |Pass@123  |91       |eDiary Login Information          |Video Call Scheduled|160 - The Bishop Center for Translational Neuroscience  |inactive       |Active          |Withdrawn        |pramoth.vm@alphaclinicalsystems.com     |Start@123       |AA615     |AA615               |5112266573|AA615    |AAA6154   |AA615        |A4       |+91            | pramoth.vm@alphaclinicalsystems.com|Subject |02-Nov-2022    |English |Monthly or less          |3 or 4   |Less than monthly|Less than monthly      |Less than monthly|Less than monthly  |Less than monthly|Less than monthly|No     |No     |Yes           |As needed      |0 times a day  | Yes          |0 days    |1 time a day        |0 pills      |1 time    |Disagree      |Disagree             |Disagree        |Disagree          |Disagree   |Disagree       |Disagree              |Disagree         |Disagree        |Disagree|Disagree             |Disagree |Disagree                 |Disagree          |Normal        |Normal          |Normal    |Normal   |Normal               |Normal            |Normal       |I never take longer than 30 minutes to fall asleep|I do not wake up at night|Most of the time, I awaken no more than 30 minutes before I need to get up|I sleep no longer than 7-8 hours/night, without napping during the day  |I do not feel sad|My usual appetite has not decreased|My usual appetite has not increased  |My weight has not decreased  |My weight has not increased|There is no change in my usual capacity to concentrate or make decisions |I see myself as equally worthwhile and deserving as other people|I do not think of suicide or death|I think of suicide or death several times a week for several minutes|I notice that I am less interested in people or activities|I get tired more easily than usual|I think, speak, and move at my usual rate of speed|I do not feel restless|I approve.                     |
