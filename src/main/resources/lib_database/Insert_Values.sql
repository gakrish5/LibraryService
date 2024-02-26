use lms;

-- Insert data into the address table
INSERT INTO address (address_id, line1, line2, city, state, zip)
VALUES
(2000001, '123 Main St', 'Apt 4', 'Cityville', 'CA', '12345'),
(2000002, '456 Oak Ave', NULL, 'Townton', 'NY', '56789'),
(2000003, '789 Pine Rd', 'Suite 12', 'Villageton', 'TX', '98765'),
(2000004, '101 Elm St', NULL, 'Hamletville', 'FL', '54321'),
(2000005, '202 Maple Blvd', 'Unit 8', 'Village Center', 'IL', '67890'),
(2000006, '303 Cedar Lane', NULL, 'Townsville', 'AZ', '13579'),
(2000007, '404 Birch St', NULL, 'Smalltown', 'CO', '24680'),
(2000008, '505 Walnut St', 'Apt 12', 'Laketown', 'MI', '86420'),
(2000009, '606 Magnolia Ave', NULL, 'Hillcrest', 'VA', '97531'),
(2000010, '707 Palm Ct', 'Suite 5', 'Sunnydale', 'NM', '58273'),
(2000011, '808 Cherry Ln', NULL, 'Cityville', 'OR', '46782'), -- Repeat Cityville
(2000012, '909 Willow Way', 'Unit 20', 'Townton', 'WA', '15963'), -- Repeat Townton
(2000013, '1010 Oak Cir', NULL, 'Cedar Park', 'UT', '75318'),
(2000014, '1111 Spruce Blvd', 'Apt 7', 'Pineville', 'MT', '86429'),
(2000015, '1212 Sequoia St', 'Suite 11', 'Mapleton', 'ND', '58274'),
(2000016, '1313 Redwood Dr', 'Apt 3', 'Cityville', 'CA', '98765'), -- Repeat Cityville
(2000017, '1414 Willow Ln', NULL, 'Townton', 'NY', '65432'); -- Repeat Townton

-- Insert data into the book table
INSERT INTO book (book_id, title, author_name, year_published, quantity)
VALUES
(3000001, 'The Catcher in the Rye', 'J.D. Salinger', 1951, 10),
(3000002, 'To Kill a Mockingbird', 'Harper Lee', 1960, 15),
(3000003, 'Harry Potter', 'JK Rowling', 1997, 16),
(3000004, 'The Great Gatsby', 'F. Scott Fitzgerald', 1925, 16),
(3000005, 'Pride and Prejudice', 'Jane Austen', 1813, 12),
(3000006, 'The Hobbit', 'J.R.R. Tolkien', 1937, 16),
(3000007, 'Moby Dick', 'Herman Melville', 1951, 16),
(3000008, 'War and Peace', 'Leo Tolstoy', 1869, 8),
(3000009, 'The Odyssey', 'Homer', 2001, 10),
(3000010, 'Hamlet', 'William Shakespeare', 1900, 0),
(3000011, '1984', 'George Orwell', 1949, 0);


-- Insert data into the book_isbn table with unique ISBNs
INSERT INTO book_isbn (isbn, book_id)
VALUES
(2233445566778, 3000001),
(3344556677889, 3000001),
(4455667788990, 3000001),
(5566778899001, 3000001),
(6677889900112, 3000002),
(7788990011223, 3000002),
(8899001122334, 3000002),
(9000111223445, 3000002),
(1111222334455, 3000003),
(2222333445566, 3000003),
(3333444455666, 3000003),
(4444555566777, 3000003),
(5555666777888, 3000004),
(6666777888999, 3000004),
(7777888999000, 3000004),
(8888999000111, 3000004),
(9999000011222, 3000005),
(1010101010101, 3000005),
(2020202020202, 3000005),
(3030303030303, 3000005),
(4040404040404, 3000006),
(5050505050505, 3000006),
(6060606060606, 3000006),
(7070707070707, 3000006),
(8080808080808, 3000007),
(9090909090909, 3000007),
(1010101010102, 3000007),
(2020202020203, 3000007),
(3030303030304, 3000007),
(4040404040405, 3000008),
(5050505050506, 3000008),
(6060606060607, 3000008),
(7070707070708, 3000008),
(8080808080809, 3000008),
(9090909090910, 3000009),
(1010101010103, 3000009),
(2020202020204, 3000009),
(3030303030305, 3000009),
(4040404040406, 3000009),
(5050505050507, 3000009);

