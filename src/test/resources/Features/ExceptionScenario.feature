@workflow

Feature: Testing Exception


   #JIRA:EZPRODSNR-5626 WorkFLow Scenario
  @testingException
  Scenario Outline: Testing Exception


    Given I capture "<username>""<password>" and click Signin
    When I click on the JConnectBuild Option



    Examples:
      | username     |password  |studyNum    |GADname|difficultToWork     |field1options|textfield|textfield2  |Field2option|Field1       |Singleselectopt|field21|field22|field |field4|TestField1|TestField2|TestField3|OptionstobeSlected|Field123|visit |visit1    |visit2            |visit3          |visit4|batterylink|time      |study     	     |site                                                  |title|title1     |title2 |title3        |title4|title5     |guestname|guestemail                |ScheduleCallsitestaff |sitestaff     |host|alert                    |calldurationMins    |calldurationHrs           |timeZone                                        |time1  |date        |diaryWindowStartDateWeek3|diaryWindowEndDateWeek3            |date1      |timehours|timemins|timetype|email                     |role    |startDate          |language|       username     |password  |PhoneCode|eDiaryLogin               	    |videoCallScheduled  |site                                                    |mailusername|mailpassword    |subject         |ScheduleCallsubject  | phoneNum |subNum  | subExtID      |firstname    |lastname |phoneCode      |email                      |role    |startDate      |language|frequencyOfAlcohol       |nOfDrinks|sixOrMoreDrinks  |stopDrinkingOnceStarted|failedToDo       |heavyDrinkingSeason|feelingGuilt     |unableToRemember |injured|cutDown|antiDepressent|daysAWeekNeeded|timesADayNeeded|takeDrugInPast|daysAWeek|timesADayUsuallyTake|pillsEachTime|pillsMissed|enjoyTelevision|enjoyBeingWithFamily|pleasureInHobbies|enjoyFavouriteMeal|enjoyShower|pleasureInBread|enjoySeingZPeopleSmile|enjoyLookingSmart|enjoyReadingBook|enjoyTea|pleasureInSmallThings|enjoyView|pleasureFromHelpingOthers|pleasureFromPraise|motivationCPFQ|wakefullnessCPFQ|energyCPFQ|focusCPFQ|abilityToRememberCPFQ|abilityToFindWords|sharpnessCPFQ|fallingAsleepQIDS                                 |sleepDuringNightQIDS      |wakingUpTooEarlyQIDS                                                     |sleepingTooMuchQIDS                                                     |feelingSadQIDS    |decreasedAppetiteQIDS             |increasedAppetiteQIDS               |decreasedWeightQIDS           |increasedWeightQIDS         |concentrationQIDS                                                       |viewOfMyselfQIDS                                                |thoughtsOfDeathQIDS               |generalInterest                                           |energyLevelQIDS                   |slowedDown                                         |feelingRestless|SelectAuthorVisitStatementTestementType|
      | JASC2        |Pass@123  |ALTO-100-005|GAD    |Not Difficult at All|opt1         |test2    |test2       |Yes         |Test3       |opt1            |3      |Test4  | Test5|yes   |Test1     |Test2     |Test3     |Options 1 &3      |opt1    |ICF    |Screening|SAFER Interview   |Week -1 Baseline|Week 1|Link       |day       |ALTO-100-005       |160 - The Bishop Center for Translational Neuroscience|ICF  |Screening  |  Safer|Week1BaseLine |Week 1|Unscheduled|pram     |pramoth.vm@jivascience.com|JA SC                 |JA SC         |JA SC|5 minutes before call   |0 minutes           |1 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:02 pm|07-Nov-2022 |14-Nov-2022              |30-Nov-2022                        |14-Nov-2022|04       |15      |pm      |pramoth.vm@jivascience.com|Subject |12-Nov-2022        |English |       JASC2        |Pass@123  |91       |  eDiary Login Information        |Video Call Scheduled|160 - The Bishop Center for Translational Neuroscience  |  pramoth   |Start@123       |AA155           |AA155                |9000013700|AA155   |9AAA1557       |AA155        |A4       |    +91        | pramoth.vm@jivascience.com|Subject |02-Nov-2022    |English |Monthly or less          |3 or 4   |Less than monthly|Less than monthly      |Less than monthly|Less than monthly  |Less than monthly|Less than monthly|No     |No     |Yes           |As needed      |0 times a day  | Yes          |0 days    |1 time a day        |0 pills      |1 time    |Disagree      |Disagree             |Disagree        |Disagree          |Disagree   |Disagree       |Disagree              |Disagree         |Disagree        |Disagree|Disagree             |Disagree |Disagree                 |Disagree          |Normal        |Normal          |Normal    |Normal   |Normal               |Normal            |Normal       |I never take longer than 30 minutes to fall asleep|I do not wake up at night|Most of the time, I awaken no more than 30 minutes before I need to get up|I sleep no longer than 7-8 hours/night, without napping during the day  |I do not feel sad|My usual appetite has not decreased|My usual appetite has not increased  |My weight has not decreased  |My weight has not increased|There is no change in my usual capacity to concentrate or make decisions |I see myself as equally worthwhile and deserving as other people|I do not think of suicide or death|I notice that I am less interested in people or activities|I get tired more easily than usual|I think, speak, and move at my usual rate of speed|I do not feel restless|I approve.                     |
