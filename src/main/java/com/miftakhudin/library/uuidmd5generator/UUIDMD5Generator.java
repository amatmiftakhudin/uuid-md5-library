package com.miftakhudin.library.uuidmd5generator;

/**
 * Pads a {@link String}.
 * <p>
 * The instances of classes that implement this interface are thread-safe and immutable.
 */
public interface UUIDMD5Generator {

    /**
     * Returns a new {@link String} that generate by UUID and then hash using md5
     *
     * @return the generated {@link String}
     */
    String generate();

    

}
