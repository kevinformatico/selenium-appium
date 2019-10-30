$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 3,
  "name": "Iniciar Sesion",
  "description": "",
  "id": "iniciar-sesion",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Hacer Login",
  "description": "",
  "id": "iniciar-sesion;hacer-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TestCaseKey\u003dFAL-T1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "existen los campos",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "ingreso usuario\u003cuser\u003e y contraseña\u003cpass\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "hago click en boton ingresar",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "iniciar-sesion;hacer-login;",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ],
      "line": 12,
      "id": "iniciar-sesion;hacer-login;;1"
    },
    {
      "cells": [
        "\"ivan.mmeneses28@gmail.com\"",
        "\"12345\""
      ],
      "line": 13,
      "id": "iniciar-sesion;hacer-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Hacer Login",
  "description": "",
  "id": "iniciar-sesion;hacer-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 5,
      "name": "@TestCaseKey\u003dFAL-T1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "existen los campos",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "ingreso usuario\"ivan.mmeneses28@gmail.com\" y contraseña\"12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "hago click en boton ingresar",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDef.existen_los_campos()"
});
formatter.result({
  "duration": 16808557600,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-4T1H1KL\u0027, ip: \u0027192.168.133.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:\\Users\\i7\\Desktop\\PROYECT..., appActivity: com.flipkart.android.Splash..., appPackage: com.flipkart.android, appWaitActivity: com.flipkart.android.Splash..., appWaitPackage: com.flipkart.android, databaseEnabled: false, desired: {app: C:\\Users\\i7\\Desktop\\PROYECT..., deviceName: Samsung Galaxy S7, platformName: android, udid: 192.168.133.101:5555}, deviceManufacturer: Genymotion, deviceModel: Samsung Galaxy S7, deviceName: 192.168.133.101:5555, deviceScreenSize: 1440x2560, deviceUDID: 192.168.133.101:5555, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, platform: LINUX, platformName: Android, platformVersion: 7.1.1, takesScreenshot: true, udid: 192.168.133.101:5555, warnings: {}, webStorageEnabled: false}\nSession ID: c6995a00-ffb1-46e7-9b28-cff5677c6632\n*** Element info: {Using\u003did, value\u003dcom.flipkart.android:id/mainMenu}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:231)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementById(DefaultGenericMobileDriver.java:70)\r\n\tat io.appium.java_client.AppiumDriver.findElementById(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementById(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat pages.LoginPage.abrirMenu(LoginPage.java:105)\r\n\tat definitions.LoginDef.existen_los_campos(LoginDef.java:22)\r\n\tat ✽.Given existen los campos(Login.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "ivan.mmeneses28@gmail.com",
      "offset": 16
    },
    {
      "val": "12345",
      "offset": 56
    }
  ],
  "location": "LoginDef.ingreso_usuario_y_contraseña(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginDef.hago_click_en_boton_ingresar()"
});
formatter.result({
  "status": "skipped"
});
});