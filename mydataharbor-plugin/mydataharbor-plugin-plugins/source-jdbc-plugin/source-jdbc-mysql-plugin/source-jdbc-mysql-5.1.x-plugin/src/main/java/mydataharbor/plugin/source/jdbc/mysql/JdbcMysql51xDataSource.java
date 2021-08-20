package mydataharbor.plugin.source.jdbc.mysql;

import mydataharbor.source.jdbc.JdbcDataSource;
import mydataharbor.source.jdbc.config.JdbcDataSourceConfig;

/**
 * Created by xulang on 2021/8/19.
 */
public class JdbcMysql51xDataSource extends JdbcDataSource {

  public JdbcMysql51xDataSource(JdbcDataSourceConfig jdbcDataSourceConfig) {
    super(jdbcDataSourceConfig);
  }

  @Override
  public String driverClassName() {
    return "com.mysql.jdbc.Driver";
  }

  @Override
  public String dataSourceType() {
    return super.dataSourceType() + "mysql-5.1.x";
  }
}
