Detailed Explanation by xen0byt3

1. DateTimeFormatter
	Used to format date and time output.

	Example:
	2026-03-05 16:45:10

	instead of
	2026-03-05T16:45:10.345

2. File Writing
	FileWriter writer = new FileWriter("activity_log.txt", true);

	Creates a log file

	true means append new logs instead of overwriting

3. Exception Handling
	try { } catch (IOException e)

	Used to handle file errors safely.

3. Activity Logging
	Logs:
	Username
	Login time
	Activity performed
	Logout time
	This is the foundation of cybersecurity monitoring systems.




Sample Console Output
	Enter username: adonis

	Login successful!
	Login time: 2026-03-05 16:50:10

	Enter your activity: Access server configuration

	Press ENTER to logout...

	Activity successfully saved to log file.


Example Content of activity_log.txt
	----- USER ACTIVITY LOG -----
	
	User: adonis
	Login Time: 2026-03-05 16:50:10
	Activity: Access server configuration
	Activity Time: 2026-03-05 16:50:25
	Logout Time: 2026-03-05 16:51:02
	
	------------------------------
