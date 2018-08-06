package org.zer0.pocs.cassandrademo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;

@Configuration
@EnableReactiveCassandraRepositories(basePackages = "org.zer0.pocs.cassandrademo.repositorios")
public class CassandraConfiguracion extends AbstractReactiveCassandraConfiguration {

	@Override
	protected String getKeyspaceName() {
		return "personas";
	}

	@Bean
	public CassandraClusterFactoryBean cluster() {
		CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
		cluster.setContactPoints("127.0.0.1");
		cluster.setPort(9042);
		return cluster;
	}

	public String[] getEntityBasePackages() {
		return new String[] { "com.oreilly.springdata.cassandra" };
	}

}
