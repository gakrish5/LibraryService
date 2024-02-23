-- create schema lms;

use lms;
-- To drop the tablespaces
drop table checkout;
drop table library_member;
drop table book_isbn;
drop table book;
drop table address;

use lms;
-- To display all the rows of Tables created
select * from checkout;
select * from library_member;
select * from book_isbn;
select * from book;
select * from address;

-- to check the count of books
select book_id, count(book_id) from book_isbn group by book_id;