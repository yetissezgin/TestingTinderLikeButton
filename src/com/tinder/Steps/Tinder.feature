Feature: Tinder Like Button Test

  Scenario: User opens Tinder then clicks connect-with-facebook-button and then allows the application to use the location feature. Later, user checks wheter there is somone to like on the screen, if not, waits for one to appear and when a profile appears, user likes all given profiles to the extend of the daily limit of an ordinary account. Lastly User checks wheter the total number of the likes is under 50
  				
    Given user opens Tinder application
    Then user clicks connect-with-facebook-button 
    Then user allows the applicaton to use the location feature
    Then user is on the main page waits for a profile recommendation
    When a profile appears, user starts liking all recommended profiles
    When it comes to the last profile, the total number of the likes is checked
    

    
 