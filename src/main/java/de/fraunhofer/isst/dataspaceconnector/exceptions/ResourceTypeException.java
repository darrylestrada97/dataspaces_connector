package de.fraunhofer.isst.dataspaceconnector.exceptions;

public class ResourceTypeException extends IllegalArgumentException {
    /**
     * Construct an ResourceNotFoundException with the specified detail message and cause.
     *
     * @param msg   The detail message.
     */
    public ResourceTypeException(String msg) {
        super(msg);
    }

    /**
     * Construct an ResourceTypeException with the specified detail message and cause.
     *
     * @param msg   The detail message.
     * @param cause The cause.
     */
    public ResourceTypeException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
