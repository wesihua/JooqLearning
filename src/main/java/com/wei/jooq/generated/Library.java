/*
 * This file is generated by jOOQ.
*/
package com.wei.jooq.generated;


import com.wei.jooq.generated.tables.Author;
import com.wei.jooq.generated.tables.Book;
import com.wei.jooq.generated.tables.Language;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Library extends SchemaImpl {

    private static final long serialVersionUID = 602769706;

    /**
     * The reference instance of <code>library</code>
     */
    public static final Library LIBRARY = new Library();

    /**
     * The table <code>library.author</code>.
     */
    public final Author AUTHOR = com.wei.jooq.generated.tables.Author.AUTHOR;

    /**
     * The table <code>library.book</code>.
     */
    public final Book BOOK = com.wei.jooq.generated.tables.Book.BOOK;

    /**
     * The table <code>library.language</code>.
     */
    public final Language LANGUAGE = com.wei.jooq.generated.tables.Language.LANGUAGE;

    /**
     * No further instances allowed
     */
    private Library() {
        super("library", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Author.AUTHOR,
            Book.BOOK,
            Language.LANGUAGE);
    }
}
