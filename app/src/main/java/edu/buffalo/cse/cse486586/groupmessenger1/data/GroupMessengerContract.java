package edu.buffalo.cse.cse486586.groupmessenger1.data;

import android.provider.BaseColumns;

/**
 * Created by priyankanaik on 12/02/2018.
 */

public final class GroupMessengerContract {

    public static final String CONTENT_AUTHORITY = "edu.buffalo.cse.cse486586.groupmessenger1.provider";

    public static final class GroupMessengerEntry implements BaseColumns {

        public final static String TABLE_NAME = "messages";

        public final static String KEY_FIELD = "key";

        public final static String VALUE_FIELD = "value";

    }
}
