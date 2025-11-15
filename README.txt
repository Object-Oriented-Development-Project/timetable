//GROUP #1 TIMETABLING APPLICATILON

The basic framework of the programme is now in place. The programme will work off of one csv file with all timetabling information, this file is read by the csv-reader class.
All classes which can own a timetable filter the same file using the entries (DAY, ROOM, TIME START, TIME END, MODULE, GROUP, TYPE, LECTURER, GROUP, COURSE, ID ETC.)
A timetable is made of days which are made of events, years are made of terms and terms are made of a set of days for an entity.
