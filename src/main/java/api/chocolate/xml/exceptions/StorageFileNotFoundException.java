package api.chocolate.xml.exceptions;

@SuppressWarnings("serial")
public class StorageFileNotFoundException extends StorageException {
	
	public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
