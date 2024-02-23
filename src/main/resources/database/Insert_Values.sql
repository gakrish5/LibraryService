use lms;

-- Insert data into the address table
INSERT INTO address (address_id, line1, line2, city, state, zip)
VALUES
(1, '123 Main St', 'Apt 4', 'Cityville', 'CA', 12345),
(2, '456 Oak Ave', NULL, 'Townton', 'NY', 56789),
(3, '789 Pine Rd', 'Suite 12', 'Villageton', 'TX', 98765),
(4, '101 Elm St', NULL, 'Hamletville', 'FL', 54321),
(5, '202 Maple Blvd', 'Unit 8', 'Village Center', 'IL', 67890),
(6, '303 Cedar Lane', NULL, 'Townsville', 'AZ', 13579);

-- Insert data into the book table
INSERT INTO book (book_id, title, author_name, year_published, quantity)
VALUES
(1, 'The Catcher in the Rye', 'J.D. Salinger', 1951, 3),
(2, 'To Kill a Mockingbird', 'Harper Lee', 1960, 2),
(3, '1984', 'George Orwell', 1949, 6),
(4, 'The Great Gatsby', 'F. Scott Fitzgerald', 1925, 4),
(5, 'Pride and Prejudice', 'Jane Austen', 1813, 3),
(6, 'The Hobbit', 'J.R.R. Tolkien', 1937, 2);

-- Insert data into the book_isbn table with unique ISBNs
INSERT INTO book_isbn (isbn, book_id)
VALUES
(1234567890123, 1),
(2345678901234, 2),
(3456789012345, 3),
(4567890123456, 5),
(5678901234567, 2),
(6789012345678, 6),
(7890123456789, 1),
(8901234567890, 6),
(9012345678901, 3),
(1098765432109, 5),
(2109876543210, 3),
(3210987654321, 4),
(4321098765432, 1),
(5432109876543, 3),
(6543210987654, 4),
(7654321098765, 4),
(8765432109876, 3),
(9876543210987, 4),
(1987654321098, 5),
(2998765432109, 3);


-- Insert data into the library_member table
INSERT INTO library_member (member_id, first_name, last_name, email_address, phone_number, membership_level, address_id)
VALUES
(1, 'John', 'Doe', 'john.doe@email.com', 1234567890, 'Gold', 1),
(2, 'Jane', 'Smith', 'jane.smith@email.com', 9876543210, 'Silver', 2),
(3, 'Bob', 'Johnson', 'bob.johnson@email.com', 5556667777, 'Bronze', 3),
(4, 'Alice', 'Williams', 'alice.williams@email.com', 1112223333, 'Gold', 4),
(5, 'Charlie', 'Brown', 'charlie.brown@email.com', 4445556666, 'Silver', 5),
(6, 'Eva', 'Miller', 'eva.miller@email.com', 9990001111, 'Bronze', 6),
(7, 'David', 'Lee', 'david.lee@email.com', 3334445555, 'Gold', 1),
(8, 'Grace', 'Clark', 'grace.clark@email.com', 6667778888, 'Silver', 2),
(9, 'Frank', 'White', 'frank.white@email.com', 2223334444, 'Bronze', 3),
(10, 'Helen', 'Martin', 'helen.martin@email.com', 7778889999, 'Gold', 4);

-- Insert data into the checkout table
INSERT INTO checkout (id, isbn, member_id, checkout_date, due_date, is_returned)
VALUES
(1, 1234567890123, 1, '2024-02-22 10:00:00', '2024-03-15 10:00:00', false),
(2, 2345678901234, 2, '2024-02-22 11:30:00', '2024-03-16 11:30:00', false),
(3, 3456789012345, 3, '2024-02-22 13:45:00', '2024-03-18 13:45:00', false),
(4, 4567890123456, 4, '2024-02-22 15:20:00', '2024-03-20 15:20:00', false),
(5, 5678901234567, 5, '2024-02-22 17:10:00', '2024-03-22 17:10:00', false),
(6, 6789012345678, 6, '2024-02-22 19:00:00', '2024-03-24 19:00:00', false);