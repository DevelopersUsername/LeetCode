SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (SELECT S.sales_id
                       FROM SalesPerson S
                                JOIN Orders O ON S.sales_id = O.sales_id
                                JOIN Company C ON O.com_id = C.com_id
                       WHERE C.name = 'RED')