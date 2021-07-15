package com.miftakhudin.library.uuidmd5generator;

/**
 * Factory for creating instances of {@link UUIDMD5Generator}.
 */
public final class UUIDMD5GeneratorFactory {

    private UUIDMD5GeneratorFactory() {
    }

    /**
     * Creates an instance of {@link UUIDMD5Generator}.
     *
     * @return the new instance
     */
    public static UUIDMD5Generator createUUIDMD5Generator() {
        return new UUIDMD5GeneratorImpl();
    }

}
