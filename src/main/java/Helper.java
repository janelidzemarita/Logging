public class Helper {
    /*
property.path = ${sys:catalina.base}/logs
property.pattern = %d{yyyy-MM-dd HH:mm:ss.SSS} %level %t %c %X{uniqID} methodName=%X{methodName}%msg %n


//#Appender for OSM
appender.osmws.type = RollingFile
appender.osmws.name = osmAppender
appender.osmws.fileName= ${path}/osm.log
appender.osmws.filePattern=${path}/osm.log.%d{yyyy-MM-dd}
appender.osmws.layout.type= PatternLayout
appender.osmws.layout.pattern= ${pattern}
appender.osmws.policies.type = Policies
appender.osmws.policies.time.type = TimeBasedTriggeringPolicy
appender.osmws.filter.threshold.type = ThresholdFilter
appender.osmws.filter.threshold.level = debug

#Appender for OSMTrap
appender.osmwsTrap.type = RollingFile
appender.osmwsTrap.name = osmTrapAppender
appender.osmwsTrap.fileName= ${path}/osm_alert.log
appender.osmwsTrap.filePattern=${path}/osm_alert.log.%d{yyyy-MM-dd}
appender.osmwsTrap.layout.type= PatternLayout
appender.osmwsTrap.layout.pattern= ${pattern}
appender.osmwsTrap.policies.type = Policies
appender.osmwsTrap.policies.time.type = TimeBasedTriggeringPolicy
appender.osmwsTrap.filter.threshold.type = ThresholdFilter
appender.osmwsTrap.filter.threshold.level = error


#Appender for OSMJOB
appender.osmjob.type = RollingFile
appender.osmjob.name = osmJobAppender
appender.osmjob.fileName= ${path}/osm_jobs.log
appender.osmjob.filePattern=${path}/osm_jobs.log.%d{yyyy-MM-dd}
appender.osmjob.layout.type= PatternLayout
appender.osmjob.layout.pattern= ${pattern}
appender.osmjob.policies.type = Policies
appender.osmjob.policies.time.type = TimeBasedTriggeringPolicy

#Appender for HSM
appender.HSM.type = RollingFile
appender.HSM.name = HsmAppender
appender.HSM.fileName= ${path}/ufc-hsm-utils.log
appender.HSM.filePattern=${path}/ufc-hsm-utils.log.%d{yyyy-MM-dd}
appender.HSM.layout.type= PatternLayout
appender.HSM.layout.pattern= ${pattern}
appender.HSM.policies.type = Policies
appender.HSM.policies.time.type = TimeBasedTriggeringPolicy
appender.HSM.filter.threshold.type = ThresholdFilter
appender.HSM.filter.threshold.level = debug


############-------LOGGERS-------############
#Logger for OSM
logger.osmws.name = ge.ufc.osm
logger.osmws.level = debug
logger.osmws.additivity = false
logger.osmws.appenderRef.osmws.ref = osmAppender
logger.osmws.appenderRef.osmwsTrap.ref = osmTrapAppender

#Logger for HSM
logger.HSM.name = ge.ufc.utils.hsm
logger.HSM.level = debug
logger.HSM.additivity = false
logger.HSM.appenderRef.HSM.ref = HsmAppender

#Logger for osmJob
logger.osmjob.name = ge.ufc.osm.job
logger.osmjob.level = debug
logger.osmjob.additivity = false
logger.osmjob.appenderRef.osmjob.ref = osmJobAppender
logger.osmjob.appenderRef.osmwsTrap.ref = osmTrapAppender

--------------------------------------------------------------------------------------------------------------------

property.path = ${sys:catalina.base}/logs
property.pattern = %d{yyyy-MM-dd HH:mm:ss.SSS} %level %t %c %X{uniqID} methodName=%X{methodName}%msg %n

#Appender for UFC-CS
appender.ufccs.type = RollingFile
appender.ufccs.name = csAppender
appender.ufccs.fileName= ${path}/ufc_cs.log
appender.ufccs.filePattern=${path}/ufc_cs.log.%d{yyyy-MM-dd}
appender.ufccs.layout.type= PatternLayout
appender.ufccs.layout.pattern= ${pattern}
appender.ufccs.policies.type = Policies
appender.ufccs.policies.time.type = TimeBasedTriggeringPolicy
appender.ufccs.filter.threshold.type = ThresholdFilter
appender.ufccs.filter.threshold.level = trace

#Appender for UFC-CS Trap
appender.ufccsTrap.type = RollingFile
appender.ufccsTrap.name = csTrapAppender
appender.ufccsTrap.fileName= ${path}/ufc_cs_alert.log
appender.ufccsTrap.filePattern=${path}/ufc_cs_alert.log.%d{yyyy-MM-dd}
appender.ufccsTrap.layout.type= PatternLayout
appender.ufccsTrap.layout.pattern= ${pattern}
appender.ufccsTrap.policies.type = Policies
appender.ufccsTrap.policies.time.type = TimeBasedTriggeringPolicy
appender.ufccsTrap.filter.threshold.type = ThresholdFilter
appender.ufccsTrap.filter.threshold.level = error

############-------LOGGERS-------############
#Logger for UFC-CS
logger.ufccs.name = ge.ufc.cs
logger.ufccs.level = trace
logger.ufccs.additivity = false
logger.ufccs.appenderRef.ufccs.ref = csAppender
logger.ufccs.appenderRef.ufccsTrap.ref = csTrapAppender



--------------------------------------------------------------------------------------------------------------------

property.path = ${sys:jboss.server.log.dir}
property.pattern = %d{yyyy-MM-dd HH:mm:ss.SSS} %level %t %c %X{uniqID} methodName=%X{methodName}%msg %n


#Appender for ufcws
appender.ufcws.type = RollingFile
appender.ufcws.name = ufcws2Appender
appender.ufcws.fileName= ${path}/ufcws.log
appender.ufcws.filePattern=${path}/ufcws.log.%d{yyyy-MM-dd}
appender.ufcws.layout.type= PatternLayout
appender.ufcws.layout.pattern= ${pattern}
appender.ufcws.policies.type = Policies
appender.ufcws.policies.time.type = TimeBasedTriggeringPolicy
appender.ufcws.filter.threshold.type = ThresholdFilter
appender.ufcws.filter.threshold.level = debug

#Appender for ufcwsAlert
appender.ufcwsAlert.type = RollingFile
appender.ufcwsAlert.name = ufcws2AlertAppender
appender.ufcwsAlert.fileName= ${path}/ufcws_alert.log
appender.ufcwsAlert.filePattern=${path}/ufcws_alert.log.%d{yyyy-MM-dd}
appender.ufcwsAlert.layout.type= PatternLayout
appender.ufcwsAlert.layout.pattern= ${pattern}
appender.ufcwsAlert.policies.type = Policies
appender.ufcwsAlert.policies.time.type = TimeBasedTriggeringPolicy
appender.ufcwsAlert.filter.threshold.type = ThresholdFilter
appender.ufcwsAlert.filter.threshold.level = error


############-------LOGGERS-------############
#Logger for UFCWS2
logger.ufcws.name = ge.ufc.ws
logger.ufcws.level = debug
logger.ufcws.additivity = false
logger.ufcws.appenderRef.ufcws.ref = ufcws2Appender
logger.ufcws.appenderRef.ufcwsAlert.ref = ufcws2AlertAppender

--------------------------------------------------------------------------------------------------------------------

property.path = ${sys:catalina.base}/logs
property.pattern = %d{yyyy-MM-dd HH:mm:ss.SSS} %p %t %c %m%n

############-------APPENDERS-------############

#Appender for ns Jobs
appender.ns.type = RollingFile
appender.ns.name = nsAppender
appender.ns.fileName= ${path}/ns.log
appender.ns.filePattern=${path}/ns.log.%d{yyyy-MM-dd}
appender.ns.layout.type= PatternLayout
appender.ns.layout.pattern= ${pattern}
appender.ns.policies.type = Policies
appender.ns.policies.time.type = TimeBasedTriggeringPolicy
appender.ns.filter.threshold.type = ThresholdFilter
appender.ns.filter.threshold.level = trace


############-------LOGGERS-------############
#Logger for nss
logger.ns.name = ge.ufc.ns
logger.ns.level = trace
logger.ns.additivity = false
logger.ns.appenderRef.ns.ref = nsAppender

--------------------------------------------------------------------------------------------------------------------

property.path = ${sys:catalina.base}/logs
property.pattern = %d{yyyy-MM-dd HH:mm:ss.SSS} %level %t %c %X{uniqID} methodName=%M%X{responseCode}%X{responseTime} {{{ %msg }}} %n

############-------APPENDERS-------############
# ConsoleAppender will print logs on console
appender.console.type = Console
appender.console.name = consoleLogger
appender.console.target = SYSTEM_OUT
appender.console.layout.type = PatternLayout
appender.console.layout.pattern = ${pattern}

#Appender for ecommws
appender.ecommws.type = RollingFile
appender.ecommws.name = ecommWsAppender
appender.ecommws.fileName= ${path}/ecommws.log
appender.ecommws.filePattern=${path}/ecommws.log.%d{yyyy-MM-dd}
appender.ecommws.layout.type= PatternLayout
appender.ecommws.layout.pattern= ${pattern}
appender.ecommws.policies.type = Policies
appender.ecommws.policies.time.type = TimeBasedTriggeringPolicy


############-------LOGGERS-------############
#Logger for ecommws
logger.ecommws.name = ge.ufc.ecomm.ws
logger.ecommws.level = trace
logger.ecommws.additivity = false
logger.ecommws.appenderRef.ecommws.ref = ecommWsAppender
logger.ecommws.appenderRef.console.ref = consoleLogger




     */
}
