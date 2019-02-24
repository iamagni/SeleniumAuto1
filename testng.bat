set projectLocation=E:\driver\JavaWorkspace\AutomationTest1
 
cd %projectLocation%
<<<<<<< HEAD
 
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
 
java org.testng.TestNG %projectLocation%\testng.xml
 
pause
=======
set classpath=%projectLocation%\bin;
java org.testng.TestNG %projectLocation%\testng.xml
>>>>>>> 105cbb83e43c96cc156bcc777400ac9f37a8e670
