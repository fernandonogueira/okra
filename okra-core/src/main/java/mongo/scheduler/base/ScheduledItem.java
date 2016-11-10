package mongo.scheduler.base;

import java.time.LocalDateTime;

public interface ScheduledItem {

    String getId();

    /**
     * Latest date this entry received a heartBeat
     *
     * @return The date of the latest heartbeat
     */
    LocalDateTime getHeartbeat();

    /**
     * The date this entry should run
     *
     * @return The date this entry should run
     */
    LocalDateTime getRunDate();

    /**
     * @return The current status of this scheduled item
     */
    ScheduledStatus getStatus();

    void setStatus(ScheduledStatus status);

}