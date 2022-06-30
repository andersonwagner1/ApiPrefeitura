package br.com.prefeitura.diadema.repository.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleBpm extends Oracle {
	public OracleBpm(){
		super("bpms","14prodbpm");
	}
}
