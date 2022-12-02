@testing
Feature: Create Subject and Schedule1234


  @testinsamwer
Scenario Outline: CallSchedule with different ScheduleCallsubject12

Given I capture "<username>""<password>" and click Signin
When I click on JConnectBuild Option
#    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to Schedule a Call screen and must capture "<title>" "<ScheduleCallsubject>""<ScheduleCallsitestaff>"
#    And I navigate to VisitDetails section and select ScheduleVisit and capture "<visit>""<batterylink>"
#    And I navigate to ScheduleInfo section and must capture "<date1>""<time1>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
#    And I navigate to Subject List and enter "<subNum>" and fetch the record
#    And I validate the Screening checkbox and click summary and check ICF Visit Status

#   And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch the ICF meeting

#   And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>"
#    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" with meeting

#    And I join the meeting from JConnect and from Webapp and conclude the call
#    And I join the meeting and join the meeting from Webapp and end



Examples:
| username     |password  |ScheduleCallsubject1   |ScheduleCallsubject|
| JASC2        |Pass@123  | AA45(AA45 Ad)        |AA45                 |



  @testinCallSchedulecont222unsc
  Scenario Outline: CallSchedule with different ScheduleCallsubject1222 un

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option


    And I click on CallSchedule and capture "<time>""<study>""<site>""<subject>""<sitestaff>" and click on Schedule Visit
#    And I navigate to Schedule a Call screen and capture "<title6>" click AddGuest and must capture "<guestname>""<guestemail>""<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to Schedule a Call screen and must be able to capture "<title6>""<ScheduleCallsubject>""<ScheduleCallsitestaff>"
    And I navigate to VisitDetails section and click on UnscheduledVisit option
    And I navigate to Questionnaire and capture "<questionnaire1>""<questionnaire2>""<questionnaire3>""<questionnaire4>"
#    And I should be able to navigate to ScheduleInfo section and capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"
    And I should be able to navigate to ScheduleInfo section and must capture "<date1>""<timehours>""<timemins>""<timetype>""<timeZone>""<calldurationHrs>""<calldurationMins>""<alert>"

    Examples:
      | username     |password  | visit |title6     |questionnaire1|questionnaire2|questionnaire3|questionnaire4|batterylink|time      |study     	       |timehours|timemins|timetype|site                                                  |title|guestname|guestemail                |ScheduleCallsubject        |ScheduleCallsubject1|ScheduleCallsitestaff|subject1|subject  |sitestaff     |host|alert                  |calldurationMins    |calldurationHrs           |timeZone                                       |time1  |date        |date1          |email                     |role    |startDate  |language|
      | JASC2        |Pass@123  | ICF    |UN_SC_Call1| CHRT-SR12     |QIDS-SR       |PHQ-9         |GAD-7         |Link     |day       |ALTO-100-005       |09       |09      |pm       |160 - The Bishop Center for Translational Neuroscience|ICF  |pram     |pramoth.vm@jivascience.com| AA207                    |AA60                |JA SC                 |AA60   | AA207   |JA SC         |JA SC|5 minutes before call   |0 minutes         |1 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:02 pm|07-Nov-2022|21-Nov-2022     |pramoth.vm@jivascience.com|Subject |Nad        |English |
