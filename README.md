
This is not a comprehensive test that encompasses all the possibilities that may occur during test rather, it is an exemplary test 

in which I just wanted to illustrate the employment of Selenium, Appium, Cucumber, and Java in testing projects. 

This test is based on some assumptions like the internet and location are on and you have a facebook account before running the test.




Before running this file,  make sure that your internet and location is on. 

Moreover, you have to modify a few things with regards to devices properties ; 


In CommonMethods.java, these parts must be changed with the properties of your phone; 

	cap.setCapability("platformName", "Android");
	cap.setCapability("deviceName", "330038ae578b93c9");
