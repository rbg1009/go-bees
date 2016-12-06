package com.davidmiguel.gobees.data.model;

import java.util.Date;
import java.util.List;

/**
 * Model class for a recording. A recording contains all the records from one day.
 * A recording is not stored in the db, just the records.
 */
public class Recording {

    /**
     * Data of the recording.
     */
    private Date date;

    /**
     * List of all records of that date.
     */
    private List<Record> records;

    /**
     * List of meteorological records.
     */
    private List<MeteoDetail> meteo;

    public Recording(Date date, List<Record> records, List<MeteoDetail> meteo) {
        this.date = date;
        this.records = records;
        this.meteo = meteo;
    }

    public Date getDate() {
        return date;
    }

    public List<Record> getRecords() {
        return records;
    }

    public List<MeteoDetail> getMeteo() {
        return meteo;
    }
}
