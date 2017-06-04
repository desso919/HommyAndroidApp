package hommy.com.hommyapp;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

/**
 * Created by Desislav on 3.6.2017 г..
 */

public class MyJobService  extends JobService {
    private static final String TAG = "MyJobService";

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Log.d(TAG, "Performing long running task in scheduled job");
        // TODO(developer): add long running task here.
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
