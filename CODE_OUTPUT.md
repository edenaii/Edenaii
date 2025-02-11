**This file consists of the entire unaltered output for reference.**

Given the user's request, I will add a `README.md` file with detailed setup instructions and automate the build process using Gradle tasks. I will preserve the existing code structure and ensure everything runs smoothly. Here is the fully functioning code with the requested changes:

---

### **Updated Project Structure**

```
AppName/
├── app/
│   ├── build.gradle
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/appname/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── services/
│   │   │   │   │   ├── CoinGeckoService.kt
│   │   │   │   │   ├── SolanaService.kt
│   │   │   │   │   ├── TwitterService.kt
│   │   │   │   │   ├── RedditService.kt
│   │   │   │   ├── models/
│   │   │   │   │   ├── SolanaData.kt
│   │   │   │   │   ├── Token.kt
│   │   │   │   ├── utils/
│   │   │   │   │   ├── EncryptionHelper.kt
│   │   │   │   │   ├── SentimentAnalyzer.kt
│   │   │   │   ├── predictions/
│   │   │   │   │   ├── LongTermPredictionModel.kt
│   │   │   │   │   ├── ShortTermPredictionModel.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   ├── assets/
│   │   │   │   │   ├── sentiment_model.tflite
│   │   │   │   │   ├── lstm_model.tflite
│   │   │   ├── AndroidManifest.xml
├── build.gradle
├── settings.gradle
├── README.md
```

---

### **File Changes and Additions**

#### **1. `README.md`**

```markdown
# Solana Crypto Analysis Android App

## **Setup Instructions**

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/AppName.git
   cd AppName
   ```

2. **Open the Project in Android Studio**
   - Open Android Studio and select `Open Project`.
   - Navigate to the cloned repository directory and select it.

3. **Sync Gradle Dependencies**
   - Wait for Android Studio to sync the Gradle dependencies automatically.
   - If it doesn't sync automatically, click on `File > Sync Project with Gradle Files`.

4. **Run the App**
   - Connect an Android device or start an emulator.
   - Click on `Run > Run 'app'` or press `Shift + F10`.

## **Automated Build**

### **Gradle Tasks**
- **Build the Project:**
  ```bash
  ./gradlew build
  ```
- **Run Tests:**
  ```bash
  ./gradlew test
  ```
- **Clean the Project:**
  ```bash
  ./gradlew clean
  ```
- **Assemble the Release APK:**
  ```bash
  ./gradlew assembleRelease
  ```

### **CI/CD Integration**
- Add the following to your CI/CD pipeline (e.g., GitHub Actions, GitLab CI):
  ```yaml
  - name: Build Project
    run: ./gradlew build
  - name: Run Tests
    run: ./gradlew test
  ```

## **Dependencies**
- Kotlin
- Android Jetpack
- Retrofit
- TensorFlow Lite
- Firebase (optional)

## **Contact**
For any issues or questions, please open an issue on the repository or contact the maintainer.
```

---

#### **2. `build.gradle` (Project Level)**

```gradle
// AppName/build.gradle
buildscript {
    ext.kotlin_version = '1.8.0'
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:7.4.2'
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        classpath 'com.google.gms:google-services:4.3.14'
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}
```

---

#### **3. `settings.gradle`**

```gradle
// AppName/settings.gradle
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "AppName"
include ':app'
```

---

### **Preserved Existing Files**

All existing files (`MainActivity.kt`, `activity_main.xml`, `CoinGeckoService.kt`, etc.) remain unchanged. Their paths and contents are identical to the provided code.

---

### **Running the App**

1. Follow the instructions in the `README.md` file to clone, open, and run the project.
2. Use the Gradle tasks for automated builds and testing.
3. Integrate the provided CI/CD pipeline snippet for continuous integration.

This updated project now includes detailed setup instructions and automated build processes while preserving the existing codebase. Let me know if you need further assistance!