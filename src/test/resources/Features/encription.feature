@testingen
Feature: Create Subject and Schedule1234chaten


  @testinsamwerchaten
  Scenario Outline: CallSchedule with different ScheduleCallsubject12chaten

    Given I capture "<username>""<password>" and click Signin
    When I click on JConnectBuild Option

    And I navigate to Subject List and enter "<subject>" and fetch the record
    And I click on SubjectDetails section and click View Encrypted Data and retrieve the PhoneNum and Email
    And I navigate to Subject List and enter "<subject>" and fetch the record and capture "<visit1>" check the forms for AUDIT CHRTSR PHQ
    And I navigate to Subject List and enter "<subject>" and fetch the record and capture "<visit1>" and click AUDIT form and click AuditFormTrial and click on Export
    And I navigate to Subject List and enter "<subject>" and fetch the record and click on send notification and capture "<message>" and send
    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password
    And I check the notification message
    And I navigate to Subject List and enter "<subject>" and fetch the record and visit SubjectDetails and change the status by capturing "<reasonForChange>"and save
    And I navigate to Subject List and enter "<subject>" and fetch the record and check the Status
#    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch SAFER Interview meeting
    And I navigate to Jconnect CallSchedule capture "<ScheduleCallsubject>" and launch Screening meeting and amend "<timehours>""<timemins>""<timetype>" and reschedule call



#    And I navigate to JConnect Chat section click NewChat and capture "<users>""<subject>""<message>"
##    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and select WeekOne Baseline option
#    And I launch JConnect WebApp with "<PhoneCode>""<phoneNum>" password and select Unscheduled option
##    And I navigate to WebApp and navigate to Chat Option and capture "<message1>"
#    And I must navigate to WebApp and navigate to Chat Option and capture "<message1>"
#    And I navigate to JConnect Chat section and validate the chat




    Examples:
      | username     |password  | visit1   |users   |message|message1|PhoneCode|phoneNum  |reasonForChange|timehours|timemins|timetype|visit |title6     |questionnaire1|questionnaire2|questionnaire3|questionnaire4|batterylink|time      |study     	       |timehours|timemins|timetype|site                                                  |title|guestname|guestemail                |ScheduleCallsubject        |ScheduleCallsubject1|ScheduleCallsitestaff|subject1|subject  |sitestaff     |host|alert                  |calldurationMins    |calldurationHrs           |timeZone                                       |time1  |date        |date1          |email                     |role    |startDate  |language|
      | JASC2        |Pass@123  | Screening|Dan nick|Hi     |Hello   |91       |8001111875|inactive       |11       |59      |pm      |ICF    |UN_SC_Call1| CHRT-SR12     |QIDS-SR       |PHQ-9         |GAD-7         |Link     |day       |ALTO-100-005       |09       |09      |pm       |160 - The Bishop Center for Translational Neuroscience|ICF  |pram     |pramoth.vm@jivascience.com| AA207                    |AA60                |JA SC                 |AA60   |AA221    |JA SC         |JA SC|5 minutes before call   |0 minutes         |1 hours                   | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|1:02 pm|07-Nov-2022|21-Nov-2022     |pramoth.vm@jivascience.com|Subject |Nad        |English |