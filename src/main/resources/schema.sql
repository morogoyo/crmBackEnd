CREATE TABLE customers(
  id integer NOT NULL AUTO_INCREMENT ,
  f_name varchar(255),
  l_name varchar(255),
  gender varchar(255),
  address varchar(255),
  email varchar(255),
  profession varchar(255),
  mobile_number integer(8),
  birthday date,
  date_added date,
  date_updated date,
  PRIMARY KEY(id)
);

CREATE TABLE company(
  id integer NOT NULL AUTO_INCREMENT ,
  company_name varchar(255),
  company_address varchar(255),
  company_email varchar(255),
  company_description varchar(255),
  company_phone_number integer(8),
  date_added date,
  date_updated date,  
  PRIMARY KEY(id)
);



INSERT INTO customers(ID,F_NAME,L_NAME,GENDER,ADDRESS,EMAIL,PROFESSION,MOBILE_NUMBER,BIRTHDAY,DATE_ADDED ,DATE_UPDATED)VALUES(1,'Rene','Torres','Male','Sterling Spring Rd. Orlando Fl','torres.rene@outlook.com','Dev',1234567,now(),now(),now());					
INSERT INTO customers(ID,F_NAME,L_NAME,GENDER,ADDRESS,EMAIL,PROFESSION,MOBILE_NUMBER,BIRTHDAY,DATE_ADDED ,DATE_UPDATED)VALUES(2,'user1','user1LastName','Male','Sterling Spring Rd. Orlando Fl','user1@outlook.com','Dev',1234567,now(),now(),now());
INSERT INTO customers(ID,F_NAME,L_NAME,GENDER,ADDRESS,EMAIL,PROFESSION,MOBILE_NUMBER,BIRTHDAY,DATE_ADDED ,DATE_UPDATED)VALUES(3,'user2','user2LastName','Male','Sterling Spring Rd. Orlando Fl','torres.rene@outlook.com','Dev',1234567,now(),now(),now());					
INSERT INTO customers(ID,F_NAME,L_NAME,GENDER,ADDRESS,EMAIL,PROFESSION,MOBILE_NUMBER,BIRTHDAY,DATE_ADDED ,DATE_UPDATED)VALUES(4,'user3','user3LastName','Male','Sterling Spring Rd. Orlando Fl','user3@outlook.com','Dev',1234567,now(),now(),now());

INSERT INTO company(ID,COMPANY_NAME,COMPANY_ADDRESS,COMPANY_EMAIL,COMPANY_DESCRIPTION,COMPANY_PHONE_NUMBER,DATE_ADDED,DATE_UPDATED)VALUES(1,'Company1','123 main st. Orlando Fl','company1@outlook.com','Development company',1234567,now(),now());
INSERT INTO company(ID,COMPANY_NAME,COMPANY_ADDRESS,COMPANY_EMAIL,COMPANY_DESCRIPTION,COMPANY_PHONE_NUMBER,DATE_ADDED,DATE_UPDATED)VALUES(2,'Company2','456 main st. Orlando Fl','company2@outlook.com','web Development company',1234567,now(),now());
INSERT INTO company(ID,COMPANY_NAME,COMPANY_ADDRESS,COMPANY_EMAIL,COMPANY_DESCRIPTION,COMPANY_PHONE_NUMBER,DATE_ADDED,DATE_UPDATED)VALUES(3,'Company3','789 main st. Orlando Fl','company3@outlook.com','Development company',1234567,now(),now());

					