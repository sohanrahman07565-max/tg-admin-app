# Files & Links Admin Android App

এই Android Studio project ফোনের অ্যাপের মধ্যে আপনার Netlify সাইটটি খুলবে:
https://quiet-panda-21b06f.netlify.app/

## APK তৈরি করার ধাপ
1. কম্পিউটারে Android Studio ইনস্টল করুন।
2. এই ZIP Extract করে Android Studio-তে `TG-Admin-WebView-Android` ফোল্ডারটি Open করুন।
3. Gradle Sync সম্পন্ন হতে দিন এবং Android SDK Platform 35 ইনস্টল করতে বললে ইনস্টল করুন।
4. মেনু থেকে **Build → Build Bundle(s) / APK(s) → Build APK(s)** নির্বাচন করুন।
5. APK সাধারণত `app/build/outputs/apk/debug/app-debug.apk`-এ তৈরি হবে।
6. APK ফোনে পাঠিয়ে খুলুন; প্রয়োজনে Android Settings-এ ওই অ্যাপের জন্য “Install unknown apps” অনুমতি দিন।

এটি WebView wrapper: সাইটের ডেটা/লগইন Netlify ও সাইটের বর্তমান ব্যবস্থার ওপর নির্ভর করবে। এই ZIP APK নয়; Android Studio দিয়ে APK build করতে হবে।

## GitHub-এ push করলেই APK build

1. ZIP extract করে সব ফাইল GitHub repository-র root-এ upload করুন (শুধু ZIP ফাইলটি নয়)।
2. `.github/workflows/build-apk.yml` ফাইলটি অবশ্যই repository-তে থাকবে।
3. repository-র `main` বা `master` branch-এ push করুন।
4. GitHub repository → **Actions** → **Build Android APK**-তে build status দেখুন।
5. সফল হলে workflow run খুলে **Artifacts** অংশ থেকে `files-links-admin-debug-apk` ডাউনলোড করুন; ZIP-এর ভেতরে `app-debug.apk` থাকবে।

এটি unsigned/debug APK; নিজের ফোনে পরীক্ষা/ইনস্টল করার জন্য। Google Play release-এর জন্য আলাদা signed release build ও signing secrets দরকার।
