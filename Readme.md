**This assessment was done using maven.**

---

## Frameworks Used

1. Selenium
2. Cucumber
3. Test-NG and JUnit

---


## How To Run Tests 

- Operating System used is **Mac OS**, please ensure you download the driver version for your OS before execution
- On the terminal ,you can execute **mvn test goal** OR run the Ruunner.java class.

---
## Reports

After execution, the link for the report is shared on execution logs starting with "https://reports.cucumber.io/reports/".


Previous Report @ https://reports.cucumber.io/reports/b6f08964-5a82-4cfe-9b53-fcdb0306e9df


Other ways to manage the drive is to implement Driver manager which automatically updated the driver to the latest one compatible with the browser

---
###For Defect report and testcase please refer to the folder /docs or see below

##Test Case

| TestCase | Steps  | #Expected Result  |
| ------- | --- | --- |
| Validate that 7 is a factorial of 5040 | Navigate to the application url | A text is printed on the screen that shows that “The factorial of 7 is: 5040” |
|  | Enter a valid input 7 in the text field  |  |
|  | Click on calculate | |

---
#Defect Report

###Title:
Text field color is red when user types a correct value after error display.

###Severity:
Low

###Priority:
Low

###Steps to Reproduce:
- Naviagte to the application url http://localhost:6464/
- Click on calculate without entering any value in the text field. 
- The text field should be highlighted in red and is displayed “Please enter an integer”
- Try entering a valid data like 7 in the Text field

####Expected Result:
- Text Field should not the highlighted on red

###Actual Result:
- Text Field was highlighted in red

