environments {

dev {
		server {
			localHomeDir = '/usr/local/apache-tomcat-8.0.36-dev'
			containerId = 'tomcat8x'
			hostname = 'localhost'
			port = 8091
			context = appName
			username = 'tomcat'
			password = 's3cret'
		}
}
qa {
		server {
			localHomeDir = '/usr/local/apache-tomcat-8.0.36-qa'
			containerId = 'tomcat8x'
			hostname = 'localhost'
			port = 8092
			context = appName
			username = 'tomcat'
			password = 's3cret'
		}
	}
perf {
		server {
			localHomeDir = '/usr/local/apache-tomcat-8.0.36-perf'
			containerId = 'tomcat8x'
			hostname = 'localhost'
			port = 8093
			context = appName
			username = 'tomcat'
			password = 's3cret'
		}
	}
stage {
		server {
			localHomeDir = '/usr/local/apache-tomcat-8.0.36-stage'
			containerId = 'tomcat8x'
			hostname = 'localhost'
			port = 8094
			context = appName
			username = 'tomcat'
			password = 's3cret'
		}
	}
prod {
		server {
			localHomeDir = '/usr/local/apache-tomcat-8.0.36-prod'
			containerId = 'tomcat8x'
			hostname = 'localhost'
			port = 8095
			context = appName
			username = 'tomcat'
			password = 's3cret'
		}
		cf {
			target = 'https://api.run.pivotal.io'
      			space = 'development'
      			baseUri='cfapps.io'
      			instanceMemory='512'
      			instances='1'
		}
		
	}
}
