$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Google.co.in search functionality",
  "description": "",
  "id": "google.co.in-search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test the google search page",
  "description": "",
  "id": "google.co.in-search-functionality;test-the-google-search-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am at  google page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I fill in selenium automation",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I press return key",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.i_am_at_google_page()"
});
formatter.result({
  "duration": 41053146877,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinition.i_fill_in_selenium_automation()"
});
formatter.result({
  "duration": 16417230462,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinition.i_press_return_key()"
});
formatter.result({
  "duration": 966189382,
  "status": "passed"
});
});