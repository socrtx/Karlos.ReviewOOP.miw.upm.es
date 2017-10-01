@echo off
echo -----------------------------------------
echo . (C) MIW -UPM
echo -----------------------------------------
echo .
set workspace=C:\Users\maste\eclipse-workspace\Karlos.ReviewOOP.miw.upm.es
echo .
cd %workspace%
echo ============ mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml ... ==================
echo . Se prepara cobertura
call mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml

echo ============ mvn sonar:sonar ... =======================================================
echo . Se analiza y sube a sonar cloud
call mvn sonar:sonar -X -Dsonar.organization=socrtx-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=c06709df355eb7bcf85366c2d1be19d0c02db55b --settings settings.xml
pause