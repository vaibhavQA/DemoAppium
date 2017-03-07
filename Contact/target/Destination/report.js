$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/com/test/Test.feature");
formatter.feature({
  "line": 2,
  "name": "contact",
  "description": "",
  "id": "contact",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Verify user is able to Add contact",
  "description": "",
  "id": "contact;verify-user-is-able-to-add-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is landed on App Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.landingPage()"
});
formatter.result({
  "duration": 43107716206,
  "status": "passed"
});
});