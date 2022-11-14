@testing5
Feature: CallSchedule1


  @testinsamwer444
  Scenario Outline: CallSchedule with different ScheduleCallsubject12444

    And I launch the JConnect WebApp and capture "<PhoneCode>""<phoneNum>" and password and login



    Examples:
      |PhoneCode     |phoneNum     |ScheduleCallsubject   |
      |91            |9099901767   | AA45(AA45 Ad)        |


  @testinsamwer4441
  Scenario Outline: CallSchedule with different ScheduleCallsubject124441

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option
    And I navigate to Jconnect CallSchedule capture the "<ScheduleCallsubject>" with meeting
#    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" with meeting

    Examples:
      |username        |password     |ScheduleCallsubject   |
      |JASC2            |Pass@123     | AA45        |