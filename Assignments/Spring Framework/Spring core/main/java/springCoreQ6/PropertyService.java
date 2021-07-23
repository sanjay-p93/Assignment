package springCoreQ6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyService {
	@Value("${external.service.uri}")
	private String uri;
	@Value("${external.service.database}")
	private String database;

	public DatabaseConfig returnSerivce() {
		return new DatabaseConfig(uri, database);
	}

}
