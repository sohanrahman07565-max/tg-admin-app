# TG Admin WebView Android অ্যাপ

এই Android project `https://quiet-panda-21b06f.netlify.app/` সাইটটিকে অ্যাপের ভিতরে খুলবে। GitHub Actions-এ `main` বা `master` branch-এ push করলে Debug APK build হবে।

## GitHub-এ আপলোড (Termux)

1. ZIP extract করে project folder-এ ঢুকুন।
2. GitHub repository `sohanrahman07565-max/tg-admin-app`-এ project-এর ফাইলগুলো রাখুন।
3. চালান:

```bash
git add .
git commit -m "Prepare Android APK workflow"
git push
```

## APK ডাউনলোড

GitHub repository → Actions → সর্বশেষ সফল `Build Android APK` run → Artifacts → `android-debug-apk`। ZIP artifact extract করলে `app-debug.apk` পাওয়া যাবে।

## নোট

- এটি Debug APK; Play Store release signing-এর জন্য আলাদা release keystore ও workflow প্রয়োজন।
- Build সফল হওয়া GitHub Actions run থেকে যাচাই করতে হবে।
