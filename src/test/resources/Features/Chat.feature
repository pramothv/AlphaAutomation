@testing
Feature: Create Subject and Schedule1234chat


  @testinsamwerchat
  Scenario Outline: CallSchedule with different ScheduleCallsubject12chat

Given I capture "<username>""<password>" and click Signin
When I click on JConnectBuild Option


    And I navigate to JConnect Chat section click NewChat and capture "<users>""<subject>""<message>"
#    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and select WeekOne Baseline option
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and select Unscheduled option
#    And I navigate to WebApp and navigate to Chat Option and capture "<message1>"
    And I must navigate to WebApp and navigate to Chat Option and capture "<message1>"
    And I navigate to JConnect Chat section and validate the chat




Examples:
| username     |password  | users   |message|message1|PhoneCode|phoneNum  |visit |title6     |questionnaire1|questionnaire2|questionnaire3|questionnaire4|batterylink|time      |study     	       |timehours|timemins|timetype|site                                                  |title|guestname|guestemail                |ScheduleCallsubject        |ScheduleCallsubject1|ScheduleCallsitestaff|subject1|subject  |sitestaff     |host|alert                  |calldurationMins    |calldurationHrs           |timeZone                                       |time1  |date        |date1          |email                     |role    |startDate  |language|
| JASC2        |Pass@123  | Dan nick|Hi     |Hello   |91       |8898000666|ICF    |UN_SC_Call1| CHRT-SR12     |QIDS-SR       |PHQ-9         |GAD-7         |Link     |day       |ALTO-100-005       |09       |09      |pm       |160 - The Bishop Center for Translational Neuroscience|ICF  |pram     |pramoth.vm@jivascience.com| AA207                    |AA60                |JA SC                 |AA60   |AA216    |JA SC         |JA SC|5 minutes before call   |0 minutes         |1 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:02 pm|07-Nov-2022|21-Nov-2022     |pramoth.vm@jivascience.com|Subject |Nad        |English |




  @testinsamwerchatforms
  Scenario Outline: CallSchedule with different ScheduleCallsubject12chat checkform

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password

#    And I navigate to WebApp and select the Unscheduled option
    And I navigate to WebApp and must select the Unscheduled option
#    And I click on QIDSSR Form and capture "<fallingAsleepQIDS>""<sleepDuringNightQIDS>""<wakingUpTooEarlyQIDS>""<sleepingTooMuchQIDS>""<feelingSadQIDS>""<decreasedAppetiteQIDS>""<increasedAppetiteQIDS>""<decreasedWeightQIDS>""<increasedWeightQIDS>""<concentrationQIDS>""<viewOfMyselfQIDS>""<thoughtsOfDeathQIDS1>""<generalInterest>""<energyLevelQIDS>""<slowedDown>""<feelingRestless>"
    And I should click PHQ form and must capture the options and select Option Two for hurting Yourself
    And I click on CHRTSR Form and capture the options and select Option ten eleven and twelve as Strongly Agree




    Examples:
      | username     |password  | users   |message|message1|PhoneCode|phoneNum  |visit |title6     |questionnaire1|questionnaire2|questionnaire3|questionnaire4|batterylink|time      |study     	       |timehours|timemins|timetype|site                                                  |title|guestname|guestemail                |ScheduleCallsubject        |ScheduleCallsubject1|ScheduleCallsitestaff|subject1|subject  |sitestaff     |host|alert                  |calldurationMins    |calldurationHrs           |timeZone                                       |time1  |date        |date1          |email                     |role    |startDate  |language|
      | JASC2        |Pass@123  | Dan nick|Hi     |Hello   |91       |8890010066|ICF    |UN_SC_Call1| CHRT-SR12     |QIDS-SR       |PHQ-9         |GAD-7         |Link     |day       |ALTO-100-005       |09       |09      |pm       |160 - The Bishop Center for Translational Neuroscience|ICF  |pram     |pramoth.vm@jivascience.com| AA207                    |AA60                |JA SC                 |AA60   |AA216    |JA SC         |JA SC|5 minutes before call   |0 minutes         |1 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:02 pm|07-Nov-2022|21-Nov-2022     |pramoth.vm@jivascience.com|Subject |Nad        |English |