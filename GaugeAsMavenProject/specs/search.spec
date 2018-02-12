Search Specification
=====================
The user should be able to search for a product in the application
Created by apreeti on 1/15/18

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

Successful search
----------------------
* Search for product "Mug"
* Search results should have the products with the text "Mug" in their names

Unsuccessful search
----------------------
* Search for product "Unknown"
* 'No products found' message should be displayed
* Close the browser
* Quit the browser