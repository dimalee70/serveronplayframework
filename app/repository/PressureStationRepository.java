package repository;

import io.ebean.EbeanServer;

import javax.inject.Inject;

public class PressureStationRepository
{
    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public PressureStationRepository(EbeanServer ebeanServer, DatabaseExecutionContext executionContext) {
        this.ebeanServer = ebeanServer;
        this.executionContext = executionContext;
    }


}
