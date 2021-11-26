# Пример создания автотестов для сайта 
# косметической компании [Oriflame](https://www.oriflame.ru/)

В данном проекте представлен пример создания UI автотестов для web-версии сайта
https://www.oriflame.ru
## Тестируемая область:

- [ ]  Title главной страницы;
- [ ] Поле поиска;
- [ ] Добавление товара в корзину.

## Использован стек технологий:

<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Intelij_IDEA.svg" width="40"/>
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Java.svg" width="40"/>
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg" width="40"/>
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Selenoid.svg" width="40"/>
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Allure_Report.svg" width="40"/>
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg" width="40"/>
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg" width="40"/>
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Github.svg" width="40"/>
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Jenkins.svg" width="40"/>
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg" width="40"/>
<img alt="This is an image" height="40" src="https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width="40"/>

# Конфигурация для запуска тестов
Параметры для запуска автотестов в удаленном браузере на билд-сервере проекта
autotests.cloud задаются в настройках job CI Jenkins в виде Choice Parameter 
и передаются в код проекта через терминал как системные переменные (в фигурных скобках) с помощью следующих команд:
Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/%s">jenkins.autotests.cloud/job/%s</a>


# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


###### For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
