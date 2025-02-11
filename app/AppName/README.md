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