package org.apache.usergrid.persistence.graph.serialization;


import com.netflix.astyanax.model.ConsistencyLevel;


/**
 *
 * Wraps our fig configuration since it doesn't support enums yet.  Once enums are supported, remove this wrapper and
 * replace with the fig configuration itself
 *
 */
public interface CassandraConfig {

    /**
     * Get the currently configured ReadCL
     * @return
     */
    public ConsistencyLevel getReadCL();

    /**
     * Get the currently configured write CL
     * @return
     */
    public ConsistencyLevel getWriteCL();

    /**
     * Get the currently configured page size
     * @return
     */
    public int getScanPageSize();
}
