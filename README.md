# read-write-in-excel-testng-automation

### **Output**

View the excel file from this [**Excel File**](https://github.com/tanvirmitul/read-write-in-excel-testng-automation/files/10285738/read.write.xlsx)
### Technology: </br>
- Tool: Selenium Webdriver
- IDE: Intellij IDEA
- Build tool: Gradle
- Language: Java
- Testing Framework : TestNG

### Prerequisite: </br>
- Need to install jdk 11, gradle and allure
- Configure Environment variable for jdk 11, gradle and allure
- Clone this project and unzip it
- Open the project folder
- Double click on "build.gradle" and open it through IntellIJ IDEA
- Let the project build successfully
- Click on "Terminal" and run the automation scripts
### Run the Automation Script by the following command:
 ```
 gradle clean test 
 ```
- Selenium will open the browser and start automating.
- After automation to view allure report , give the following commands:
 ```
allure generate allure-results --clean -o allure-report
allure serve allure-results
 ```

**Below is my allure overview report**:

![allurereportoverview](https://user-images.githubusercontent.com/59876702/209106178-a85238b9-80fb-488a-9f92-24991675f111.png)

**Here is package of this project**:

![package](https://user-images.githubusercontent.com/59876702/209106293-47158ffa-2c19-4965-a2a7-6dea9bca7331.png)

**Here are the suites of this project**:

![Testsuitereport](https://user-images.githubusercontent.com/59876702/209106316-dfd8cd0f-7314-4ff0-b8a1-fa8f8eb65393.png)
