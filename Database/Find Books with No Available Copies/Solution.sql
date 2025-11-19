SELECT
    br.book_id,
    title,
    author,
    genre,
    publication_year,
    total_copies AS current_borrowers
FROM
    library_books
        INNER JOIN (
        SELECT
            book_id,
            count(1) AS total
        FROM
            borrowing_records
        WHERE
            return_date ISNULL
        GROUP BY
            book_id
    ) br ON library_books.book_id = br.book_id
        AND br.total = library_books.total_copies
ORDER BY
    total_copies DESC,
    title