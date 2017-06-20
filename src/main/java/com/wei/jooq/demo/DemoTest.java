package com.wei.jooq.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.wei.jooq.generated.tables.Author;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName = "root";
        String password = "123";
        String url = "jdbc:mysql://localhost:3306/library";
        Connection conn = null;
        try {
			conn = DriverManager.getConnection(url, userName, password);
        	DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
        	Result<Record> result = create.select().from(Author.AUTHOR).fetch();
        	if(null != result){
        		for(Record r : result){
        			Integer id = r.getValue(Author.AUTHOR.ID);
        			String firstName = r.getValue(Author.AUTHOR.FIRST_NAME);
        			String lastName = r.getValue(Author.AUTHOR.LAST_NAME);
        			System.out.println("ID: " + id + " first name: " + firstName + " last name: " + lastName);
        		}
        	}
        	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
