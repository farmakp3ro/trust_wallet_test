# Trust Wallet Test Automation

This project contains automated UI tests for the Trust Wallet Android app, written in Java using Appium and TestNG.

## 📁 Project Structure

```
trust_wallet_test/
├── sample-mobile-framework-main/
│   ├── src/
│   │   ├── tests/                  # Contains test classes (e.g., WalletTest.java)
│   │   ├── utils/                  # Driver setup and helper classes
│   ├── pom.xml                     # Maven dependencies and build configuration
│   ├── latest.apk                 # APK of the Trust Wallet app (place here)
│   └── README.md                  # This file
```

## ⚙️ Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/farmakp3ro/trust_wallet_test.git
   cd trust_wallet_test/sample-mobile-framework-main
   ```

2. **Place the APK:**
   - Download the latest Trust Wallet APK.
   - Place it in the `sample-mobile-framework-main/` directory and rename it to `latest.apk`.

3. **Configure Appium Capabilities:**
   The `WalletTest.java` file is configured to dynamically load the APK from the project directory:
   ```java
   capabilities.setCapability("app", System.getProperty("user.dir") + "\\latest.apk");
   ```

4. **Install dependencies:**
   Make sure you have [Maven](https://maven.apache.org/) installed, then run:
   ```bash
   mvn clean install
   ```

5. **Start Appium server:**
   Use Appium Desktop or run:
   ```bash
   appium
   ```

6. **Run tests:**
   From IntelliJ or using the terminal:
   ```bash
   mvn test
   ```

## ✅ Test Scenarios

The `WalletTest` class currently automates the **Create Wallet** flow including:

- Clicking "Create New Wallet"
- Handling permission prompts (deny update, enable notifications)
- Biometric login screen interaction
- Skipping optional setup

## 🧪 Tools Used

- Java 8
- Maven
- Appium
- TestNG
- Android Emulator or Real Device

## 📌 Notes

- Ensure your device/emulator is running and visible via `adb devices`.
- Update desired capabilities as needed in `DriverUtils.java`.
