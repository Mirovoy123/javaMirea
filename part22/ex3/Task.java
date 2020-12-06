package part22.ex3;

import java.time.Duration;
import java.util.Date;

public class Task {

    private String worker;
    private Date completionDate;
    private Date startDate;

    public Task(String worker, Date completionDate) {
        this.worker = worker;
        this.completionDate = completionDate;
        this.startDate = new Date();
    }

    public String getWorker() {
        return worker;
    }

    public Duration durationTillDeadline() {
        return Duration.between(startDate.toInstant(), completionDate.toInstant());
    }

}
