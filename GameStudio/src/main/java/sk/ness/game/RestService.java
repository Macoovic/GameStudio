package sk.ness.game;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class RestService extends ResourceConfig{
	
	public RestService() {
		packages("sk.ness.game");

		//register(JacksonFeature.class); // adds JSON support (using Jackson)
	}
}
