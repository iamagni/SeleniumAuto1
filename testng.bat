set projectLocation=E:\driver\JavaWorkspace\AutomationTest1
cd %projectLocation%
set classpath=%projectLocation%\bin;
java org.testng.TestNG %projectLocation%\testng.xml
