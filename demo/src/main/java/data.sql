INSERT INTO customers (id, name) VALUES (1, 'Bikash Kumar');
INSERT INTO customers (id, name) VALUES (2, 'Amit Sharma');

-- Transactions for past 3 months (e.g., July, August, September)
INSERT INTO transactions (id, amount, transaction_date, customer_id) VALUES (1, 120.0, '2026-07-15', 1);
INSERT INTO transactions (id, amount, transaction_date, customer_id) VALUES (2, 80.0, '2026-08-20', 1);
INSERT INTO transactions (id, amount, transaction_date, customer_id) VALUES (3, 200.0, '2026-09-10', 1);

INSERT INTO transactions (id, amount, transaction_date, customer_id) VALUES (4, 90.0, '2026-07-12', 2);
INSERT INTO transactions (id, amount, transaction_date, customer_id) VALUES (5, 150.0, '2026-08-18', 2);