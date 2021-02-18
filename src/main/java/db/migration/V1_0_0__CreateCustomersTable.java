package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.flywaydb.core.internal.jdbc.JdbcTemplate;

public class V1_0_0__CreateCustomersTable extends BaseJavaMigration {

    @Override
    public void migrate(Context context) throws Exception {
        JdbcTemplate template = new JdbcTemplate(context.getConnection());
        template.execute("CREATE TABLE users (\n"
                + "idx BIGINT primary key,\n"
                + "username VARCHAR(50) unique,\n"
                + "display_name VARCHAR(50) unique,\n"
                + "password VARCHAR(255),\n"
                + "avatar VARCHAR(255)\n"
                + ");"
        );
    }
}
