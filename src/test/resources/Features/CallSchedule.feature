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
    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" with meeting

#    And I join the meeting from JConnect and from Webapp and conclude the call
#    And I join the meeting and join the meeting from Webapp and end



Examples:
| username     |password  |ScheduleCallsubject1   |ScheduleCallsubject|
| JASC2        |Pass@123  | AA45(AA45 Ad)        |AA45                 |