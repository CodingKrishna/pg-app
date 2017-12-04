CREATE TABLE `PgAppDB`.user
(
    `userID`       int(45) NOT NULL AUTO_INCREMENT,
    `firstName`    varchar(45),
    age            int(70),
    `genderID`     int(45),
    `emailID`      varchar(70) NOT NULL,
    password       varchar(45) NOT NULL,
    dob            date,
    `createdDate`  date,
    `updatedDate`  date,
    `middleName`   varchar(45),
    `lastName`     varchar(45),
    `userType`     int(50),
    `loginType`    int(50),
    `phoneNumber`  varchar(45),
    PRIMARY KEY (`userid`)
)

ENGINE = InnoDB
COLLATE = 'utf8_general_ci';

ALTER TABLE `pgappdb`.user
   ADD UNIQUE KEY`emailid_unique`(`emailid`);