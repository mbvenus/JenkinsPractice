Feature:Amazon drop down search

  #//    •Use Different Test Method for each Test Case
  #//    •Go to https://www.amazon.com/
 # // •Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
  #// •Print the first selected option and assert if it equals “All Departments”
  #// •Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”
  #// .(after you select you need to use get first selected option method)
 # // •Print all of the dropdown options
 # // •Print the the total number of options in the dropdown
 # // •Check if Appliances is a drop down option. Print true if “Appliances” is an option. Print false otherwise.
  #// •BONUS: Check if the dropdown is in Alphabetical Order
  @firstTest
  Scenario: about drop down everything and validation
    Given user navigate to amazon page
    When Find the element of the dropdown element
    Then print the first selected option and assert if it equals "All Departments"
    And select the 4th option by index and assert if the name is "Amazon Devices"
    And after you select you need to use get first selected option method
    Then print all of the dropdown options
    And Print the total number of options in the dropdown
    And Check if appliances is drop down option .print true if "Appliances" is an option.print false otherwise
    And Check if dropdown is in Alphabetical order
