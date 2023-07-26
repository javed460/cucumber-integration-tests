# cucumber-integration-tests
Showcase how cucumber framework can be used to write integration tests

# Prerequisites
1) Install Intellij Gherkin plugin - for feature files

2) Install Intellij Cucumber for Java plugin - To generate stepdefs from feature files

# Q & A's
**Q) How do I run the Integration Test?**

A) To run the tests Open CucumberIntegrationTestsRunner and run it, make sure local server is up and running,
as Integration tests are triggered against local server, also make sure server port number is correctly
mentioned in CucumberRestApiCalls

**Q) How do I generate the stepdefs / step definitions?**

A) Open the feature file and put the cursor on Scenario statements, idea will show
the suggestion "Create step definitions" OR Press alt + enter to generate stepdefs

**Q) Can I run only 1 particular Scenario?**

A) Yes, use @tags annotation in CucumberIntegrationTestsRunner. Add an annotation in this runner and use
the same annotation on top of Scenario that you want to run.

**Q) Do we get any report after tests are executed?**

A) Yes, a html report gets generated inside target folder with name  "cucumber-html-report.html"


# Troubleshooting / Pitfalls

1) Though Intellij shows play / run icon on feature file, do not run features,
   you will get stepdef missing exceptions, ideal way to run it is using CucumberIntegrationTestsRunner.


2) Do not move files to different package from what's initially setup, as package structures are
   already defined in cucumbercontext, moving files would break the setup and tests.
