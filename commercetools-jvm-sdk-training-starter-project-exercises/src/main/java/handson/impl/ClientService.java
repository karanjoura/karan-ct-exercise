package handson.impl;

import java.io.IOException;
import java.util.Properties;

import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.client.SphereClientConfig;
import io.sphere.sdk.client.SphereClientFactory;

public class ClientService {
	/**
	 * Creates a blocking sphere client
	 * 
	 * @return Sphere client
	 * @throws IOException
	 */
	public static SphereClient createSphereClient() throws IOException {
		final SphereClientConfig clientConfig = loadCTPClientConfig();
		final SphereClientFactory factory = SphereClientFactory.of();
		final SphereClient client = factory.createClient(clientConfig.getProjectKey(),
				clientConfig.getClientId(), 
				clientConfig.getClientSecret()); 

		// TODO 1.3 Create the client
		return client;
	}

	/**
	 * Sets a sphere client configuration
	 * 
	 * @return sphere client configuration
	 * @throws IOException
	 */
	private static SphereClientConfig loadCTPClientConfig() throws IOException {
		final Properties prop = new Properties();
		prop.load(ClientService.class.getResourceAsStream("/dev.properties"));

		SphereClientConfig sphereClientConfig= SphereClientConfig.ofProperties(prop, "ct");
		
		// TODO 1.2 Create the configuration for the sphere client
		return sphereClientConfig;
	}
}