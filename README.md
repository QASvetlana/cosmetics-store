# Пример создания автотестов для сайта 
# косметической компании [Oriflame](https://www.oriflame.ru/)

В данном проекте представлен пример создания UI автотестов для web-версии сайта
https://www.oriflame.ru
## Тестируемая область:

- [x] Title главной страницы;
- [x] Поле поиска;
- [x] Добавление товара в корзину.

## Использован стек технологий:

<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Java.svg" width="40"/> Java для написания кода
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg" width="40"/> Selenide для написания кода
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Selenoid.svg" width="40"/> Selenoid запуск автотестов в изолированных сессиях на билд-сервере
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Allure_Report.svg" width="40"/> Allure Report для создания отчетности
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg" width="40"/> JUnit для написания кода
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg" width="40"/> Gradle для сборки
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Jenkins.svg" width="40"/> Jenkins для запуска автотестов на удаленном сервере
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg" width="40"/> Allure TestOps для создания документации
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width="40"/> Telegram бот для уведомлений

# Конфигурация для запуска тестов
Параметры для запуска автотестов в удаленном браузере на билд-сервере проекта
autotests.cloud задаются в настройках job CI Jenkins в виде Choice Parameter 
и передаются в код проекта через терминал как системные переменные (в фигурных скобках) с помощью следующих команд:

```bash
clean
test
-Dbrowser=${BROWSER} // запускаемый браузер
-DbrowserVersion=${BROWSER_VERSION} // версия браузера
-DbrowserSize=${BROWSER_SIZE} // размер окна браузера
-DremoteDriverUrl=https://<username>:<password>@${REMOTE_DRIVER_URL}/wd/hub/ // URL сервера, на котором запускаются тесты
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/ // URL сервера с видеофайлами выполнения тестов
-Dthreads=${THREADS} // число потоков для прогона тестов
allure serve build/allure-results Генерация отчета
```
### Для запуска автотестов на удаленной машине использован bild server Jenkins
![image](src/test/resources/files/jenkins.jpg)
### Тестовая документация хранится в Allure TestOpts
![image](src/test/resources/files/allure_testopt.jpg)
### Отчетность генерируется с помощью Allure reports
![image](src/test/resources/files/allure.jpg)
### Уведомления о результатах тестирования уходят в Telegram
![image](src/test/resources/files/telegram.jpg)
### Видеотчет теста "Поиск товара"
![image](src/test/resources/files/Video.gif)






