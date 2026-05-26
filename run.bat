@echo off
setlocal

cd /d "%~dp0"

if not exist build mkdir build

javac -d build src\*.java
if errorlevel 1 (
    echo.
    echo Build gagal. Periksa error kompilasi di atas.
    pause
    exit /b 1
)

java -cp build Main
pause