-- Insert data into the library_member table
INSERT INTO library_member (member_id, first_name, last_name, email_address, phone_number, membership_level, address_id)
VALUES
(1000001, 'John', 'Doe', 'john.doe@gmail.com', '1234567890', 'Gold', 2000001),
(1000002, 'Jane', 'Smith', 'jane.smith@outlook.com', '9876543210', 'Silver', 2000002),
(1000003, 'Bob', 'Johnson', 'bob.johnson@gmail.com', '5556667777', 'Bronze', 2000003),
(1000004, 'Alice', 'Williams', 'alice.williams@gmail.com', '1112223333', 'Gold', 2000004),
(1000005, 'Charlie', 'Brown', 'charlie.brown@outlook.com', '4445556666', 'Silver', 2000005),
(1000006, 'Eva', 'Miller', 'eva.miller@email.com', '9990001111', 'Bronze', 2000006),
(1000007, 'David', 'Lee', 'david.lee@outlook.com', '3334445555', 'Gold', 2000007),
(1000008, 'Grace', 'Clark', 'grace.clark@email.com', '6667778888', 'Silver', 2000008),
(1000009, 'Frank', 'White', 'frank.white@gmail.com', '2223334444', 'Bronze', 2000009),
(1000010, 'Helen', 'Martin', 'helen.martin@outlook.com', '7778889999', 'Gold', 2000010),
(1000011, 'Ian', 'Harris', 'ian.harris@outlook.com', '8889990000', 'Silver', 2000011),
(1000012, 'Julia', 'Roberts', 'julia.roberts@gmail.com', '9991112222', 'Bronze', 2000012),
(1000013, 'Kyle', 'Wilson', 'kyle.wilson@outlook.com', '2223333123', 'Gold', 2000013),
(1000014, 'Laura', 'Evans', 'laura.evans@gmail.com', '1113334444', 'Silver', 2000014),
(1000015, 'Mike', 'Thompson', 'mike.thompson@outlook.com', '2224445555', 'Bronze', 2000015);


-- Insert data into the checkout table
INSERT INTO checkout (id, isbn, member_id, checkout_date, due_date, is_returned)
VALUES
(4000001, 2233445566778, 1000001, '2024-01-22 10:00:00', '2024-02-15 10:00:00', false),
(4000002, 3344556677889, 1000002, '2024-01-24 11:30:00', '2024-02-18 11:30:00', false),
(4000003, 4455667788990, 1000003, '2024-01-25 13:45:00', '2024-02-19 13:45:00', false),
(4000004, 8899001122334, 1000001, '2024-01-27 15:20:00', '2024-02-25 15:20:00', false),
(4000005, 6677889900112, 1000005, '2024-01-28 17:10:00', '2024-02-26 17:10:00', false),
(4000006, 7788990011223, 1000001, '2024-01-24 01:00:00', '2024-02-10 01:00:00', true),
(4000007, 8899001122334, 1000007, '2024-02-22 10:45:00', '2024-03-25 10:45:00', false),
(4000008, 9000111223445, 1000008, '2024-02-22 12:30:00', '2024-03-27 12:30:00', false),
(4000009, 1111222334455, 1000009, '2024-02-23 14:15:00', '2024-03-29 14:15:00', false),
(4000010, 2222333445566, 1000010, '2024-02-23 16:00:00', '2024-03-31 16:00:00', false),
(4000011, 3333444455666, 1000011, '2024-02-23 17:45:00', '2024-04-02 17:45:00', false),
(4000012, 4444555566777, 1000012, '2024-02-23 19:30:00', '2024-04-04 19:30:00', false),
(4000013, 5555666777888, 1000013, '2024-02-24 21:15:00', '2024-04-08 21:15:00', false),
(4000014, 6666777888999, 1000014, '2024-01-23 23:00:00', '2024-02-21 23:00:00', true),
(4000015, 7777888999000, 1000015, '2024-02-21 19:00:00', '2024-03-21 19:00:00', false);