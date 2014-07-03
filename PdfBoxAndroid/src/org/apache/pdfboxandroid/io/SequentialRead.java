package org.apache.pdfboxandroid.io;

import java.io.IOException;

public interface SequentialRead {
	/**
     * Release resources that are being held.
     *
     * @throws IOException If there is an error closing this resource.
     */
    public void close() throws IOException;
    
    /**
     * Read a single byte of data.
     *
     * @return The byte of data that is being read.
     *
     * @throws IOException If there is an error while reading the data.
     */
    public int read() throws IOException;
    
    /**
     * The total number of bytes that are available.
     *
     * @return The number of bytes available.
     *
     * @throws IOException If there is an IO error while determining the
     * length of the data stream.
     */
    public long length() throws IOException;
    
    /**
     * Read a buffer of data.
     *
     * @param b The buffer to write the data to.
     * @param offset Offset into the buffer to start writing.
     * @param length The amount of data to attempt to read.
     * @return The number of bytes that were actually read.
     * @throws IOException If there was an error while reading the data.
     */
    public int read(byte[] b, int offset, int length) throws IOException;
}
