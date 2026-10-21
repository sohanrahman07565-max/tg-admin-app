plugins {
id("com.android.application")
id("org.jetbrains.kotlin.android")
}

android {
namespace = "com.sohan.tgadmin"
compileSdk = 35

defaultConfig {
    applicationId = "com.sohan.tgadmin"
    minSdk = 23
    targetSdk = 35
    versionCode = 1
    versionName = "1.0"
}

compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlinOptions {
    jvmTarget = "17"
}

}

dependencies {
implementation("androidx.activity:activity-ktx:1.10.1")
}
