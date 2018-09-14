USE cats;

CREATE TABLE IF NOT EXISTS catlist(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(20) NOT NULL,
color VARCHAR(20) NOT NULL,
sex ENUM('M', 'F') NOT NULL,
birth_date DATE,
dead ENUM('yes', 'no') NOT NULL,
age INT NOT NULL,
city VARCHAR(40) NOT NULL
);

INSERT INTO catlist VALUES
(NULL, 'Troycica', 'orange', 'M', "2014-09-05", 'no', 4, 'Budapest'),
(NULL, 'Edocica', 'brown', 'F', "1997-11-02", 'no', 20, 'Budapest'),
(NULL, 'Steven', 'silver', 'M', "2011-02-02", 'yes', 3, 'Becsehely'),
(NULL, 'Roxycica', 'brown', 'F', "2016-06-05", 'no', 4, 'Budapest');


CREATE TABLE IF NOT EXISTS catdiary(
id INT NOT NULL,
cativity VARCHAR(200) NOT NULL,
fromtime DATETIME NOT NULL,
totime DATETIME NOT NULL
);


INSERT INTO catdiary VALUES
(1, 'sleeping', "2018-09-13 10:43:23", "2018-09-13 19:00:22"),
(1, 'sitting beautifully', "2018-09-13 19:01:34", "2018-09-13 20:30:12"),
(1, 'eating', "2018-09-13 21:01:54", "2018-09-13 21:05:08"),
(1, 'sleeping', "2018-09-13 22:00:23", "2018-09-14 04:32:56"),
(2, 'took as bath', "2018-09-13 10:30:03", "2018-09-13 11:12:22"),
(2, 'shopping', "2018-09-13 12:15:23", "2018-09-13 14:40:43"),
(2, 'went to school', "2018-09-13 15:30:00", "2018-09-13 16:45:10"),
(3, 'being dead', "2014-09-05 04:12:34", NOW()),
(4, 'sunbathing', "2018-09-13 19:01:34", "2018-09-13 20:30:12"),
(4, 'sleeping', "2018-09-13 10:43:23", "2018-09-13 21:01:45"),
(4, 'eating', "2018-09-13 21:01:54", "2018-09-13 21:05:08"),
(4, 'sleeping', "2018-09-13 22:00:23", "2018-09-14 09:45:12");