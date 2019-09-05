package org.mfh144.dtog.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource("classpath:application.yaml")
public class DtogConfig {

	private Application application;

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DtogConfig [application=");
		builder.append(application);
		builder.append("]");
		return builder.toString();
	}

}
