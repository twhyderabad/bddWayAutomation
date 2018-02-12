Create a user and login Specification
=====================
Created by apreeti on 1/16/18

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

These are the context steps
table:/Users/apreeti/IdeaProjects/GaugeWithMaven/src/test/data/data.csv

Create new users
------------------
* Click on Login
* Click on Create New User link
* Enter user details <username> and <password>
* User should be logged in with "MY ACCOUNT"

------------------------------
These are the tear down steps
* Log out of the app
* Close the browser
* Quit the browser