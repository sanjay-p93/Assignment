package springCoreQ6;

public class DatabaseConfig {
	private String dburi;
	private String databaseName;

	public DatabaseConfig(String dburl, String databaseName) {
		super();
		this.dburi = dburl;
		this.databaseName = databaseName;
	}

	@Override
	public String toString() {
		return "URI = " + dburi + "\nDatabase= " + databaseName;
	}

}
