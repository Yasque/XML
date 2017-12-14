package mx.dul.chocolates.rest;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

	/**
	 * Folder location for storing files
	 */
	// TODO nextv crear metodo que cree la carpeta si no existe de los archivos que se van a subir
	private String location = "./src/main/resources/public/uploaded-files";
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
