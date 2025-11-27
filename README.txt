//TIMETABLE APPLICATILON
The timetable system is in its final stage of development now. The abillity to view timetables is fully implemented for all relevant entities. 
The ability to add to a table, and then write this new table to the relevant csv file has been implemented for all tables. 
The option to add to an event to the master timetable ('Terms') lists the available start times for the room on the selected day, it does not currently account for the alloted hours of the event running through one scheduled after the start time. There was no more time to implement this properly.
A user can log in to the system with their ID, either student or lecturer. The admin login process requires the correct password to be entered, passwords are case sensitive.
Timetables can be viewed for the following: The current user, a room specified by its number, a module specified with its code, a course specified with its code. There is no admin table.
The program adopts the 'model controller viewer' model and adheres to it strictly.
Invalid inputs in the menu are largely handled by a simple looping back to the last part of the menu the user reached, in some cases there is error messages (i.e for admin passwords).
The admin user is the only user with access to the ability to add to tables or to set the current term for the system.
This application is entirely based in the terminal and does not implement a GUI.
The program allows a user to log out, and the ability to quit and terminate the app is available in the main menu and the post- user login menu.
